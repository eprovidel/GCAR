package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import util.Consulta;
import util.Ejercicio;
import util.Respuesta;
import util.Resultado;

@ManagedBean(name = "resultado")
@SessionScoped
public class ResultadoDAO {

	static Connection con = null;
    static PreparedStatement ps = null;
    static Statement cs = null;
    
	public static Respuesta revisarRespuesta(Respuesta respuesta, Ejercicio ejercicio){
		try{
			String query = 	"(select * from "+ respuesta.getBd() + "." + ejercicio.getRespuesta() +
							" except " +
							"select * from load" + respuesta.getRut() + "." + ejercicio.getRespuestaAlumno() + ")" +
							" union " +
							"(select * from load" + respuesta.getRut() + "." + ejercicio.getRespuestaAlumno() +
							" except " +
							"select * from " + respuesta.getBd() + "." + ejercicio.getRespuesta() + ")";
			System.out.println("Query: " + query);
			
			con = Database.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			if(!rs.next()){
				respuesta.setResultado(true);
			}else{
				respuesta.setResultado(false);
			}
			
			return respuesta;
		} catch (Exception ex) {
			respuesta.setResultado(false);
			System.out.println("Error en revisarRespuesta() -->" + ex.getMessage());
			return respuesta;
        } finally {
        	Database.close(con);
        }
	}
	
	public static boolean guardarResultado(Resultado resultado){
		try{
			String query = 	"insert into resultados (bd,fecha_bd,cant_ejercicios,cant_correctas,cant_erroneas,cant_omitidas,fecha) values " +
							"(?,?,?,?,?,?,(select current_timestamp))";
			System.out.println("Query: " + query);
			
			con = Database.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1,resultado.getBd());
			ps.setTimestamp(2,resultado.getFechaBd());
			ps.setInt(3,resultado.getCantEjercicios());
			ps.setInt(4,resultado.getCantCorrectas());
			ps.setInt(5,resultado.getCantErroneas());
			ps.setInt(6,resultado.getCantOmitidas());
			ps.execute();
			
			return true;
		} catch (Exception ex) {
			System.out.println("Error en guardarResultado() -->" + ex.getMessage());
			return false;
        } finally {
        	Database.close(con);
        }
	}
	
	public static boolean guardarRespuestas(List<Respuesta> respuestas){
		try{
			
			for(Respuesta r : respuestas){
			
				String query = 	"insert into respuestas (rut,bd,fecha_bd,ejercicio,resultado,intento,tiempo_ejercicio,tiempo_sesion,fecha) values " +
						"(?,?,?,?,?,?,?,?,(select current_timestamp))";
				System.out.println("Query: " + query);
				
				Time tiempoEjercicio = new Time(r.getTiempoEjercicio().getTimeInMillis());
				Time tiempoSesion = new Time(r.getTiempoSesion().getTimeInMillis());
				
				con = Database.getConnection();
				ps = con.prepareStatement(query);
				ps.setString(1,r.getRut());
				ps.setString(2,r.getBd());
				ps.setTimestamp(3,r.getFechaBd());
				ps.setInt(4,r.getEjercicio());
				ps.setBoolean(5,r.isResultado());
				ps.setInt(6,r.getIntento());
				ps.setTime(7,tiempoEjercicio);
				ps.setTime(8,tiempoSesion);
				ps.execute();
				
				System.out.println("Respuesta " + r.getEjercicio() + "." + r.getIntento() + "guardada");
				
				for(Consulta c : r.getConsultas()){
					
					query = "insert into consultas (id_respuestas,numero,query,error,fecha) values " +
							"((select last_value from sec_respuestas),?,?,?,(select current_timestamp))";
					System.out.println("Query: " + query);
					
					ps = con.prepareStatement(query);
					ps.setInt(1,c.getNumero());
					ps.setString(2,c.getQuery());
					ps.setString(3,c.getError());
					ps.execute();
					
					System.out.println("Consulta " + c.getQuery() + "insertada ");
					
				}
				
			}
			
			System.out.println("Respuestas guardadas");

			return true;
			
		}catch(Exception ex){
			System.out.println("Error en guardarRespuestas() -->" + ex.getMessage());
			return false;
        }finally{
        	Database.close(con);
        }
	}
	
	public static List<Resultado> cargarResultado(String bd, String fecha){
		try{
			String query = 	"select * from resultados where bd = ? and fecha_bd = '" + fecha + "'";
			System.out.println("Query: " + query);
			
			con = Database.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1,bd);
			ResultSet rs = ps.executeQuery();
			
			List<Resultado> resultados = new ArrayList<Resultado>();
			
			while(rs.next()){
				Resultado r = new Resultado();
				r.setBd(rs.getString(2));
				r.setFechaBd(rs.getTimestamp(3));
				r.setCantEjercicios(rs.getInt(4));
				r.setCantCorrectas(rs.getInt(5));
				r.setCantErroneas(rs.getInt(6));
				r.setCantOmitidas(rs.getInt(7));
				resultados.add(r);
			}
			
			System.out.println("Resultados Cargados");
			
			return resultados;
		} catch (Exception ex) {
			System.out.println("Error en cargarResultados() -->" + ex.getMessage());
			return null;
        } finally {
        	Database.close(con);
        }
	}
	
	public static List<Respuesta> cargarRespuestas(String bd, String fecha){
		try{
			String query = 	"select * from respuestas where bd = ? and fecha_bd = '" + fecha + "'";
			System.out.println("Query: " + query);
			
			con = Database.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1,bd);
			ResultSet rs = ps.executeQuery();
			
			List<Respuesta> respuestas = new ArrayList<Respuesta>();
			
			while(rs.next()){
				Respuesta r = new Respuesta();
				r.setRut(rs.getString(2));
				r.setBd(rs.getString(3));
				r.setFechaBd(rs.getTimestamp(4));
				r.setEjercicio(rs.getInt(5));
				r.setResultado(rs.getBoolean(6));
				r.setIntento(rs.getInt(7));
				
				Time tiempoEjercicio = rs.getTime(8);
				Calendar tiempoEjercicioCal = new GregorianCalendar();
				tiempoEjercicioCal.setTimeInMillis(tiempoEjercicio.getTime());
				r.setTiempoEjercicio(tiempoEjercicioCal);
				
				Time tiempoSesion = rs.getTime(9);
				Calendar tiempoSesionCal = new GregorianCalendar();
				tiempoSesionCal.setTimeInMillis(tiempoSesion.getTime());
				r.setTiempoEjercicio(tiempoEjercicioCal);
				
				query = "select * from consultas where id_respuestas = ?";
				System.out.println("Query: " + query);
				
				ps = con.prepareStatement(query);
				ps.setInt(1,rs.getInt(1));
				ResultSet rs1 = ps.executeQuery();
				
				List<Consulta> consultas = new ArrayList<Consulta>();
				
				while(rs1.next()){
					Consulta c = new Consulta();
					c.setNumero(rs1.getInt(3));
					c.setQuery(rs1.getString(4));
					c.setError(rs1.getString(5));
					consultas.add(c);
				}
				
				System.out.println("Consultas Cargadas");
				r.setConsultas(consultas);
				respuestas.add(r);
			}
			
			System.out.println("Respuestas Cargados");
			
			return respuestas;
		} catch (Exception ex) {
			System.out.println("Error en guardarResultado() -->" + ex.getMessage());
			return null;
        } finally {
        	Database.close(con);
        }
	}
	
	
	public static List<String> obtenerEsquemas(){
		try{
			String query = "select distinct bd from resultados";
			System.out.println("Query: " + query);
			
			con = Database.getConnection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			List<String> bds = new ArrayList<String>();
			
			while(rs.next()){
				String bd = rs.getString(1);
				bds.add(bd);
			}
			
			System.out.println("Cargado todos los nombres de BDs");

			return bds;
		}catch (Exception ex){
			System.out.println("Error en obtenerEsquemas() -->" + ex.getMessage());
			return null;
		}finally{
			Database.close(con);
		}
	}
	
	public static List<String> obtenerFechas(String bd){
		try{
			String query = "select distinct fecha_bd from resultados where bd=?";
			System.out.println("Query: " + query);
			
			con = Database.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1,bd);
			ResultSet rs = ps.executeQuery();
			
			List<String> fechas = new ArrayList<String>();
			
			while(rs.next()){
				String fecha = rs.getString(1);
				fechas.add(fecha);
			}
			
			System.out.println("Cargado todos las fechas");

			return fechas;
		}catch (Exception ex){
			System.out.println("Error en obtenerFechas() -->" + ex.getMessage());
			return null;
		}finally{
			Database.close(con);
		}
	}
	
//	private static void verRelacion(String res, String rel1, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			ps = con.prepareStatement(query2);
//			ps.execute();
//			
//			String query = "create  table load" + rut + "." + res + " as " + 
//						   "select * from load" + rut + "." + rel1;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//			
//		} catch (Exception ex) {
//			System.out.println("Error en verRelacion() -->" + ex.getMessage());	
//        }
//	}
//		
//	private static void union(String res, String rel1, String rel2, String rut){
//		try{
//					
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//			
//			String query = "create  table load" + rut + "." + res + " as " + 
//						   "select * from load" + rut + "." + rel1 +
//						   " union " +
//						   "select * from load" + rut + "." + rel2;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en union() -->" + ex.getMessage());	
//		}
//	}
//	
//	private static void inter(String res, String rel1, String rel2, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = "create  table load" + rut + "." + res + " as " +
//						   "select * from load" + rut + "." + rel1 +
//						   " intersect " +
//						   "select * from load" + rut + "." + rel2;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en inter() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void diferencia(String res, String rel1, String rel2, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = "create  table load" + rut + "." + res + " as " +
//						   "select * from load" + rut + "." + rel1 +
//						   " except " +
//						   "select * from load" + rut + "." + rel2;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en diferencia() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void cruz(String res, String rel1, String rel2, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = "create  table load" + rut + "." + res + " as " +
//						   "select * from load" + rut + "." + rel1 +
//						   " , load" +
//						   rut + "." + rel2;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en cruz() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void reunionNatural(String res, String rel1, String rel2, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = "create  table  load" + rut + "." + res + " as " + 
//						   "select * from load" + rut + "." + rel1 +
//						   " natural join load" +
//						   rut + "." + rel2;
//			System.out.println("Query: " + query);
//				
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en reunionNatural() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void reunionExtFull(String res, String rel1, String rel2, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = "create  table load" + rut + "." + res + " as " +
//						   "select * from load" + rut + "." + rel1 +
//					       " natural full outer join load" +
//						   rut + "." + rel2;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en reunionExtFull() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void reunionExtIzq(String res, String rel1, String rel2, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = "create  table load" + rut + "." + res + " as " +
//						   "select * from load" + rut + "." + rel1 +
//					       " natural left outer join load" +
//						   rut + "." + rel2;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en reunionExtIzq() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void reunionExtDer(String res, String rel1, String rel2, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = "create  table load" + rut + "." + res + " as " +
//						   "select * from load" + rut + "." + rel1 +
//					       " natural right outer join load" +
//						   rut + "." + rel2;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en reunionExtDer() -->" + ex.getMessage());	      
//        } 
//	}
//	
//	private static void proyectar(String res, String atributosProy, String rel, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query =	"create  table load" + rut + "." + res + " as " +
//							"select " + atributosProy + " from load" + rut + "." + rel;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en proyectar() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void seleccionar(String res, String condiciones, String rel, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query =	"create  table load" + rut + "." + res + " as " +
//							"select * from load" + rut + "." + rel + " where " + condiciones;
//			System.out.println("Query: " + query);
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en seleccionar() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static void reunion(String res, String rel1, String rel2, String condiciones, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//					
//			String query = 	"create  table load" + rut + "." + res + " as " +
//							"select * from load" + rut + "." + rel1 + " inner join load" +
//							rut + "." + rel2 + " on " + condiciones;
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en reunion() -->" + ex.getMessage());	
//        } 
//	}
//	
//	private static void renombrar(String res, String rel, String atributos, String rut){
//		try{
//			
//			String query2 = "drop table if exists load" + rut + "." + res;
//			System.out.println(query2);
//			
//			con = Database.getConnection();
//			ps = con.prepareStatement(query2);
//			ps.execute();
//			
//			String query =  "create table load" + rut + "." + res + " as " +
//							"select " + atributos + " from load" + rut + "." + rel;
//
//			ps = con.prepareStatement(query);
//			ps.execute();
//			
//		} catch (Exception ex) {
//			System.out.println("Error en renombrar() -->" + ex.getMessage());	
//        }
//	}
//	
//	private static boolean nombreValido(String query){
//		if(		/*Revisa si la relacion auxiliar contiene palabras reservadas*/
//				query.contains("seleccionar") || query.contains("SELECCIONAR") ||
//				query.contains("proyectar") ||  query.contains("PROYECTAR") ||
//				query.contains("union") || query.contains("UNION") ||
//				query.contains("inter") || query.contains("INTER") ||
//				query.contains("diferencia") || query.contains("DIFERECIA") ||
//				query.contains("cruz") || query.contains("CRUZ") ||
//				query.contains("reunion") || query.contains("REUNION") ||
//				query.contains("reunion_natural") || query.contains("REUNION_NATURAL") ||
//				query.contains("reunion_ext_izq") || query.contains("REUNION_EXT_IZQ") ||
//				query.contains("reunion_ext_der") || query.contains("REUNION_EXT_DER") ||
//				query.contains("reunion_ext_full") || query.contains("REUNION_EXT_FULL") ||
//				query.contains(":=") ||
//				/*Revisa si la relacion auxiliar es igual a una etiqueta del lenguaje*/
//				query.equals("st") || query.equals("asg") || query.equals("con") || query.equals("bin") ||
//				query.equals("select") || query.equals("proy") || query.equals("renom1") ||
//				query.equals("renom2") || query.equals("renom3") || query.equals("join") ||
//				query.equals("atts") || query.equals("conds1") || query.equals("conds2") ||
//				query.equals("con1") || query.equals("con2") || query.equals("con3") || query.equals("cons") ||
//				query.equals("num") || query.equals("att") || query.equals("rel") || query.equals("NUM") ||
//				query.equals("CAD") || query.equals("WS")		
//				){
//			return false;
//		}else{
//			return true;
//		}
//	}
// 	
//	public static Respuesta revisarRespuesta(Respuesta respuesta, String respAlumno, String respProfesor){
//    	try{
//    		//Se conecta
//    		con = Database.getConnection();
//    		
//    		//Separa las querys
//    		respAlumno = respAlumno.replaceAll("[\n\r]", ";");
//	    	respAlumno = respAlumno.replaceAll(";+", ";");
//	    	String[] respuestasAlumno = respAlumno.split(";");
//	    	String[] respuestasProfesor = respProfesor.split(";");
//	    	
//	    	String finalAlumno;
//	    	String finalProfesor;
//	    	
//	    	
//	    	ELContext elContext = FacesContext.getCurrentInstance().getELContext();
//			UserBean userBean = (UserBean) FacesContext.getCurrentInstance().getApplication()
//				    .getELResolver().getValue(elContext, null, "userBean");
//	    	
//	    	//Se prepara para lanzar las consultas del alumno
//	    	for(int j = 1 ; j <= respuestasAlumno.length - 1 ; j++){
//	    		String query = respuestasAlumno[j];
//				AlgebraRelacionalLexer lexer = new AlgebraRelacionalLexer(new ANTLRStringStream(query));
//				CommonTokenStream tokens = new CommonTokenStream(lexer);
//				AlgebraRelacionalParser parser = new AlgebraRelacionalParser(tokens);
//				
//				parser.st();
//				if(parser.getNumberOfSyntaxErrors() == 0){						
//					
//					if(query.contains(":=")){
//						
//						String test[] = query.split(":=");
//						test[0] = test[0].replaceAll(" ","");
//						if(nombreValido(test[0])){
//							
//							boolean band = true;
//							if(j == respuestasAlumno.length){
//								finalAlumno = test[0];
//							}
//							
//							if(!band && (query.contains("reunion_natural") || query.contains("REUNION_NATURAL"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");	
//								
//								String aux2[] = aux1[1].split("reunion_natural|REUNION_NATURAL");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Reunion Natural");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");	
//									break;
//								}else{
//									reunionNatural(aux1[0],aux2[0],aux2[1],userBean.getRut());
//								}
//								
//								band = true;
//							}
//							if(!band && (query.contains("reunion_ext_full") || query.contains("REUNION_EXT_FULL"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");	
//								
//								String aux2[] = aux1[1].split("reunion_ext_full|REUNION_EXT_FULL");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Reunion Externa Full");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;	
//								}else{
//									reunionExtFull(aux1[0],aux2[0],aux2[1],userBean.getRut());
//								}
//								
//								band = true;
//							}
//							if(!band && (query.contains("reunion_ext_izq") || query.contains("REUNION_EXT_IZQ"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");
//								
//								String aux2[] = query.split("reunion_ext_izq|REUNION_EXT_IZQ");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Reunion Externa Izquierda");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									reunionExtIzq(aux1[0],aux2[0],aux2[1],userBean.getRut());
//								}
//								
//								band = true;
//							}
//							
//							//Asignar Reunion Derecha Externa
//							if(!band && (query.contains("reunion_ext_der") || query.contains("REUNION_EXT_DER"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");
//								
//								String aux2[] = query.split("reunion_ext_der|REUNION_EXT_DER");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Reunion Externa Derecha");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									reunionExtDer(aux1[0],aux2[0],aux2[1],userBean.getRut());
//
//								}
//
//								band = true;
//							}
//							
//							// Asignar Reunion
//							if(!band && (query.contains("reunion") || query.contains("REUNION"))){
//								
//								String aux[] = query.split(":=");
//								aux[0] = aux[0].replaceAll(" ","");
//								
//								String aux1[] = aux[1].split("reunion|REUNION");
//								aux1[0] = aux1[0].replaceAll(" ", "");
//								aux1[0] = aux1[0].replaceAll("\\)","");
//								aux1[0] = aux1[0].replaceAll("\\(","");
//								
//								
//								String aux2[] = aux1[1].split("\\(");
//								aux2[1] = aux2[1].replaceAll("\\)","");
//								aux2[2] = aux2[2].replaceAll("\\)","");
//								aux2[2] = aux2[2].replaceAll(" ","");
//								
//								System.out.println("Reunion");
//								System.out.println(aux[0]);
//								System.out.println(aux1[0]);
//								System.out.println(aux2[2]);
//								System.out.println(aux2[1]);
//								
//														
//								if(aux[0].equals(aux1[0]) || aux[0].equals(aux2[2])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									reunion(aux[0],aux1[0],aux2[2],aux2[1],userBean.getRut());					
//								}
//
//								band = true;
//							}
//
//							//Asignar Union
//							if(!band && (query.contains("union") || query.contains("UNION"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");	
//								
//								String aux2[] = aux1[1].split("union|UNION");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Union");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									union(aux1[0],aux2[0],aux2[1],userBean.getRut());	
//								}
//
//								band = true;
//					
//							}
//							
//							//Asignar Interseccion	
//							if(!band && (query.contains("inter") || query.contains("INTER"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");	
//								
//								String aux2[] = aux1[1].split("inter|INTER");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Interseccion");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									inter(aux1[0],aux2[0],aux2[1],userBean.getRut());									
//								}
//								
//								band = true;
//							}
//							
//							//Asignar Diferencia
//							if(!band && (query.contains("diferencia") || query.contains("DIFERENCIA"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");	
//								
//								String aux2[] = aux1[1].split("diferencia|DIFERENCIA");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Diferencia");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									diferencia(aux1[0],aux2[0],aux2[1],userBean.getRut());
//								}
//								
//								band = true;
//							}	
//							//Asignar Producto Cruz
//							if(!band && (query.contains("cruz") || query.contains("CRUZ"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");	
//								
//								String aux2[] = aux1[1].split("cruz|CRUZ");
//								aux2[0] = aux2[0].replaceAll(" ", "");
//								aux2[1] = aux2[1].replaceAll(" ", "");
//								
//								System.out.println("Producto Cruz");
//								System.out.println(aux1[0]);
//								System.out.println(aux2[0]);
//								System.out.println(aux2[1]);
//								
//								if(aux1[0].equals(aux2[0]) || aux1[0].equals(aux2[1])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									cruz(aux1[0],aux2[0],aux2[1],userBean.getRut());
//								}
//								
//								band = true;						
//							}
//							
//							// Asignar Proyeccion
//							if(!band && (query.contains("proyectar") || query.contains("PROYECTAR"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");
//								
//								String aux[] = aux1[1].split("\\(");
//								aux[1] = aux[1].replaceAll(" ", "");
//								aux[1] = aux[1].replaceAll("\\)","");
//								
//								aux[2] = aux[2].replaceAll(" ", "");
//								aux[2] = aux[2].replaceAll("\\)","");
//								
//								System.out.println("Proyectar");
//								System.out.println(aux[1]);
//								System.out.println(aux[2]);
//								
//								if(aux1[0].equals(aux[2])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									proyectar(aux1[0],aux[1],aux[2],userBean.getRut());
//								}
//								
//								band = true;
//							}
//							
//							// Asignar Seleccionar
//							if(!band && (query.contains("seleccionar") || query.contains("SELECCIONAR"))){
//								
//								String aux1[] = query.split(":=");
//								aux1[0] = aux1[0].replaceAll(" ","");
//								
//								String aux[] = aux1[1].split("\\(");
//								aux[1] = aux[1].replaceAll("\\)","");
//
//								aux[2] = aux[2].replaceAll(" ", "");
//								aux[2] = aux[2].replaceAll("\\)","");
//								
//								System.out.println("Seleccionar");
//								System.out.println(aux[1]);
//								System.out.println(aux[2]);
//								
//								if(aux1[0].equals(aux[2])){
//									respuesta.setError("Variable asignada recursivamente");
//									break;
//								}else{
//									seleccionar(aux1[0],aux[1],aux[2],userBean.getRut());
//								}
//
//								band = true;
//							}
//							
//							// Asignar Renombrar
//							if(!band && (query.contains("renombrar") || query.contains("RENOMBRAR"))){
//							
//								String aux3[] = query.split(":=");
//								aux3[0] = aux3[0].replaceAll(" ","");
//								
//								String aux[] = aux3[1].split("renombrar|RENOMBRAR");
//								String aux1[] = aux[1].split("\\(");
//								aux1[0] = aux1[0].replaceAll(" ","");	
//								aux1[1] = aux1[1].replaceAll("\\)","");
//								aux1[1] = aux1[1].replaceAll(" ","");
//								
//								if(aux1[0].equals("")){
//									// Sólo renombra los atributos
//									
//									aux1[2] = aux1[2].replaceAll("\\)","");
//									aux1[2] = aux1[2].replaceAll(" ","");
//									
//									EsquemaBean esquemaBean = (EsquemaBean) FacesContext.getCurrentInstance().getApplication()
//										    .getELResolver().getValue(elContext, null, "bd");
//									
//									RelacionBean relacion = esquemaBean.getRelacion(aux1[2]);
//									String[] atributos = aux1[1].split(",");
//									
//									if(relacion != null && atributos.length == relacion.getAtributos().size()){
//										
//										String att = "";
//										for(int i = 0 ; i < atributos.length ; i++){
//											atributos[i] = relacion.getAtributos().get(i).getNombre() + " as " + atributos[i];		
//											att = att + atributos[i] + ",";
//										}
//										att = att.substring(0,att.length()-1);
//										
//										System.out.println("Renombra los Atributos");
//										System.out.println(aux3[0]);
//										System.out.println(relacion.getNombre());
//										System.out.println(att);
//										
//										if(aux3[0].equals(relacion.getNombre())){
//											respuesta.setError("Variable asignada recursivamente");
//											break;
//										}else{
//											renombrar(aux3[0],relacion.getNombre(),att,userBean.getRut());
//										}
//										
//									}else{
//										respuesta.setError("Relacion a renombrar no existe o los atributos a renombrar no concuerdan");
//										break;
//									}
//										
//								}else{
//									// Renombra relacion	
//									if(aux1.length == 3){
//										
//										
//										aux1[2] = aux1[2].replaceAll("\\)","");
//										aux1[2] = aux1[2].replaceAll(" ","");
//										
//										EsquemaBean esquemaBean = (EsquemaBean) FacesContext.getCurrentInstance().getApplication()
//											    .getELResolver().getValue(elContext, null, "bd");
//										
//										RelacionBean relacion = esquemaBean.getRelacion(aux1[2]);
//										String[] atributos = aux1[1].split(",");
//										
//										if(relacion != null && atributos.length == relacion.getAtributos().size()){
//											
//											String att = "";
//											for(int i = 0 ; i < atributos.length ; i++){
//												atributos[i] = relacion.getAtributos().get(i).getNombre() + " as " + atributos[i];		
//												att = att + atributos[i] + ",";
//											}
//											att = att.substring(0,att.length()-1);
//											
//											System.out.println("Renombra la Relacion y los Atributos");
//											System.out.println(aux3[0]);
//											System.out.println(aux1[0]);
//											System.out.println(att);
//											System.out.println(relacion.getNombre());
//											
//											if(aux3[0].equals(relacion.getNombre())){
//												respuesta.setError("Variable asignada recursivamente");
//												break;
//											}else{
//												renombrar(aux3[0],relacion.getNombre(),att,userBean.getRut());
//												
//											}
//											
//										}else{
//											respuesta.setError("Relacion a renombrar no existe o los atributos a renombrar no concuerdan");
//											break;
//										}
//																	
//									}else{
//										
//										EsquemaBean esquemaBean = (EsquemaBean) FacesContext.getCurrentInstance().getApplication()
//											    .getELResolver().getValue(elContext, null, "bd");
//										
//										RelacionBean relacion = esquemaBean.getRelacion(aux1[1]);
//										
//										if(relacion!= null){
//											
//											System.out.println("Renombra la Relacion");
//											System.out.println(aux3[0]);
//											System.out.println(aux1[0]);
//											System.out.println(relacion.getNombre());
//											
//											if(aux3[0].equals(relacion.getNombre())){
//												respuesta.setError("Variable asignada recursivamente");
//												break;
//											}else{
//												verRelacion(aux3[0],relacion.getNombre(),userBean.getRut());
//											}
//											
//										}else{
//											respuesta.setError("Relacion a renombrar no existe o los atributos a renombrar no concuerdan");
//											break;
//										}
//									}						
//								}
//								
//								band = true;
//								
//							}
//							
//						}else{
//							respuesta.setError("Consulta utiliza Tokens");
//							break;
//						}
//						
//					}else{
//						respuesta.setError("Consulta sin Asignar");
//						break;
//					}
//					
//				}else{
//					respuesta.setError("Error de Sintaxis");
//					break;
//				}
//				
//			}//Termina el For
//	    	
//	    	
//	    	
//	    		
//	    	return respuesta;
//    	} catch (Exception ex) {
//			System.out.println("Error en revisasrRespuesta() -->" + ex.getMessage());	
//			return respuesta;
//		} finally {
//			Database.close(con);
//		}
//	}
}

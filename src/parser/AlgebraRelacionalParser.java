package parser;

// $ANTLR 3.5.1 D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g 2014-09-10 15:43:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AlgebraRelacionalParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAD", "NUM", "WS", "'!='", "'('", 
		"')'", "','", "'-'", "'.'", "':='", "'<'", "'<='", "'='", "'>'", "'>= '", 
		"'AND'", "'CRUZ'", "'DIFERENCIA'", "'DIVISION'", "'INTER'", "'OR'", "'PROYECTAR'", 
		"'RENOMBRAR'", "'REUNION'", "'REUNION_EXT_DER'", "'REUNION_EXT_FULL'", 
		"'REUNION_EXT_IZQ'", "'REUNION_NATURAL'", "'SELECCIONAR'", "'UNION'", 
		"'\\u0027'", "'and'", "'cruz'", "'diferencia'", "'division'", "'inter'", 
		"'or'", "'proyectar'", "'renombrar'", "'reunion'", "'reunion_ext_der'", 
		"'reunion_ext_full'", "'reunion_ext_izq'", "'reunion_natural'", "'seleccionar'", 
		"'union'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int CAD=4;
	public static final int NUM=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AlgebraRelacionalParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AlgebraRelacionalParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AlgebraRelacionalParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g"; }



	// $ANTLR start "st"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:3:1: st : ( asg | con ) ;
	public final void st() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:3:5: ( ( asg | con ) )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:3:7: ( asg | con )
			{
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:3:7: ( asg | con )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CAD) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==13) ) {
					alt1=1;
				}
				else if ( ((LA1_1 >= 20 && LA1_1 <= 23)||(LA1_1 >= 28 && LA1_1 <= 31)||LA1_1==33||(LA1_1 >= 36 && LA1_1 <= 39)||(LA1_1 >= 44 && LA1_1 <= 47)||LA1_1==49) ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==8||(LA1_0 >= 25 && LA1_0 <= 26)||LA1_0==32||(LA1_0 >= 41 && LA1_0 <= 42)||LA1_0==48) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:3:9: asg
					{
					pushFollow(FOLLOW_asg_in_st13);
					asg();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:3:15: con
					{
					pushFollow(FOLLOW_con_in_st17);
					con();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "st"



	// $ANTLR start "asg"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:5:1: asg : rel ':=' con ;
	public final void asg() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:5:6: ( rel ':=' con )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:5:8: rel ':=' con
			{
			pushFollow(FOLLOW_rel_in_asg28);
			rel();
			state._fsp--;

			match(input,13,FOLLOW_13_in_asg30); 
			pushFollow(FOLLOW_con_in_asg32);
			con();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "asg"



	// $ANTLR start "con"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:1: con : ( bin | select | proy | renom1 | renom2 | renom3 | join ) ;
	public final void con() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:6: ( ( bin | select | proy | renom1 | renom2 | renom3 | join ) )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:8: ( bin | select | proy | renom1 | renom2 | renom3 | join )
			{
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:8: ( bin | select | proy | renom1 | renom2 | renom3 | join )
			int alt2=7;
			switch ( input.LA(1) ) {
			case CAD:
				{
				alt2=1;
				}
				break;
			case 32:
			case 48:
				{
				alt2=2;
				}
				break;
			case 25:
			case 41:
				{
				alt2=3;
				}
				break;
			case 26:
			case 42:
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4==8) ) {
					alt2=6;
				}
				else if ( (LA2_4==CAD) ) {
					int LA2_7 = input.LA(3);
					if ( (LA2_7==8) ) {
						int LA2_8 = input.LA(4);
						if ( (LA2_8==CAD) ) {
							int LA2_9 = input.LA(5);
							if ( (LA2_9==10) ) {
								alt2=4;
							}
							else if ( (LA2_9==9) ) {
								int LA2_11 = input.LA(6);
								if ( (LA2_11==8) ) {
									alt2=4;
								}
								else if ( (LA2_11==EOF) ) {
									alt2=5;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 8:
				{
				alt2=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:10: bin
					{
					pushFollow(FOLLOW_bin_in_con43);
					bin();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:16: select
					{
					pushFollow(FOLLOW_select_in_con47);
					select();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:25: proy
					{
					pushFollow(FOLLOW_proy_in_con51);
					proy();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:32: renom1
					{
					pushFollow(FOLLOW_renom1_in_con55);
					renom1();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:41: renom2
					{
					pushFollow(FOLLOW_renom2_in_con59);
					renom2();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:50: renom3
					{
					pushFollow(FOLLOW_renom3_in_con63);
					renom3();
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:7:59: join
					{
					pushFollow(FOLLOW_join_in_con67);
					join();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con"



	// $ANTLR start "bin"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:9:1: bin : ( rel ( 'UNION' | 'union' ) rel | rel ( 'INTER' | 'inter' ) rel | rel ( 'DIFERENCIA' | 'diferencia' ) rel | rel ( 'CRUZ' | 'cruz' ) rel | rel ( 'REUNION_NATURAL' | 'reunion_natural' ) rel | rel ( 'division' | 'DIVISION' ) rel | rel ( 'reunion_ext_izq' | 'REUNION_EXT_IZQ' ) rel | rel ( 'reunion_ext_der' | 'REUNION_EXT_DER' ) rel | rel ( 'reunion_ext_full' | 'REUNION_EXT_FULL' ) rel );
	public final void bin() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:9:6: ( rel ( 'UNION' | 'union' ) rel | rel ( 'INTER' | 'inter' ) rel | rel ( 'DIFERENCIA' | 'diferencia' ) rel | rel ( 'CRUZ' | 'cruz' ) rel | rel ( 'REUNION_NATURAL' | 'reunion_natural' ) rel | rel ( 'division' | 'DIVISION' ) rel | rel ( 'reunion_ext_izq' | 'REUNION_EXT_IZQ' ) rel | rel ( 'reunion_ext_der' | 'REUNION_EXT_DER' ) rel | rel ( 'reunion_ext_full' | 'REUNION_EXT_FULL' ) rel )
			int alt3=9;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CAD) ) {
				switch ( input.LA(2) ) {
				case 33:
				case 49:
					{
					alt3=1;
					}
					break;
				case 23:
				case 39:
					{
					alt3=2;
					}
					break;
				case 21:
				case 37:
					{
					alt3=3;
					}
					break;
				case 20:
				case 36:
					{
					alt3=4;
					}
					break;
				case 31:
				case 47:
					{
					alt3=5;
					}
					break;
				case 22:
				case 38:
					{
					alt3=6;
					}
					break;
				case 30:
				case 46:
					{
					alt3=7;
					}
					break;
				case 28:
				case 44:
					{
					alt3=8;
					}
					break;
				case 29:
				case 45:
					{
					alt3=9;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:9:8: rel ( 'UNION' | 'union' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin77);
					rel();
					state._fsp--;

					if ( input.LA(1)==33||input.LA(1)==49 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin85);
					rel();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:10:5: rel ( 'INTER' | 'inter' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin91);
					rel();
					state._fsp--;

					if ( input.LA(1)==23||input.LA(1)==39 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin99);
					rel();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:11:5: rel ( 'DIFERENCIA' | 'diferencia' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin105);
					rel();
					state._fsp--;

					if ( input.LA(1)==21||input.LA(1)==37 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin113);
					rel();
					state._fsp--;

					}
					break;
				case 4 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:12:5: rel ( 'CRUZ' | 'cruz' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin119);
					rel();
					state._fsp--;

					if ( input.LA(1)==20||input.LA(1)==36 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin127);
					rel();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:13:5: rel ( 'REUNION_NATURAL' | 'reunion_natural' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin133);
					rel();
					state._fsp--;

					if ( input.LA(1)==31||input.LA(1)==47 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin141);
					rel();
					state._fsp--;

					}
					break;
				case 6 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:14:5: rel ( 'division' | 'DIVISION' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin147);
					rel();
					state._fsp--;

					if ( input.LA(1)==22||input.LA(1)==38 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin155);
					rel();
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:15:5: rel ( 'reunion_ext_izq' | 'REUNION_EXT_IZQ' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin161);
					rel();
					state._fsp--;

					if ( input.LA(1)==30||input.LA(1)==46 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin169);
					rel();
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:16:5: rel ( 'reunion_ext_der' | 'REUNION_EXT_DER' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin175);
					rel();
					state._fsp--;

					if ( input.LA(1)==28||input.LA(1)==44 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin183);
					rel();
					state._fsp--;

					}
					break;
				case 9 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:17:5: rel ( 'reunion_ext_full' | 'REUNION_EXT_FULL' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin189);
					rel();
					state._fsp--;

					if ( input.LA(1)==29||input.LA(1)==45 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin197);
					rel();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bin"



	// $ANTLR start "select"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:20:1: select : ( 'seleccionar' | 'SELECCIONAR' ) '(' conds1 ')' '(' rel ')' ;
	public final void select() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:20:8: ( ( 'seleccionar' | 'SELECCIONAR' ) '(' conds1 ')' '(' rel ')' )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:20:10: ( 'seleccionar' | 'SELECCIONAR' ) '(' conds1 ')' '(' rel ')'
			{
			if ( input.LA(1)==32||input.LA(1)==48 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_select214); 
			pushFollow(FOLLOW_conds1_in_select215);
			conds1();
			state._fsp--;

			match(input,9,FOLLOW_9_in_select216); 
			match(input,8,FOLLOW_8_in_select217); 
			pushFollow(FOLLOW_rel_in_select218);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_select219); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "select"



	// $ANTLR start "proy"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:22:1: proy : ( 'proyectar' | 'PROYECTAR' ) '(' atts ')' '(' rel ')' ;
	public final void proy() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:22:6: ( ( 'proyectar' | 'PROYECTAR' ) '(' atts ')' '(' rel ')' )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:22:8: ( 'proyectar' | 'PROYECTAR' ) '(' atts ')' '(' rel ')'
			{
			if ( input.LA(1)==25||input.LA(1)==41 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_proy232); 
			pushFollow(FOLLOW_atts_in_proy233);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_proy234); 
			match(input,8,FOLLOW_8_in_proy235); 
			pushFollow(FOLLOW_rel_in_proy236);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_proy237); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "proy"



	// $ANTLR start "renom1"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:24:1: renom1 : ( 'renombrar' | 'RENOMBRAR' ) rel '(' atts ')' '(' rel ')' ;
	public final void renom1() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:24:8: ( ( 'renombrar' | 'RENOMBRAR' ) rel '(' atts ')' '(' rel ')' )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:24:10: ( 'renombrar' | 'RENOMBRAR' ) rel '(' atts ')' '(' rel ')'
			{
			if ( input.LA(1)==26||input.LA(1)==42 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_rel_in_renom1251);
			rel();
			state._fsp--;

			match(input,8,FOLLOW_8_in_renom1252); 
			pushFollow(FOLLOW_atts_in_renom1253);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom1254); 
			match(input,8,FOLLOW_8_in_renom1255); 
			pushFollow(FOLLOW_rel_in_renom1256);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom1257); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renom1"



	// $ANTLR start "renom2"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:26:1: renom2 : ( 'renombrar' | 'RENOMBRAR' ) rel '(' rel ')' ;
	public final void renom2() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:26:8: ( ( 'renombrar' | 'RENOMBRAR' ) rel '(' rel ')' )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:26:10: ( 'renombrar' | 'RENOMBRAR' ) rel '(' rel ')'
			{
			if ( input.LA(1)==26||input.LA(1)==42 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_rel_in_renom2271);
			rel();
			state._fsp--;

			match(input,8,FOLLOW_8_in_renom2273); 
			pushFollow(FOLLOW_rel_in_renom2274);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom2275); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renom2"



	// $ANTLR start "renom3"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:28:1: renom3 : ( 'renombrar' | 'RENOMBRAR' ) '(' atts ')' '(' rel ')' ;
	public final void renom3() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:28:8: ( ( 'renombrar' | 'RENOMBRAR' ) '(' atts ')' '(' rel ')' )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:28:10: ( 'renombrar' | 'RENOMBRAR' ) '(' atts ')' '(' rel ')'
			{
			if ( input.LA(1)==26||input.LA(1)==42 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_renom3288); 
			pushFollow(FOLLOW_atts_in_renom3289);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom3290); 
			match(input,8,FOLLOW_8_in_renom3291); 
			pushFollow(FOLLOW_rel_in_renom3292);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom3293); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renom3"



	// $ANTLR start "join"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:30:1: join : '(' rel ')' ( 'reunion' | 'REUNION' ) '(' conds2 ')' '(' rel ')' ;
	public final void join() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:30:6: ( '(' rel ')' ( 'reunion' | 'REUNION' ) '(' conds2 ')' '(' rel ')' )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:30:8: '(' rel ')' ( 'reunion' | 'REUNION' ) '(' conds2 ')' '(' rel ')'
			{
			match(input,8,FOLLOW_8_in_join301); 
			pushFollow(FOLLOW_rel_in_join302);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_join303); 
			if ( input.LA(1)==27||input.LA(1)==43 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_join309); 
			pushFollow(FOLLOW_conds2_in_join310);
			conds2();
			state._fsp--;

			match(input,9,FOLLOW_9_in_join311); 
			match(input,8,FOLLOW_8_in_join312); 
			pushFollow(FOLLOW_rel_in_join313);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_join314); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "join"



	// $ANTLR start "atts"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:32:1: atts : att ( ',' att )* ;
	public final void atts() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:32:6: ( att ( ',' att )* )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:32:8: att ( ',' att )*
			{
			pushFollow(FOLLOW_att_in_atts322);
			att();
			state._fsp--;

			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:32:12: ( ',' att )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==10) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:32:13: ',' att
					{
					match(input,10,FOLLOW_10_in_atts325); 
					pushFollow(FOLLOW_att_in_atts327);
					att();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atts"



	// $ANTLR start "conds1"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:34:1: conds1 : cond1 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )* ;
	public final void conds1() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:34:8: ( cond1 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )* )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:34:10: cond1 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )*
			{
			pushFollow(FOLLOW_cond1_in_conds1337);
			cond1();
			state._fsp--;

			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:34:16: ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==19||LA5_0==24||LA5_0==35||LA5_0==40) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:34:17: ( 'and' | 'or' | 'AND' | 'OR' ) cond1
					{
					if ( input.LA(1)==19||input.LA(1)==24||input.LA(1)==35||input.LA(1)==40 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_cond1_in_conds1358);
					cond1();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conds1"



	// $ANTLR start "conds2"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:36:1: conds2 : cond2 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )* ;
	public final void conds2() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:36:8: ( cond2 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )* )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:36:10: cond2 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )*
			{
			pushFollow(FOLLOW_cond2_in_conds2369);
			cond2();
			state._fsp--;

			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:36:16: ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==19||LA6_0==24||LA6_0==35||LA6_0==40) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:36:17: ( 'and' | 'or' | 'AND' | 'OR' ) cond2
					{
					if ( input.LA(1)==19||input.LA(1)==24||input.LA(1)==35||input.LA(1)==40 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_cond2_in_conds2390);
					cond2();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conds2"



	// $ANTLR start "cond1"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:38:1: cond1 : ( con1 ) ;
	public final void cond1() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:38:7: ( ( con1 ) )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:38:9: ( con1 )
			{
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:38:9: ( con1 )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:38:11: con1
			{
			pushFollow(FOLLOW_con1_in_cond1403);
			con1();
			state._fsp--;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cond1"



	// $ANTLR start "cond2"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:40:1: cond2 : ( con2 | con3 ) ;
	public final void cond2() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:40:7: ( ( con2 | con3 ) )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:40:9: ( con2 | con3 )
			{
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:40:9: ( con2 | con3 )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CAD) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==12) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==CAD) ) {
						int LA7_3 = input.LA(4);
						if ( (LA7_3==7||(LA7_3 >= 14 && LA7_3 <= 18)) ) {
							int LA7_4 = input.LA(5);
							if ( (LA7_4==CAD) ) {
								alt7=1;
							}
							else if ( (LA7_4==NUM||LA7_4==11||LA7_4==34) ) {
								alt7=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:40:11: con2
					{
					pushFollow(FOLLOW_con2_in_cond2416);
					con2();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:40:17: con3
					{
					pushFollow(FOLLOW_con3_in_cond2419);
					con3();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cond2"



	// $ANTLR start "con1"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:42:1: con1 : att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons ;
	public final void con1() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:42:6: ( att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:42:8: att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons
			{
			pushFollow(FOLLOW_att_in_con1430);
			att();
			state._fsp--;

			if ( input.LA(1)==7||(input.LA(1) >= 14 && input.LA(1) <= 18) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_cons_in_con1456);
			cons();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con1"



	// $ANTLR start "con2"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:44:1: con2 : rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) rel '.' att ;
	public final void con2() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:44:6: ( rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) rel '.' att )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:44:8: rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) rel '.' att
			{
			pushFollow(FOLLOW_rel_in_con2464);
			rel();
			state._fsp--;

			match(input,12,FOLLOW_12_in_con2465); 
			pushFollow(FOLLOW_att_in_con2466);
			att();
			state._fsp--;

			if ( input.LA(1)==7||(input.LA(1) >= 14 && input.LA(1) <= 18) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_rel_in_con2492);
			rel();
			state._fsp--;

			match(input,12,FOLLOW_12_in_con2493); 
			pushFollow(FOLLOW_att_in_con2494);
			att();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con2"



	// $ANTLR start "con3"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:46:1: con3 : rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons ;
	public final void con3() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:46:6: ( rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:46:8: rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons
			{
			pushFollow(FOLLOW_rel_in_con3502);
			rel();
			state._fsp--;

			match(input,12,FOLLOW_12_in_con3503); 
			pushFollow(FOLLOW_att_in_con3504);
			att();
			state._fsp--;

			if ( input.LA(1)==7||(input.LA(1) >= 14 && input.LA(1) <= 18) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_cons_in_con3530);
			cons();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con3"



	// $ANTLR start "cons"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:48:1: cons : ( num | cad ) ;
	public final void cons() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:48:6: ( ( num | cad ) )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:48:8: ( num | cad )
			{
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:48:8: ( num | cad )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==NUM||LA8_0==11) ) {
				alt8=1;
			}
			else if ( (LA8_0==34) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:48:10: num
					{
					pushFollow(FOLLOW_num_in_cons540);
					num();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:48:16: cad
					{
					pushFollow(FOLLOW_cad_in_cons544);
					cad();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cons"



	// $ANTLR start "num"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:1: num : ( '-' )? ( NUM )+ ( '.' ( NUM )+ )? ;
	public final void num() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:6: ( ( '-' )? ( NUM )+ ( '.' ( NUM )+ )? )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:8: ( '-' )? ( NUM )+ ( '.' ( NUM )+ )?
			{
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:8: ( '-' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==11) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:9: '-'
					{
					match(input,11,FOLLOW_11_in_num557); 
					}
					break;

			}

			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:14: ( NUM )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==NUM) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:15: NUM
					{
					match(input,NUM,FOLLOW_NUM_in_num561); 
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:20: ( '.' ( NUM )+ )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==12) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:21: '.' ( NUM )+
					{
					match(input,12,FOLLOW_12_in_num565); 
					// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:24: ( NUM )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==NUM) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:50:25: NUM
							{
							match(input,NUM,FOLLOW_NUM_in_num567); 
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "num"



	// $ANTLR start "cad"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:52:1: cad : '\\u0027' CAD '\\u0027' ;
	public final void cad() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:52:6: ( '\\u0027' CAD '\\u0027' )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:52:8: '\\u0027' CAD '\\u0027'
			{
			match(input,34,FOLLOW_34_in_cad580); 
			match(input,CAD,FOLLOW_CAD_in_cad581); 
			match(input,34,FOLLOW_34_in_cad582); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cad"



	// $ANTLR start "att"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:54:1: att : CAD ;
	public final void att() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:54:6: ( CAD )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:54:8: CAD
			{
			match(input,CAD,FOLLOW_CAD_in_att593); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "att"



	// $ANTLR start "rel"
	// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:56:1: rel : CAD ;
	public final void rel() throws RecognitionException {
		try {
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:56:6: ( CAD )
			// D:\\U\\Ingenieria Civil Informatica\\6º año\\Semestre XI\\Seminario de Titulo\\Documentos\\SW\\AR\\AlgebraRelacional.g:56:8: CAD
			{
			match(input,CAD,FOLLOW_CAD_in_rel603); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rel"

	// Delegated rules



	public static final BitSet FOLLOW_asg_in_st13 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_con_in_st17 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_asg28 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_asg30 = new BitSet(new long[]{0x0001060106000110L});
	public static final BitSet FOLLOW_con_in_asg32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bin_in_con43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_in_con47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proy_in_con51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_renom1_in_con55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_renom2_in_con59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_renom3_in_con63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_in_con67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin77 = new BitSet(new long[]{0x0002000200000000L});
	public static final BitSet FOLLOW_set_in_bin79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin91 = new BitSet(new long[]{0x0000008000800000L});
	public static final BitSet FOLLOW_set_in_bin93 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin105 = new BitSet(new long[]{0x0000002000200000L});
	public static final BitSet FOLLOW_set_in_bin107 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin119 = new BitSet(new long[]{0x0000001000100000L});
	public static final BitSet FOLLOW_set_in_bin121 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin133 = new BitSet(new long[]{0x0000800080000000L});
	public static final BitSet FOLLOW_set_in_bin135 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin147 = new BitSet(new long[]{0x0000004000400000L});
	public static final BitSet FOLLOW_set_in_bin149 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin161 = new BitSet(new long[]{0x0000400040000000L});
	public static final BitSet FOLLOW_set_in_bin163 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin175 = new BitSet(new long[]{0x0000100010000000L});
	public static final BitSet FOLLOW_set_in_bin177 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin189 = new BitSet(new long[]{0x0000200020000000L});
	public static final BitSet FOLLOW_set_in_bin191 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_select209 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_select214 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_conds1_in_select215 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_select216 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_select217 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_select218 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_select219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_proy227 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_proy232 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_proy233 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_proy234 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_proy235 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_proy236 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_proy237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_renom1245 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom1251 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom1252 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_renom1253 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom1254 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom1255 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom1256 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_renom2265 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom2271 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom2273 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom2274 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom2275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_renom3283 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom3288 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_renom3289 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom3290 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom3291 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom3292 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom3293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_join301 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_join302 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_join303 = new BitSet(new long[]{0x0000080008000000L});
	public static final BitSet FOLLOW_set_in_join304 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_join309 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_conds2_in_join310 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_join311 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_join312 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_join313 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_join314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_att_in_atts322 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_atts325 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_atts327 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_cond1_in_conds1337 = new BitSet(new long[]{0x0000010801080002L});
	public static final BitSet FOLLOW_set_in_conds1340 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_cond1_in_conds1358 = new BitSet(new long[]{0x0000010801080002L});
	public static final BitSet FOLLOW_cond2_in_conds2369 = new BitSet(new long[]{0x0000010801080002L});
	public static final BitSet FOLLOW_set_in_conds2372 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_cond2_in_conds2390 = new BitSet(new long[]{0x0000010801080002L});
	public static final BitSet FOLLOW_con1_in_cond1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_con2_in_cond2416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_con3_in_cond2419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_att_in_con1430 = new BitSet(new long[]{0x000000000007C080L});
	public static final BitSet FOLLOW_set_in_con1432 = new BitSet(new long[]{0x0000000400000820L});
	public static final BitSet FOLLOW_cons_in_con1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_con2464 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_con2465 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_con2466 = new BitSet(new long[]{0x000000000007C080L});
	public static final BitSet FOLLOW_set_in_con2468 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_con2492 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_con2493 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_con2494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_con3502 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_con3503 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_con3504 = new BitSet(new long[]{0x000000000007C080L});
	public static final BitSet FOLLOW_set_in_con3506 = new BitSet(new long[]{0x0000000400000820L});
	public static final BitSet FOLLOW_cons_in_con3530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_cons540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cad_in_cons544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_num557 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUM_in_num561 = new BitSet(new long[]{0x0000000000001022L});
	public static final BitSet FOLLOW_12_in_num565 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUM_in_num567 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_34_in_cad580 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAD_in_cad581 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_cad582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAD_in_att593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAD_in_rel603 = new BitSet(new long[]{0x0000000000000002L});
}

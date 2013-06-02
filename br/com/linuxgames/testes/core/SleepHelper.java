package br.com.linuxgames.testes.core;

public class SleepHelper {

    private static final int TEMPO_1_SEGUNDO   =   1000;
	private static final int TEMPO_2_SEGUNDOS  =   2000;
	private static final int TEMPO_3_SEGUNDOS  =   3000;
	private static final int TEMPO_5_SEGUNDOS  =   5000;
    private static final int TEMPO_10_SEGUNDOS =  10000;
    private static final int TEMPO_20_SEGUNDOS =  20000;
    private static final int TEMPO_30_SEGUNDOS =  30000;
    private static final int TEMPO_1_MINUTO    =  60000;
    private static final int TEMPO_2_MINUTOS   = 120000;
    private static final int TEMPO_5_MINUTOS   = 300000;
    private static final int TEMPO_10_MINUTOS  = 600000;


	public static void sleep(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void sleep1segundo() {
		sleep(TEMPO_1_SEGUNDO);
	}

	public static void sleep2segundos() {
		sleep(TEMPO_2_SEGUNDOS);
	}

	public static void sleep3segundos() {
		sleep(TEMPO_3_SEGUNDOS);
	}

	public static void sleep5segundos() {
		sleep(TEMPO_5_SEGUNDOS);
	}

	public static void sleep10segundos() {
		sleep(TEMPO_10_SEGUNDOS);
	}
	public static void sleep20segundos() {
		sleep(TEMPO_20_SEGUNDOS);
	}
	public static void sleep30segundos() {
		sleep(TEMPO_30_SEGUNDOS);
	}
	public static void sleep1minuto() {
		sleep(TEMPO_1_MINUTO);
	}
	public static void sleep2minutos() {
		sleep(TEMPO_2_MINUTOS);
	}
	public static void sleep5minutos() {
		sleep(TEMPO_5_MINUTOS);
	}
	public static void sleep10minutos() {
		sleep(TEMPO_10_MINUTOS);
	}

}

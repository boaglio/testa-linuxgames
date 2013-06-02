package br.com.linuxgames.testes.core;


import java.util.Random;

import junit.framework.TestCase;


import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * Configuracoes principais dos testes
 *
 * @author Fernando Boaglio
 */
public abstract class LinuxGamesTestCase extends TestCase {

	    public static String TEMPO_5_SEGUNDOS = "5000";
	    public static String TEMPO_10_SEGUNDOS = "10000";
	    public static String TEMPO_20_SEGUNDOS = "20000";
	    public static String TEMPO_30_SEGUNDOS = "30000";
	    public static String TEMPO_1_MINUTO = "60000";
	    public static String TEMPO_2_MINUTOS = "120000";
	    public static String TEMPO_5_MINUTOS = "300000";
	    public static String TEMPO_10_MINUTOS = "600000";

		public Selenium selenium;

		// desenv
		public final String URL = "http://www.linuxgames.com.br";
//		public final String URL = "http://localhost:8080";

		public final String GOOGLE_URL = "http://www.google.com";

		public final String URL_CONTEXTO = URL.substring(0,URL.length()-7);

		public void setUp() {

			// IE6
//			selenium = new DefaultSelenium("localhost", 4444, "*iexplore", URL);

			// Firefox
//			selenium = new DefaultSelenium("localhost", 4444, "*firefox /usr/lib64/mozilla-firefox/firefox", URL);
			selenium = new DefaultSelenium("localhost", 4444, "*chrome /home/fb/prg/firefox2/firefox-bin", URL);
			selenium.start();

			selenium.setTimeout(TEMPO_5_MINUTOS);

		}
		public void tearDown() {
			selenium.stop();
		}


		public int getNumeroAleatorio() {
			Random r = new Random();
			int randint1 = Math.abs(r.nextInt()) % 100;
			int randint2 = Math.abs(r.nextInt()) % 100;
			int randint3 = Math.abs(r.nextInt()) % 1000;
			return randint1 + randint2 + randint3;
		}

	}


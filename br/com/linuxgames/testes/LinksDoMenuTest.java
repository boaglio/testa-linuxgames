package br.com.linuxgames.testes;

import org.junit.Test;

import junit.framework.Assert;
import br.com.linuxgames.testes.core.LinuxGamesTestCase;

public class LinksDoMenuTest extends LinuxGamesTestCase {

	@Test
	public void testeDoLinkHome() {
		selenium.open(URL + "/games/index-home");
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("Games!"));
	}
//
//	@Test
//	public void testeDoLinkForum() {
//		selenium.open(URL + "/forums/list.games");
//		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
//		Assert.assertTrue(selenium.isTextPresent("Foram enviadas um total de"));
//	}

	@Test
	public void testeDoLinkGames() {
		selenium.open(URL + "/games/todos-jogos");
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("Adventure"));
	}

	@Test
	public void testeDoLinkEmuladores() {
		selenium.open(URL + "/games/todos-emuladores");
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("MSX"));
	}

	@Test
	public void testeDoLinkArtigos() {
		selenium.open(URL + "/games/todos-artigos");
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("Viva o Linux!"));
	}

	@Test
	public void testeDoLinkSobre() {
		selenium.open(URL + "/games/sobre");
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("MySQL"));
	}


	@Test
	public void testeDoLinkContato() {
		selenium.open(URL + "/games/sugestao");
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("e-mail"));
	}


	@Test
	public void testeDoLinkEntrevista() {
		selenium.open(URL + "/games/entrevista");
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("%$#@%*"));
	}

}

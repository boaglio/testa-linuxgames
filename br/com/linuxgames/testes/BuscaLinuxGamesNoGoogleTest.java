package br.com.linuxgames.testes;

import org.junit.Test;

import junit.framework.Assert;
import br.com.linuxgames.testes.core.LinuxGamesTestCase;


public class BuscaLinuxGamesNoGoogleTest extends LinuxGamesTestCase {

	@Test
	public void testeDebusca() {

		selenium.open(GOOGLE_URL);
		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);
		selenium.type("q", "Linux Games maior site");
		selenium.click("btnG");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=*maior site de Games para Linux do Brasil");
		selenium.waitForPageToLoad(TEMPO_20_SEGUNDOS);
		Assert.assertTrue(selenium.isTextPresent("Linux Games do Brasil"));
	}
}

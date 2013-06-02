package br.com.linuxgames.testes;

import junit.framework.Assert;

import org.junit.Test;

import br.com.linuxgames.testes.core.LinuxGamesTestCase;
import br.com.linuxgames.testes.core.SleepHelper;

public class EnqueteTest extends LinuxGamesTestCase {

	@Test
	public void testeDaEnquete() {

		selenium.open(URL + "/games/index-home");
		selenium.waitForPageToLoad(TEMPO_1_MINUTO);

		selenium.click("optEnquete1");
		selenium.click("buttonVotar");

		selenium.waitForPopUp("vote", "30000");

		selenium.selectWindow("name=vote");

		SleepHelper.sleep10segundos();

		Assert.assertTrue(selenium.isTextPresent("Você já votou."));

	}

}

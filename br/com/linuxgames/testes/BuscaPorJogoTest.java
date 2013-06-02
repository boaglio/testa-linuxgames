package br.com.linuxgames.testes;

import java.awt.event.KeyEvent;

import junit.framework.Assert;

import org.junit.Test;

import br.com.linuxgames.testes.core.LinuxGamesTestCase;
import br.com.linuxgames.testes.core.SleepHelper;

public class BuscaPorJogoTest extends LinuxGamesTestCase {

	@Test
	public void testeDaBuscaPorQuake() {

		selenium.open(URL + "/games/index-home");
		selenium.waitForPageToLoad(TEMPO_1_MINUTO);

		selenium.focus("buscaStr");
		selenium.keyUpNative(Integer.toString(KeyEvent.VK_Q));
		selenium.keyUpNative(Integer.toString(KeyEvent.VK_U));
		selenium.keyUpNative(Integer.toString(KeyEvent.VK_A));
		selenium.keyUpNative(Integer.toString(KeyEvent.VK_K));
		selenium.keyUpNative(Integer.toString(KeyEvent.VK_E));
		selenium.keyUpNative(Integer.toString(KeyEvent.VK_F));

		SleepHelper.sleep5segundos();

		selenium.select("listaBusca", "label=QuakeForge");

		selenium.waitForPageToLoad(TEMPO_30_SEGUNDOS);

		Assert.assertTrue(selenium.isTextPresent("http://www.quakeforge.net/"));

	}

}

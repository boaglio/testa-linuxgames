package br.com.linuxgames.testes;

import junit.framework.Assert;

import org.junit.Test;

import br.com.linuxgames.testes.core.LinuxGamesTestCase;

public class ContatoTest extends LinuxGamesTestCase {

	@Test
	public void testeDeSugestaoDeNovoJogo() {

		selenium.open(URL + "/games/index-home");
		selenium.waitForPageToLoad(TEMPO_1_MINUTO);

		selenium.click("link=Fale*");
		selenium.waitForPageToLoad(TEMPO_1_MINUTO);

		selenium.select("tipo_id", "label=Indicar novo jogo");
		selenium.type("msg", "Teste de novo jogo!");
		selenium.type("email", "boaglio@gmail.com");
		selenium.click("opt");

		selenium.waitForPageToLoad(TEMPO_1_MINUTO);

		Assert.assertTrue(selenium.isTextPresent("E-mail sent successfully.")||
				selenium.isTextPresent("E-mail enviado com sucesso"));

	}

}

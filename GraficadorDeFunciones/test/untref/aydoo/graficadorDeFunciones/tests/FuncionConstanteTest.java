package untref.aydoo.graficadorDeFunciones.tests;

import org.junit.Assert;
import org.junit.Test;

import untref.aydoo.graficadorDeFunciones.FuncionConstante;

public class FuncionConstanteTest {

	@Test
	public void analizarEnDeberiaRetornar3CuandoConstanteEs3() {

		final float constante = 3.0f;
		float x = 10.0f;

		FuncionConstante funcionConstante = new FuncionConstante(constante);

		Assert.assertEquals(constante, funcionConstante.analizarEn(x), 0.0001);

	}

	@Test
	public void analizarEnDeberiaRetornar2CuandoConstanteEs2() {

		final float constante = 2.0f;
		float x = 10.0f;

		FuncionConstante funcionConstante = new FuncionConstante(constante);

		Assert.assertEquals(constante, funcionConstante.analizarEn(x), 0.0001);

	}
}

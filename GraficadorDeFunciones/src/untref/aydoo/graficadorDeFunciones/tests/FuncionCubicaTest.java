package untref.aydoo.graficadorDeFunciones.tests;

import org.junit.Assert;
import org.junit.Test;

import untref.aydoo.graficadorDeFunciones.FuncionCubica;

public class FuncionCubicaTest {

	@Test
	public void analizarEn2DeberiaRetornar1CuandoA0B0C1() {

		float a = 0.0f;
		float b = 0.0f;
		float c = 0.0f;
		float d = 1.0f;
		float x = 2.0f;
		float resultado = 1.0f;

		FuncionCubica funcionCubica = new FuncionCubica(a, b, c, d);

		Assert.assertEquals(resultado, funcionCubica.analizarEn(x), 0.0001);

	}

	@Test
	public void analizarEn2DeberiaRetornar15CuandoA1B1C1() {

		float a = 1.0f;
		float b = 1.0f;
		float c = 1.0f;
		float d = 1.0f;
		float x = 2.0f;
		float resultado = 15.0f;

		FuncionCubica funcionCubica = new FuncionCubica(a, b, c, d);

		Assert.assertEquals(resultado, funcionCubica.analizarEn(x), 0.0001);

	}
}

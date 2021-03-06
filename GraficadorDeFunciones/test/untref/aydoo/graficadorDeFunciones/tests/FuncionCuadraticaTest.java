package untref.aydoo.graficadorDeFunciones.tests;

import org.junit.Assert;
import org.junit.Test;

import untref.aydoo.graficadorDeFunciones.FuncionCuadratica;

public class FuncionCuadraticaTest {

	@Test
	public void analizarEn2DeberiaRetornar1CuandoA0B0C1() {

		float a = 0.0f;
		float b = 0.0f;
		float c = 1.0f;
		float x = 2.0f;
		float resultado = 1.0f;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b, c);

		Assert.assertEquals(resultado, funcionCuadratica.analizarEn(x), 0.0001);

	}

	@Test
	public void analizarEn2DeberiaRetornar7CuandoA1B1C1() {

		float a = 1.0f;
		float b = 1.0f;
		float c = 1.0f;
		float x = 2.0f;
		float resultado = 7.0f;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b, c);

		Assert.assertEquals(resultado, funcionCuadratica.analizarEn(x), 0.0001);

	}
}

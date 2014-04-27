package untref.aydoo.graficadorDeFunciones.tests;

import org.junit.Assert;
import org.junit.Test;

import untref.aydoo.graficadorDeFunciones.FuncionLineal;;

public class FuncionLinealTest {

	@Test
	public void analizarEn4DeberiaRetornar14CuandoAEs3YBEs2() {

		float a = 3.0f;
		float b = 2.0f;
		float x = 4.0f;
		float resultado = 14.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.analizarEn(x), 0.0001);

	}
	
	@Test
	public void analizarEn8DeberiaRetornar19CuandoAEs3YBEs2() {

		float a = 2.0f;
		float b = 3.0f;
		float x = 8.0f;
		float resultado = 19.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.analizarEn(x), 0.0001);

	}
	
}

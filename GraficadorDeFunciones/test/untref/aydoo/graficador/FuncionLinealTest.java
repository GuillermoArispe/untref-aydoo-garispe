package untref.aydoo.graficador;

import org.junit.Assert;
import org.junit.Test;
import untref.aydoo.graficador.FuncionLineal;

public class FuncionLinealTest {

	@Test
	public void evaluarEn4DeberiaRetornar11CuandoAEs3YBEs2() {

		float a = 3.0f;
		float b = 2.0f;
		float x = 4.0f;
		float resultado = 11.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}
	
	@Test
	public void evaluarEn5DeberiaRetornar13CuandoAEs3YBEs2() {

		float a = 3.0f;
		float b = 2.0f;
		float x = 5.0f;
		float resultado = 13.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}
	
	@Test
	public void evaluarEn6DeberiaRetornar22CuandoAEs4YBEs3() {

		float a = 4.0f;
		float b = 3.0f;
		float x = 6.0f;
		float resultado = 22.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}

}

package untref.aydoo.graficador;

import org.junit.Assert;
import org.junit.Test;

public class FuncionCuadraticaTest {

	@Test
	public void evaluarEn2DeberiaRetornar4CuandoA0B0C1() {

		float a = 0.0f;
		float b = 0.0f;
		float c = 1.0f;
		float x = 2.0f;
		float resultado = 4.0f;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b,c);

		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.0001);
		
	}
	
	@Test
	public void evaluarEn2DeberiaRetornar7CuandoA1B1C1() {

		float a = 1.0f;
		float b = 1.0f;
		float c = 1.0f;
		float x = 2.0f;
		float resultado = 7.0f;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b,c);

		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.0001);
		
	}
	
	@Test
	public void evaluarEn3DeberiaRetornar13CuandoA1B1C1() {

		float a = 1.0f;
		float b = 1.0f;
		float c = 1.0f;
		float x = 3.0f;
		float resultado = 13.0f;

		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a, b,c);

		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.0001);

	}

}

package untref.aydoo.graficador;

public class FuncionCuadratica {

	private float a, b, c;

	public FuncionCuadratica(float a, float b, float c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public float evaluarEn(float x) {

		return (float) (c * Math.pow(x, 2) + b * x + a);

	}

}

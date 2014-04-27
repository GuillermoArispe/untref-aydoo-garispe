package untref.aydoo.graficadorDeFunciones;

public class FuncionCuadratica {

	private float a;
	private float b;
	private float c;

	public FuncionCuadratica(float a, float b, float c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public float analizarEn(float x) {

		return (float) (a * Math.pow(x, 2) + b * x + c);

	}

}

package untref.aydoo.graficadorDeFunciones;

public class FuncionCubica {

	private float a;
	private float b;
	private float c;
	private float d;

	public FuncionCubica(float a, float b, float c, float d) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	public float analizarEn(float x) {

		return (float) (a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d);

	}
}

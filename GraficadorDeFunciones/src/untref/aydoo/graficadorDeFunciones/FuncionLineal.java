package untref.aydoo.graficadorDeFunciones;

public class FuncionLineal {

	private float a;
	private float b;

	public FuncionLineal(float a, float b) {

		this.a = a;
		this.b = b;

	}

	public float analizarEn(float x) {

		return a * x + b;

	}
}
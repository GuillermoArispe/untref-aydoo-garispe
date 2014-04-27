package untref.aydoo.maquinaDeCafe;

public class Vaso {

	private Cafe cafe;
	private Azucar azucar;

	public Vaso() {

	}

	public Vaso(Azucar azucar) {

		this.azucar = azucar;
	}

	// El vaso no sirve.
	//
	// public void servir() {
	//
	// }

	public void ponerAzucar(Azucar azucar) {

		this.azucar = azucar;
	}

	public Azucar obtenerAzucar() {

		return this.azucar;
	}

	public Cafe obtenerCafe() {

		return this.cafe;
	}

	public void ponerCafe(Cafe cafe) {

		this.cafe = cafe;
	}

}
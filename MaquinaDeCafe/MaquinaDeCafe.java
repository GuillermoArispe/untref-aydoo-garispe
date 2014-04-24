public class MaquinaDeCafe {

	private Cafetera cafetera;

	public MaquinaDeCafe() {

		cafetera = new Cafetera();
	}

	public Vaso hacerCafe() {

		Vaso vaso = new Vaso();
		vaso.ponerCafe(cafetera.dameCafe());

		return vaso;
	}

	public Vaso hacerCafe(int azucar) {

		Vaso vaso = this.hacerCafe();
		vaso.ponerAzucar(new Azucar(azucar));

		return vaso;
	}

}

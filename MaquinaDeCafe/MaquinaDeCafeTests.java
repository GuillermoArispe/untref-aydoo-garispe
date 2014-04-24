import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class MaquinaDeCafeTests {

	private MaquinaDeCafe maquinaDeCafe;

	@Test
	public void testVaso() {

		Vaso vaso = new Vaso();
		// vaso.servir();
	}

	@Test
	public void testPonerAzucarAlVaso() {

		Vaso vaso = new Vaso();
		Azucar azucar = new Azucar(2);
		vaso.ponerAzucar(azucar);
	}

	@Test
	public void testCafetera() {

		Cafetera cafetera = new Cafetera();
		Cafe cafe = cafetera.dameCafe();

		Assert.assertNotNull(cafe);
	}

	@Test
	public void testHacerCafe() {

		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();
		Vaso vaso = maquinaDeCafe.hacerCafe(2);

		Assume.assumeNotNull(vaso);

		Assert.assertNotNull(vaso.obtenerCafe());
	}

	@Test
	public void testHacerBebidaConAzucar() {

		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();
		Vaso vaso = maquinaDeCafe.hacerCafe(2);

		Assume.assumeNotNull(vaso);

		Assert.assertNotNull(vaso.obtenerAzucar());
	}

	@Before
	public void setupMaquinaDeCafe() {

		maquinaDeCafe = new MaquinaDeCafe();
	}

	@Test
	public void testHacerCafeCon2Azucar() {

		Vaso vaso = maquinaDeCafe.hacerCafe(2);

		Assert.assertNotNull(vaso);
		Assert.assertEquals(2, vaso.obtenerAzucar().getCantidad());

		Assert.assertNotNull(vaso.obtenerCafe());
	}

	@Test
	public void testHacerCafeSinAzucar() {

		Vaso vaso = maquinaDeCafe.hacerCafe();

		Assert.assertNotNull(vaso);
		Assert.assertNull(vaso.obtenerAzucar());

		Assert.assertNotNull(vaso.obtenerCafe());
	}

	@Test
	public void testHacer2Cafe() {

		Vaso vasoSinAzucar = maquinaDeCafe.hacerCafe();
		Vaso vasoConAzucar = maquinaDeCafe.hacerCafe(1);

		Assert.assertNotNull(vasoSinAzucar);
		Assert.assertNotNull(vasoConAzucar);

		Assert.assertNull(vasoSinAzucar.obtenerAzucar());
		Assert.assertNotNull(vasoConAzucar.obtenerAzucar());

		Assert.assertEquals(1, vasoConAzucar.obtenerAzucar().getCantidad());

		Assert.assertNotNull(vasoSinAzucar.obtenerCafe());
		Assert.assertNotNull(vasoConAzucar.obtenerCafe());
	}

}

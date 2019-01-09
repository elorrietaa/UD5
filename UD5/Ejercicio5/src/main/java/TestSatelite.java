import static org.junit.Assert.*;

import org.junit.Test;

public class TestSatelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	@Test
	public void testConstructor1() {
		meridiano = 107;
		paralelo = 200;
		distancia_tierra = 500;
		Satelite sateliteTest = new Satelite(meridiano, paralelo, distancia_tierra);
		
		assertEquals(sateliteTest.meridiano, 107, 0);
		assertEquals(sateliteTest.paralelo, 200, 0);
		assertEquals(sateliteTest.distancia_tierra, 500, 0);
	}
 
	@Test
	public void testConstructor2() {
		Satelite sateliteTest2 = new Satelite();
		
		assertEquals(sateliteTest2.meridiano, 0, 0);
		assertEquals(sateliteTest2.paralelo, 0, 0);
		assertEquals(sateliteTest2.distancia_tierra, 0, 0);
	} 
	
	@Test
	public void TestSetPosicion() {
		double meridianoTest = 345;
		double paraleloTest = 123;
		double distanciaTierraTest = 567;
		
		meridiano = 107;
		paralelo = 200;
		distancia_tierra = 500;
		//Haces el test con unos valores, pero por parametro en el constructor le habias metido otros valores, estos se van a reemplazar. 
		Satelite sateliteTest3 = new Satelite(meridiano, paralelo, distancia_tierra);
		
		sateliteTest3.setPosicion(meridianoTest, paraleloTest, distanciaTierraTest);
		//Se van a quedar los parámetros metidos por nosotros, no los del constructor.
		assertEquals(sateliteTest3.meridiano, 345, 0);
		assertEquals(sateliteTest3.paralelo, 123, 0);
		assertEquals(sateliteTest3.distancia_tierra, 567, 0);

	}
	
	@Test
	public void testVariarAltura() {
		double desplazamiento=-3;
		
		Satelite sateliteTest2 = new Satelite(); 
		sateliteTest2.variarAltura(desplazamiento);
		
		assertEquals(sateliteTest2.distancia_tierra, -3, 0);
		
	}

	
}

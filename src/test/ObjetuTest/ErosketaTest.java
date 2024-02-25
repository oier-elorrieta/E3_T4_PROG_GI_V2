package test.ObjetuTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

import modeloa.objetuak.Erosketak;
import modeloa.objetuak.Bezeroa;

import org.junit.BeforeClass;
import org.junit.Test;

public class ErosketaTest {

	private static LocalDate data;
	
	private static Erosketak erosketak;
	private static Bezeroa bezeroa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		erosketak = new Erosketak(1);
		bezeroa = new Bezeroa("B01", "123456789M", "Mikelon", "Rodriguez", "Mikelodeon", "Mikel123", 123456789, "Emakumea");

	}
	
	@Test
	public void testErosketakKonstruktore() {
		erosketak.setIdErosketak(1);
		erosketak.setData(data);
        erosketak.setBezeroa(bezeroa);
		erosketak.setDeskontua(1);
		erosketak.setDirutotala(1);

		assertEquals(1, erosketak.getIdErosketak());
		assertEquals(data, erosketak.getData());
		assertEquals(bezeroa, erosketak.getBezeroa());
		assertEquals(1.0, erosketak.getDeskontua(), 0.001);
		assertEquals(1.0, erosketak.getDirutotala(), 0.001);
	}
	
	@Test
	public void testErosketakToString() {
		LocalDate dataFroga = LocalDate.of(2024, 1, 1); 
		
		erosketak.setIdErosketak(1);
		erosketak.setSarreraList(null);
		erosketak.setBezeroa(bezeroa);
		erosketak.setData(dataFroga);
		erosketak.setDeskontua(1);
		erosketak.setDirutotala(1);
		erosketak.setMota(1);
		
		assertEquals("Erosketak [idErosketak=1, sarreraList=null, bezeroa=" + bezeroa.toString() + ", data=" + dataFroga +", deskontua=1.0, dirutotala=1.0, mota=1]", erosketak.toString());
	}
	
	 @Test
	    public void testHashCodeErosketa() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
	    	
	        Erosketak erosketak1 = new Erosketak(1);
	        Erosketak erosketak2 = new Erosketak(1);
	        erosketak1.setData(dataFroga);
	        erosketak2.setData(dataFroga);

	        assertEquals(erosketak1.hashCode(), erosketak2.hashCode());
	    }

	    @Test
	    public void test_ErosketaEquals() {
	        Erosketak erosketak = new Erosketak(1);
	        assertTrue(erosketak.equals(erosketak));
	    }

	    @Test
	    public void test_ErosketakBatzuk() {	
	        Erosketak erosketak1 = new Erosketak(1);
	        Erosketak erosketak2 = new Erosketak(1);
	        Erosketak erosketak3 = new Erosketak(1);

	        assertTrue(erosketak1.equals(erosketak2) && erosketak2.equals(erosketak3) && erosketak1.equals(erosketak3));
	    }

	    @Test
	    public void test_ErosketaNuloa() {
	        Erosketak erosketak = new Erosketak(1);
	        assertFalse(erosketak.equals(null));
	    }

	    @Test
	    public void test_ErosketaObjetua() {
	        Erosketak erosketak = new Erosketak(1);
	        assertFalse(erosketak.equals("Not an Erosketak object"));
	    }

	    @Test
	    public void test_ErosketaEzberdina() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
	    	LocalDate dataFrogaBI = LocalDate.of(2023, 5, 23);	
	    	
	        Erosketak erosketak1 = new Erosketak(1);
	        Erosketak erosketak2 = new Erosketak(2);
	        
	        erosketak1.setData(dataFroga);
	        erosketak2.setData(dataFrogaBI);
	        
	        assertFalse(erosketak1.equals(erosketak2));
	    }

}

package test.ObjetuTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

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
		
		erosketak = new Erosketak(1, data);
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
		erosketak.setBezeroa(bezeroa);
		erosketak.setData(dataFroga);
		erosketak.setSarreraKant(1);
		erosketak.setDeskontua(1);
		erosketak.setDirutotala(1);
		erosketak.setMota("Fisikoa");
		
		assertEquals("Erosketak [idErosketak=1, bezeroa=" + bezeroa.toString() + ", data=" + dataFroga +", sarreraKant=1, deskontua=1.0, dirutotala=1.0, mota=Fisikoa]", erosketak.toString());
	}
	
	 @Test
	    public void testHashCodeErosketa() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);
	    	
	        Erosketak erosketak1 = new Erosketak(1, dataFroga);
	        Erosketak erosketak2 = new Erosketak(1, dataFroga);

	        assertEquals(erosketak1.hashCode(), erosketak2.hashCode());
	    }

	    @Test
	    public void test_ErosketaEquals() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
	    
	        Erosketak erosketak = new Erosketak(1, dataFroga);
	        assertTrue(erosketak.equals(erosketak));
	    }

	    @Test
	    public void test_ErosketakBatzuk() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
	    	
	        Erosketak erosketak1 = new Erosketak(1, dataFroga);
	        Erosketak erosketak2 = new Erosketak(1, dataFroga);
	        Erosketak erosketak3 = new Erosketak(1, dataFroga);

	        assertTrue(erosketak1.equals(erosketak2) && erosketak2.equals(erosketak3) && erosketak1.equals(erosketak3));
	    }

	    @Test
	    public void test_ErosketaNuloa() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
	    	
	        Erosketak erosketak = new Erosketak(1, dataFroga);
	        assertFalse(erosketak.equals(null));
	    }

	    @Test
	    public void test_ErosketaObjetua() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
	    	
	        Erosketak erosketak = new Erosketak(1, dataFroga);
	        assertFalse(erosketak.equals("Not an Erosketak object"));
	    }

	    @Test
	    public void test_ErosketaEzberdina() {
	    	LocalDate dataFroga = LocalDate.of(2024, 1, 1);	
	    	LocalDate dataFrogaBI = LocalDate.of(2023, 5, 23);	
	    	
	        Erosketak erosketak1 = new Erosketak(1, dataFroga);
	        Erosketak erosketak2 = new Erosketak(2, dataFrogaBI);
	        assertFalse(erosketak1.equals(erosketak2));
	    }

}

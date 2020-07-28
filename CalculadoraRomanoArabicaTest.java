import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraRomanoArabicaTest {
    
    public CalculadoraRomanoArabicaTest() {
    }

    /**
     * Test of main method, of class CalculadoraRomanoArabica.
     */
    //@Test
    //public void testMain() {
       // System.out.println("main");
        //String[] args = null;
        //CalculadoraRomanoArabica.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    //}

    /**
     * Test of Conversion method, of class CalculadoraRomanoArabica.
     */
    @Test
    public void testConversion() {
        System.out.println("Conversion");
        String num = " ";
        int expResult = 0;
        int result = CalculadoraRomanoArabica.Conversion(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of RomADec method, of class CalculadoraRomanoArabica.
     */
    @Test
    public void testRomADec() {
        System.out.println("RomADec");
        char letra = ' ';
        int expResult = 0;
        int result = CalculadoraRomanoArabica.RomADec(letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Suma method, of class CalculadoraRomanoArabica.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int factor1 = 10;
        int factor2 = 5;
        int expResult = 15;
        int result = CalculadoraRomanoArabica.Suma(factor1, factor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Resta method, of class CalculadoraRomanoArabica.
     */
    @Test
    public void testResta() {
        System.out.println("Resta");
        int factor1 = 10;
        int factor2 = 5;
        int expResult = 5;
        int result = CalculadoraRomanoArabica.Resta(factor1, factor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicacion method, of class CalculadoraRomanoArabica.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        int factor1 = 10;
        int factor2 = 5;
        int expResult = 50;
        int result = CalculadoraRomanoArabica.Multiplicacion(factor1, factor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Division method, of class CalculadoraRomanoArabica.
     */
    @Test
    public void testDivision() {
        System.out.println("Division");
        int factor1 = 10;
        int factor2 = 0;
        int expResult =0;
        int result = CalculadoraRomanoArabica.Division(factor1, factor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

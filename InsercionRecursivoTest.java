import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class InsercionRecursivoTest{
    private InsercionRecursivo insercion;
    public InsercionRecursivoTest()
    {
    }
    @BeforeEach
    public void setUp()
    {
        insercion = new InsercionRecursivo();
    }
    @Test
    public void prueba1(){
      int [] arreglo = {4,5,1,2,3}; 
      int [] respEsp = {1,2,3,4,5};
      int [] resp = insercion.insercion(arreglo);
      assertEquals (respEsp[0], resp[0]);
      assertEquals (respEsp[1], resp[1]);
      assertEquals (respEsp[2], resp[2]);
      assertEquals (respEsp[3], resp[3]);
      assertEquals (respEsp[4], resp[4]);
    }
    @Test
    public void prueba2(){
      int [] arreglo = {7,5,9,13,15,4,2,20}; 
      int [] respEsp = {2,4,5,7,9,13,15,20};
      int [] resp = insercion.insercion(arreglo);
      assertEquals (respEsp[0], resp[0]);
      assertEquals (respEsp[1], resp[1]);
      assertEquals (respEsp[2], resp[2]);
      assertEquals (respEsp[3], resp[3]);
      assertEquals (respEsp[4], resp[4]);
      assertEquals (respEsp[5], resp[5]);
      assertEquals (respEsp[6], resp[6]);
      assertEquals (respEsp[7], resp[7]);
    } 
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}

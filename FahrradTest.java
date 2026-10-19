import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FahrradTest
{
   private Fahrrad fahrrad;

   @BeforeEach
   public void setUp()
   {
   fahrrad = new Fahrrad("UNKN", 1, 250, false, false);
   }

   @Test
   public void testGaenge()
   {
   // Untere Grenze
   fahrrad.setGaenge(1);
    assertEquals(1, fahrrad.getGaenge());

   // Obere Grenze
   fahrrad.setGaenge(30);
   assertEquals(30, fahrrad.getGaenge());

   // Gueltiger Wert
   fahrrad.setGaenge(15);
   assertEquals(15, fahrrad.getGaenge());

   // Ungueltige Werte
   fahrrad.setGaenge(0);
   assertEquals(1, fahrrad.getGaenge());

   fahrrad.setGaenge(31);
   assertEquals(1, fahrrad.getGaenge());
   }

   @Test
   public void testMarke()
   {
   fahrrad.setMarke("Cube");
   assertEquals("Cube", fahrrad.getMarke());
   }

   @Test
   public void testElektrisch()
   {
   fahrrad.setElektrisch(true);
   assertTrue(fahrrad.getElektrisch());

   fahrrad.setElektrisch(false);
   assertFalse(fahrrad.getElektrisch());
   }
}
package materialien;

import static org.junit.Assert.*;

import org.junit.Test;

public class KontaktTest
{
    @Test
    public void konstruktorTest()
    {
        Kontakt kontakt = new Kontakt("Karim Djemai");
        assertEquals(kontakt.getName(), "Karim Djemai");
    }
    
    @Test
    public void equalsTest()
    {
        Kontakt kontakt = new Kontakt("Kian Kiesling");
        Kontakt andererKontakt = new Kontakt("Kian Kiesling");

        assertEquals(kontakt, andererKontakt);
    }
    
    @Test
    public void idNumberTest()
    {
        Kontakt kontakt = new Kontakt("Kian Kiesling");
        Kontakt andererKontakt = new Kontakt("Kian Kiesling");

        assertEquals(kontakt.hashCode(), andererKontakt.hashCode());
    }
    
    
    public void aenderungFunktioniert()
    {
        Kontakt kontakt = new Kontakt("Hark Merkau");
        kontakt.setName("Mike Terman");
        assertEquals(kontakt.getName(), "Mike Terman");
    }
    
    
    
    
}

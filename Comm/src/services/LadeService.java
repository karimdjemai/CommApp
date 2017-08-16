package services;

import java.util.List;
import materialien.Kontakt;

public interface LadeService
{
    /**
     * Ein Service, der dafür zuständig ist Materialien und Fachwerte aus dem 
     * Speicher zu Laden.
     */
    
    public List<Kontakt> kontakteLaden();
}

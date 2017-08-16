package services;

import java.util.ArrayList;
import java.util.List;

import materialien.Kontakt;

public class LadeServiceDummyImpl implements LadeService
{
    
    public List<Kontakt> kontakteLaden()
    {
        List<Kontakt> li = new ArrayList<Kontakt>();
        for (int i = 0; i < 50; i++)
        {
            li.add(new Kontakt("" + i * 431));
        }
        return li;
    }
}

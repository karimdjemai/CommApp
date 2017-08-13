package materialien;

import javax.swing.JButton;

public class KButton extends JButton
{
    /**
     * kein plan was der scheiss soll, hab ne warnung von eclipse bekommen dass
     * ich das so machen soll
     */
    private static final long serialVersionUID = -1947126018152090189L;
    private Kontakt _kontakt;
    
    public void setKontakt(Kontakt k)
    {
        _kontakt = k;
    }
    
    public Kontakt getKontakt()
    {
        return _kontakt;
    }
}

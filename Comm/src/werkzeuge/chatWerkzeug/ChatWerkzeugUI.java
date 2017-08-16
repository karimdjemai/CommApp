package werkzeuge.chatWerkzeug;

import java.awt.Color;

import javax.swing.JPanel;

import materialien.Kontakt;

public class ChatWerkzeugUI
{
    private Kontakt _gegenUeber; 
    private JPanel _contentPanel;
    
    public ChatWerkzeugUI()
    {
        _gegenUeber = null;
        initialisiereContentPanel();
    }
    
    private void initialisiereContentPanel()
    {
        JPanel p = new JPanel();
        p.setBackground(Color.black);
        _contentPanel = p;
    }
    
    public Kontakt getKontakt()
    {
        return _gegenUeber;
    }
    public void setKontakt(Kontakt k)
    {
        _gegenUeber = k;
    }
    
    public JPanel getContentPanel()
    {
        return _contentPanel;
    }
}
>>>>>>> branch 'master' of https://github.com/karimdjemai/CommApp

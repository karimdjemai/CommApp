package werkzeuge.chatWerkzeug;

import javax.swing.JPanel;

import materialien.Kontakt;

public class ChatWerkzeug
{
    private ChatWerkzeugUI _ui;
    private Kontakt _gegenUeber;
    
    public ChatWerkzeug()
    {
        _gegenUeber = null;
        _ui = new ChatWerkzeugUI();
    }
    
    public JPanel getContentPanel()
    {
        return _ui.getContentPanel();
    }

    public void setKontakt(Kontakt k)
    {
        _ui.setKontakt(k);
        _gegenUeber = k;
    }
    
    public Kontakt getKontakt()
    {
        return _gegenUeber;
    }
}
//>>>>>>> branch 'master' of https://github.com/karimdjemai/CommApp

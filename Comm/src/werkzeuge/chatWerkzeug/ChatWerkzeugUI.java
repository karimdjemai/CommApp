package werkzeuge.chatWerkzeug;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import materialien.Kontakt;

public class ChatWerkzeugUI
{
    private Kontakt _gegenUeber; 
    private JPanel _nachrichtenPanel;
    private JPanel _contentPanel;
    private JPanel _schreibPanel;
    
    public ChatWerkzeugUI()
    {
        _gegenUeber = null;
        initialisiereNachrichtenPanel();
        initialisiereSchreibPanel();
        initialisiereContentPanel();
    }
    
    private void initialisiereSchreibPanel()
    {
        JPanel p = new JPanel();
        p.setBackground(Color.yellow);
        _schreibPanel = p;
    }

    private void initialisiereNachrichtenPanel()
    {
        JPanel p = new JPanel();
        p.setBackground(Color.green);
        _nachrichtenPanel = p;
    }

    private void initialisiereContentPanel()
    {
        JPanel p = new JPanel();
        p.setBackground(Color.black);
        p.setLayout(new BorderLayout());
        p.add(_nachrichtenPanel, BorderLayout.CENTER);
        p.add(_schreibPanel, BorderLayout.PAGE_END);
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

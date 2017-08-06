package werkzeuge.chatWerkzeug;

import java.awt.Color;

import javax.swing.JPanel;

public class ChatWerkzeugUI
{
    private JPanel _contentPanel;
    
    public ChatWerkzeugUI()
    {
        initialisiereContentPanel();
    }
    
    private void initialisiereContentPanel()
    {
        JPanel p = new JPanel();
        p.setBackground(Color.GREEN);
        _contentPanel= p;
    }
    public JPanel getContentPanel()
    {
        return _contentPanel;
    }
}

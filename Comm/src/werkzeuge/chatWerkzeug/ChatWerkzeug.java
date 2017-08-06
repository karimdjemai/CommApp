package werkzeuge.chatWerkzeug;

import javax.swing.JPanel;

public class ChatWerkzeug
{
    private ChatWerkzeugUI _ui;
    
    public ChatWerkzeug()
    {
        _ui = new ChatWerkzeugUI();
    }
    
    public JPanel getContentPanel()
    {
        return _ui.getContentPanel();
    }

}

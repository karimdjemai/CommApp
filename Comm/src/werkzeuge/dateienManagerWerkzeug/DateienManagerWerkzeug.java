package werkzeuge.dateienManagerWerkzeug;

import javax.swing.JPanel;

public class DateienManagerWerkzeug
{
    private DateienManagerWerkzeugUI _ui;
    
    public DateienManagerWerkzeug()
    {
        _ui = new DateienManagerWerkzeugUI();
    }
    
    public JPanel getContentPanel()
    {
        return _ui.getContentPanel();
    }
    
    
    
}

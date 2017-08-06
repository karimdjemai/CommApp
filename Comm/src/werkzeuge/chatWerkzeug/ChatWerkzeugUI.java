package werkzeuge.chatWerkzeug;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ChatWerkzeugUI
{
    private JList<String> _list;
    private JScrollPane _scroll;
    private JPanel _contentPanel;
    
    public ChatWerkzeugUI()
    {
        initialisiereList();
        initialisiereScroll();
        initialisiereContentPanel();
    }
    
    private void initialisiereScroll()
    {
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.setViewportView(_list);
        _scroll = scrollpane;
    }

    private void initialisiereList()
    {
        
        //Dummy objects in list
        String[] stringarray = new String[50];
        for(int i = 0; i < 50; i++)
        {
            stringarray[i] = "" + i * 431;
        }
        JList<String> list = new JList<String>(stringarray);
        _list = list;
    }

    private void initialisiereContentPanel()
    {
        JPanel p = new JPanel();
        p.setBackground(Color.GREEN);
        p.setLayout(new BorderLayout());
         
        p.add(_scroll, BorderLayout.CENTER);
        
        _contentPanel = p;
    }
    public JPanel getContentPanel()
    {
        return _contentPanel;
    }
}

package werkzeuge.chatWerkzeug;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ChatWerkzeugUI
{
    private JList<Object> _list;
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
        ArrayList<String> stringarray = new ArrayList<String>();
        for (int i = 0; i < 50; i++)
        {
            stringarray.add("" + i * 431);
        }
        JList<Object> list = new JList<Object>(stringarray.toArray());

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

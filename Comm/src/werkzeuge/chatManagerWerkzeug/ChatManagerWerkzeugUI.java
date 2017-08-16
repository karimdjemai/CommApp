package werkzeuge.chatManagerWerkzeug;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;

import materialien.KButton;
import materialien.Kontakt;

public class ChatManagerWerkzeugUI
{
    private List<KButton> _kontakte;
    private JPanel _list;
    private JScrollPane _scroll;
    private JPanel _contentPanel;
    private final int PANELHOEHE;

    public ChatManagerWerkzeugUI(int panelhoehe, List<Kontakt> kontakte)
    {
        PANELHOEHE = panelhoehe;
        _kontakte = new ArrayList<KButton>();
        kontakteLadenTextDateiLabel(kontakte);
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
        JPanel labelList = new JPanel();
        List<KButton> arrayList = _kontakte;
        labelList.setLayout(new GridLayout(arrayList.size(), 1));
        for (JButton l : arrayList)
        {
            labelList.add(l);
        }
        _list = labelList;
    }
    
    private void kontakteLadenTextDateiLabel(List<Kontakt> kontakte)
    {
        ArrayList<JButton> labelArray = new ArrayList<JButton>();
        for (Kontakt kontakt : kontakte)
        {
            KButton panel = kontaktPanelErzeugen(kontakt);
            _kontakte.add(panel);
            labelArray.add(panel);
        }
    }

    private KButton kontaktPanelErzeugen(Kontakt k)
    {
        KButton p = new KButton();
        p.setPreferredSize(new Dimension(1080 / 3, PANELHOEHE));
        p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));
        p.setBackground(Color.WHITE);
        p.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        JLabel l = new JLabel();
        l.setText(k.getName());
        p.add(l);
        p.setKontakt(k);
        return p;
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

    public List<KButton> getKontaktpanel()
    {
        return _kontakte;
    }

}

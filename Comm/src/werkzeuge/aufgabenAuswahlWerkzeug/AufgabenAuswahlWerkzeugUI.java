package werkzeuge.aufgabenAuswahlWerkzeug;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AufgabenAuswahlWerkzeugUI
{
    private JPanel _hauptpanel;

    private JButton _chatsLink;
    private JButton _dateienLink;

    private static final Font STANDARTSCHRIFT = new Font("The Sans UHH",
            Font.BOLD, 20);

    public AufgabenAuswahlWerkzeugUI()
    {
        initialisiereHauptpanel();
    }

    public void setVisible()
    {
        _hauptpanel.setVisible(true);
        _chatsLink.setVisible(true);
        _dateienLink.setVisible(true);
    }

    public void setInvisible()
    {
        _hauptpanel.setVisible(false);
        _chatsLink.setVisible(false);
        _dateienLink.setVisible(false);
    }

    private void initialisiereHauptpanel()
    {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 1));

        p.add(new JPanel());

        JButton cbutton = new JButton("Chats");
        cbutton.setBackground(Color.gray);
        cbutton.setFont(STANDARTSCHRIFT);
        cbutton.setForeground(Color.DARK_GRAY);

        _chatsLink = cbutton;
        p.add(_chatsLink);

        p.add(new JPanel());

        JButton dbutton = new JButton("Dateien");
        dbutton.setBackground(Color.gray);
        dbutton.setFont(STANDARTSCHRIFT);
        dbutton.setForeground(Color.DARK_GRAY);

        _dateienLink = dbutton;
        p.add(_dateienLink);

        _hauptpanel = p;
    }

    public JPanel getPanel()
    {
        return _hauptpanel;
    }

    public JButton getChatButton()
    {
        return _chatsLink;
    }

    public JButton getDateienButton()
    {
        return _dateienLink;
    }
}

package werkzeuge.kontextWerkzeug;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

<<<<<<< HEAD
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class KontextWerkzeugUI
{
    private final int HOEHE;
    private final int BREITE;
    private final int UEBERSCHRIFTHOEHE;
    private static final Font TITELFONT = new Font("The Sans UHH", Font.BOLD,
            25);

    private final String TITEL;

    private JFrame _frame;
    private JPanel _ueberschriftPanel;
    private JPanel _contentPanel;
    private JPanel _hauptPanel;
    private JLabel _titelLabel;

    public KontextWerkzeugUI(int hoehe, int breite, int ueber, String titel)
    {
        HOEHE = hoehe;
        BREITE = breite;
        UEBERSCHRIFTHOEHE = ueber;
        TITEL = titel;
        initialisiereTitleLabel();
        initialisiereUeberschriftPanel();
        initialisiereContentPanel();
        initialisiereHauptpanel();
        initialisiereFrame();
    }

    private void initialisiereHauptpanel()
    {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(_ueberschriftPanel, BorderLayout.NORTH);
        System.out.println(_ueberschriftPanel.getSize()
            .toString());
        p.add(_contentPanel, BorderLayout.CENTER);
        _hauptPanel = p;

    }

    private void initialisiereTitleLabel()
    {
        JLabel l = new JLabel(TITEL, SwingConstants.CENTER);
        l.setFont(TITELFONT);
        l.setForeground(Color.WHITE);
        _titelLabel = l;
    }

    private void initialisiereContentPanel()
    {
        JPanel p = new JPanel();
        p.setSize(BREITE, HOEHE - UEBERSCHRIFTHOEHE);
        p.setBackground(Color.BLUE);
        p.setLayout(new BorderLayout());
        _contentPanel = p;

    }

    private void initialisiereUeberschriftPanel()
    {
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(BREITE, UEBERSCHRIFTHOEHE));
        p.setBackground(new Color(20, 30, 150));
        p.setLayout(new BorderLayout());
        p.add(_titelLabel, BorderLayout.CENTER);
        _ueberschriftPanel = p;
    }

    private void initialisiereFrame()
    {
        JFrame f = new JFrame();
        f.setTitle(TITEL);
        f.setSize(BREITE, HOEHE);
        f.setContentPane(_hauptPanel);
        _frame = f;
    }

    public void setVisible(boolean b)
    {
        _frame.setVisible(b);
        _hauptPanel.setVisible(b);
        _ueberschriftPanel.setVisible(b);
        _contentPanel.setVisible(b);
        _titelLabel.setVisible(b);
    }

    public int getHOEHE()
    {
        return HOEHE;
    }

    public int getBREITE()
    {
        return BREITE;
    }

    public String getTITEL()
    {
        return TITEL;
    }

    public JFrame get_frame()
    {
        return _frame;
    }

    public JPanel getUeberschriftPanel()
    {
        return _ueberschriftPanel;
    }

    public void setContentPanel(JPanel cp)
    {
        _contentPanel.setVisible(false);
        
        if(_contentPanel.getComponentCount() > 0)
        _contentPanel.removeAll();
        
        _contentPanel.add(cp, BorderLayout.CENTER);
        
        _contentPanel.setVisible(true);
        

    }

    public JPanel get_hauptPanel()
    {
        return _hauptPanel;
    }

    public JLabel get_titelLabel()
    {
        return _titelLabel;
=======
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class KontextWerkzeugUI
{
    private final int HOEHE;
    private final int BREITE;
    private final int UEBERSCHRIFTHOEHE;
    private static final Font TITELFONT = new Font("The Sans UHH", Font.BOLD, 25);
    private static final Color ueberschriftFarbe = new Color(20, 30, 150);
    private final String TITEL;

    private JFrame _frame;
    private JPanel _ueberschriftPanel;
    private JPanel _contentPanel;
    private JPanel _hauptPanel;
    private JLabel _titelLabel;
    private JButton _zurueckButton;

    public KontextWerkzeugUI(int hoehe, int breite, int ueber, String titel)
    {
        HOEHE = hoehe;
        BREITE = breite;
        UEBERSCHRIFTHOEHE = ueber;
        TITEL = titel;
        initialisiereZurueckButton();
        initialisiereTitleLabel();
        initialisiereUeberschriftPanel();
        initialisiereContentPanel();
        initialisiereHauptpanel();
        initialisiereFrame();
    }

    private void initialisiereZurueckButton()
    {
        JButton button = new JButton("Zurueck");
        button.setPreferredSize(new Dimension(BREITE / 4, UEBERSCHRIFTHOEHE));
        button.setBackground(ueberschriftFarbe);
        button.setForeground(Color.WHITE);
        _zurueckButton = button;
    }

    private void initialisiereHauptpanel()
    {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(_ueberschriftPanel, BorderLayout.NORTH);
        System.out.println(_ueberschriftPanel.getSize()
            .toString());
        p.add(_contentPanel, BorderLayout.CENTER);
        _hauptPanel = p;

    }

    private void initialisiereTitleLabel()
    {
        JLabel l = new JLabel(TITEL, SwingConstants.CENTER);
        l.setFont(TITELFONT);
        l.setForeground(Color.WHITE);
        _titelLabel = l;
    }

    private void initialisiereContentPanel()
    {
        JPanel p = new JPanel();
        p.setSize(BREITE, HOEHE - UEBERSCHRIFTHOEHE);
        p.setBackground(Color.BLUE);
        p.setLayout(new BorderLayout());
        _contentPanel = p;

    }

    private void initialisiereUeberschriftPanel()
    {
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(BREITE, UEBERSCHRIFTHOEHE));
        p.setBackground(ueberschriftFarbe);
        p.setLayout(new BorderLayout());
        p.add(_titelLabel, BorderLayout.CENTER);
        _ueberschriftPanel = p;
    }

    private void initialisiereFrame()
    {
        JFrame f = new JFrame();
        f.setTitle(TITEL);
        f.setSize(BREITE, HOEHE);
        f.setContentPane(_hauptPanel);
        _frame = f;
    }

    public void setVisible(boolean b)
    {
        _frame.setVisible(b);
        _hauptPanel.setVisible(b);
        _ueberschriftPanel.setVisible(b);
        _contentPanel.setVisible(b);
        _titelLabel.setVisible(b);
    }

    public int getHOEHE()
    {
        return HOEHE;
    }

    public int getBREITE()
    {
        return BREITE;
    }

    public String getTITEL()
    {
        return TITEL;
    }

    public JFrame get_frame()
    {
        return _frame;
    }

    public JPanel getUeberschriftPanel()
    {
        return _ueberschriftPanel;
    }

    public void setContentPanel(JPanel cp)
    {
        _contentPanel.setVisible(false);

        if (_contentPanel.getComponentCount() > 0) _contentPanel.removeAll();

        _contentPanel.add(cp, BorderLayout.CENTER);

        _contentPanel.setVisible(true);

    }

    public JPanel get_hauptPanel()
    {
        return _hauptPanel;
    }

    public JLabel get_titelLabel()
    {
        return _titelLabel;
    }

    public void setZurueckButton(boolean vorhanden)
    {
        _ueberschriftPanel.setVisible(false);
        _ueberschriftPanel.removeAll();
        if (vorhanden)
        {
            _ueberschriftPanel.add(_zurueckButton, BorderLayout.LINE_START);
        }
        _ueberschriftPanel.add(_titelLabel, BorderLayout.CENTER);
        _ueberschriftPanel.setVisible(true);

    }

    public JButton getZurueckButton()
    {
        return _zurueckButton;
    }
}

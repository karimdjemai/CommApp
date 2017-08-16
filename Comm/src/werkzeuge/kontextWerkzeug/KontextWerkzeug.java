package werkzeuge.kontextWerkzeug;

<<<<<<< HEAD
import java.util.Observable;
import java.util.Observer;

import werkzeuge.aufgabenAuswahlWerkzeug.AufgabenAuswahlWerkzeug;
import werkzeuge.chatWerkzeug.ChatWerkzeug;
import werkzeuge.dateienManagerWerkzeug.DateienManagerWerkzeug;

public class KontextWerkzeug extends Observable
{

    private static final int FENSTERHOEHE = 1920 / 3;
    private static final int FENSTERBREITE = 1080 / 3;
    private static final int UEBERSCHRIFTHOEHE = FENSTERHOEHE / 10;
    private static final String TITEL = "CommApp";

    private AufgabenAuswahlWerkzeug _aufg;
    private ChatWerkzeug _chatw;
    private DateienManagerWerkzeug _dat;
    private KontextWerkzeugUI _ui;

    public KontextWerkzeug()
    {

        _ui = new KontextWerkzeugUI(FENSTERHOEHE, FENSTERBREITE,
                UEBERSCHRIFTHOEHE, TITEL);
        _aufg = new AufgabenAuswahlWerkzeug();
        _chatw = new ChatWerkzeug();
        _dat = new DateienManagerWerkzeug();
        _ui.setContentPanel(_aufg.getContentPanel());
        _ui.setVisible(true);

        setUpSubWerkzeugListener();
    }

    private void setUpSubWerkzeugListener()
    {
        _aufg.addObserver(new Observer()
        {

            @Override
            public void update(Observable o, Object arg)
            {
                if(arg.equals("chat"))
                _ui.setContentPanel(_chatw.getContentPanel());
                else if (arg.equals("dateien"))
                    _ui.setContentPanel(_dat.getContentPanel());
            }
        });

=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import materialien.Kontakt;
import services.LadeService;
import werkzeuge.aufgabenAuswahlWerkzeug.AufgabenAuswahlWerkzeug;
import werkzeuge.chatManagerWerkzeug.ChatManagerWerkzeug;
import werkzeuge.chatWerkzeug.ChatWerkzeug;
import werkzeuge.dateienManagerWerkzeug.DateienManagerWerkzeug;

public class KontextWerkzeug
{

    private static final int FENSTERHOEHE = 1920 / 3;
    private static final int FENSTERBREITE = 1080 / 3;
    private static final int UEBERSCHRIFTHOEHE = FENSTERHOEHE / 10;
    private static final int PANELHOEHE = FENSTERHOEHE / 5;
    private static final String TITEL = "CommApp";

    private boolean _zurueckButtonVorhanden;

    private enum Content
    {
        AUFGABENAUSWAHL, DATEIENMANAGER, CHATMANAGER, CHAT
    }

    private Content _content;
    private boolean _titelIstNormal;
    private AufgabenAuswahlWerkzeug _aufg;
    private ChatManagerWerkzeug _chatManW;
    private ChatWerkzeug _chatw;
    private DateienManagerWerkzeug _dat;
    private KontextWerkzeugUI _ui;

    public KontextWerkzeug(LadeService lade)
    {
        _zurueckButtonVorhanden = false;
        _titelIstNormal = true;
        _ui = new KontextWerkzeugUI(FENSTERHOEHE, FENSTERBREITE,
                UEBERSCHRIFTHOEHE, TITEL);
        _aufg = new AufgabenAuswahlWerkzeug();
        _chatManW = new ChatManagerWerkzeug(PANELHOEHE, lade);
        _chatw = new ChatWerkzeug();
        _dat = new DateienManagerWerkzeug();
        _ui.setContentPanel(_aufg.getContentPanel());
        _ui.setVisible(true);

        setUpUIListener();
        setUpSubWerkzeugListener();
    }

    private void setUpUIListener()
    {
        _ui.getZurueckButton()
            .addActionListener(new ActionListener()
            {

                @Override
                public void actionPerformed(ActionEvent event)
                {
                    if (_content.equals(Content.CHAT))
                    {
                        _ui.setContentPanel(_chatManW.getContentPanel());
                        _content = Content.CHATMANAGER;
                        _titelIstNormal = true;
                        setTitel(null);
                    }
                    else
                    {
                        _ui.setContentPanel(_aufg.getContentPanel());
                        _content = Content.AUFGABENAUSWAHL;
                        _zurueckButtonVorhanden = false;
                        setZurueckButton();
                    }
                    _titelIstNormal = true;
                    setTitel(null);
                }

            });
    }

    private void setUpSubWerkzeugListener()
    {
        _aufg.addObserver(new Observer()
        {

            @Override
            public void update(Observable o, Object arg)
            {
                if (arg.equals("chat"))
                {
                    _ui.setContentPanel(_chatManW.getContentPanel());
                    _content = Content.CHATMANAGER;
                }
                else if (arg.equals("dateien"))
                {
                    _ui.setContentPanel(_dat.getContentPanel());
                    _content = Content.DATEIENMANAGER;
                }
                _zurueckButtonVorhanden = true;
                setZurueckButton();
            }
        });

        _chatManW.addObserver(new Observer()
        {
            @Override
            public void update(Observable o, Object arg)
            {
                Kontakt kontakt = null;
                if (arg instanceof Kontakt)
                {
                    kontakt = (Kontakt) arg;
                }
                _zurueckButtonVorhanden = true;
                setZurueckButton();
                _chatw.setKontakt(kontakt);
                _ui.setContentPanel(_chatw.getContentPanel());
                _content = Content.CHAT;
                _titelIstNormal = false;
                setTitel(kontakt.getName());
            }

        });

    }

    private void setTitel(String text)
    {
        if (!_titelIstNormal)
            _ui.get_titelLabel()
                .setText(text);
        else
        {
            _ui.get_titelLabel()
                .setText(TITEL);
        }
    }

    private void setZurueckButton()
    {
        _ui.setZurueckButton(_zurueckButtonVorhanden);
>>>>>>> branch 'master' of https://github.com/karimdjemai/CommApp
    }

}

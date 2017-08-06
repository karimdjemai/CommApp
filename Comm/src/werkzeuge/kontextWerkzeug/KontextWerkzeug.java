package werkzeuge.kontextWerkzeug;

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

    }

}

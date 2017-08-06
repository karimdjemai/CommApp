package werkzeuge.aufgabenAuswahlWerkzeug;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JPanel;

public class AufgabenAuswahlWerkzeug extends Observable
{

    private AufgabenAuswahlWerkzeugUI _ui;

    public AufgabenAuswahlWerkzeug()
    {

        _ui = new AufgabenAuswahlWerkzeugUI();

        erzeugeListenerFuerUI();
    }

    private void erzeugeListenerFuerUI()
    {
        _ui.getChatButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    setChanged();
                    notifyObservers("chat");
                }

            });
        _ui.getDateienButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    setChanged();
                    notifyObservers("dateien");
                }

            });

    }

    public JPanel getContentPanel()
    {
        return _ui.getPanel();
    }
}

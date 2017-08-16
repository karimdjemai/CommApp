package werkzeuge.chatManagerWerkzeug;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Observable;
import javax.swing.JPanel;
import materialien.KButton;
import materialien.Kontakt;
import services.LadeService;

public class ChatManagerWerkzeug extends Observable
{
    private ChatManagerWerkzeugUI _ui;
    private LadeService _ladeService;

    public ChatManagerWerkzeug(int panelhoehe, LadeService ladeService)
    {
        _ladeService = ladeService;
        _ui = new ChatManagerWerkzeugUI(panelhoehe, kontakeLaden());
        uiListenerHinzufuegen();
    }

    private List<Kontakt> kontakeLaden()
    {
        return _ladeService.kontakteLaden();
    }

    private void uiListenerHinzufuegen()
    {
        for (KButton button : _ui.getKontaktpanel())
        {
            button.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    setChanged();
                    notifyObservers(button.getKontakt());
                }

            });
        }

    }

    public JPanel getContentPanel()
    {
        return _ui.getContentPanel();
    }

}

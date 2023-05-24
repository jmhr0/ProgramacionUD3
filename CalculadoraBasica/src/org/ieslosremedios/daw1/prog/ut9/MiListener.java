package org.ieslosremedios.daw1.prog.ut9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiListener implements ActionListener {

    MiComponenteAwt componente;

    public MiListener(MiComponenteAwt component) {
        this.componente=component;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        componente.dispose();
    }
}

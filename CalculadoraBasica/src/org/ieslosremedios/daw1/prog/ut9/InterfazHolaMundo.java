package org.ieslosremedios.daw1.prog.ut9;

import java.awt.*;

public class InterfazHolaMundo {
    public static void main(String[] args) {
        //Contenedor
        Frame frame = new Frame("Hola mundo");

        frame.setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setSize(1920,1080);
        frame.setVisible(true);

        Button button = new Button("si o no");

        button.setBounds(100,100,100,50);

        frame.add(button);
    }

}

package org.ieslosremedios.daw1.prog.ut9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;

public class MiComponenteAwt extends Frame implements ActionListener {
    Button botonsalir;
    public static void main(String[] args) {
        new MiComponenteAwt();
    }

    MiComponenteAwt(){
        {


            setTitle("Mi componente");
            setBackground(Color.lightGray);
            setLayout(null);
            setSize(1366,768);
            setVisible(true);

            botonsalir= new Button("salir");
            Button botonentrar = new Button("acceder");

            Label label = new Label("Nombre: ");
            Label label2 = new Label("Password: ");

            TextField textField = new TextField();
            TextField textField2 = new TextField();

            botonsalir.setBounds(450,550,75,75);
            botonentrar.setBounds(950,550,75,75);

            label.setBounds(150,100,75,25);
            label2.setBounds(150,300,75,25);
            label.setBackground(Color.darkGray);
            label2.setBackground(Color.darkGray);

            textField.setBounds(250,100,150,25);
            textField2.setBounds(250,300,150,25);

            add(label2);
            add(label);
            add(botonsalir);
            add(botonentrar);
            add(textField);
            add(textField2);

            //eventos
            // forma 1 (usando otra clase)

            //botonsalir.addActionListener(new MiListener(this));

            // forma 2 (implementando la misma clase dentro de la clase)

            //botonsalir.addActionListener(this);

            // forma 3 (clase anonima)
            botonsalir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ((Frame)botonsalir.getParent()).dispose();
                }
            });
            this.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {
                    MiComponenteAwt.this.dispose();
                }

                @Override
                public void windowClosed(WindowEvent e) {

                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ((Frame)botonsalir.getParent()).dispose();
    }
}

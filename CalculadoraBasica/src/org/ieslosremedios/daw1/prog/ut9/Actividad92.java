package org.ieslosremedios.daw1.prog.ut9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Actividad92 extends Frame implements ActionListener {
    String nombre = "Juan Manuel";
    public static void main(String[] args) {
        new Actividad92();
    }

    Actividad92(){
        {

            setTitle("Mi componente");
            setBackground(Color.lightGray);
            setLayout(null);
            setSize(1366,768);
            setVisible(true);

            Button botoncancel= new Button("cancelar");
            Button botonentrar = new Button("acceder");

            Label label = new Label("Nombre: ");
            Label label2 = new Label("Password: ");

            TextField textField = new TextField();
            TextField textField2 = new TextField();

            botoncancel.setBounds(450,550,75,75);
            botonentrar.setBounds(950,550,75,75);

            label.setBounds(150,100,75,25);
            label2.setBounds(150,300,75,25);
            label.setBackground(Color.darkGray);
            label2.setBackground(Color.darkGray);

            textField.setBounds(250,100,150,25);
            textField2.setBounds(250,300,150,25);

            add(label2);
            add(label);
            add(botoncancel);
            add(botonentrar);
            add(textField);
            add(textField2);

            //Eventos

            botoncancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText("");
                    textField2.setText("");
                }
            });
            botonentrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Frame frame = new Frame("Frame acceder");
                    frame.setTitle("Login correcto");
                    frame.setSize(50,50);
                    frame.setVisible(true);
                    frame.setBounds(450,450,125,125);
                    frame.setBackground(Color.WHITE);
                    Label label3 = new Label("Buenas " + nombre);
                    label3.setBounds(350,350,50,50);
                    frame.add(label3);

                    Actividad92.this.dispose();

                    frame.addWindowListener(new WindowListener() {
                        @Override
                        public void windowOpened(WindowEvent e) {
                        }
                        @Override
                        public void windowClosing(WindowEvent e) {
                            frame.dispose();
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

                    /*
                    Label label3 = new Label("Buenas");
                    label3.setBounds(350,350,50,50);
                    label3.setVisible(true);
                    add(label3);
                     */
                }
            });


            this.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {
                }

                @Override
                public void windowClosing(WindowEvent e) {
                    Actividad92.this.dispose();
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

    }
}

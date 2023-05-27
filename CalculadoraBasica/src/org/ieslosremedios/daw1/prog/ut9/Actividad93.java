package org.ieslosremedios.daw1.prog.ut9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Actividad93 extends Frame implements ActionListener {
    String nombre = "Juan Manuel";

    public static void main(String[] args) {
        new Actividad93();
    }

    Actividad93() {
        setTitle("Mi componente");
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        setSize(500, 300);
        setVisible(true);

        // Menú
        MenuBar menuBar = new MenuBar();
        Menu opcionesMenu = new Menu("Opciones");
        MenuItem limpiarItem = new MenuItem("Limpiar formulario");
        MenuItem salirItem = new MenuItem("Salir");
        opcionesMenu.add(limpiarItem);
        opcionesMenu.add(salirItem);
        menuBar.add(opcionesMenu);

        Menu ayudaMenu = new Menu("Ayuda");
        menuBar.add(ayudaMenu);

        setMenuBar(menuBar);

        Panel panelSuperior = new Panel();
        panelSuperior.setBackground(Color.darkGray);
        panelSuperior.setLayout(new FlowLayout());

        Label label = new Label("Nombre: ");
        panelSuperior.add(label);
        TextField textField = new TextField(20);
        panelSuperior.add(textField);

        Panel panelCentral = new Panel();
        panelCentral.setLayout(new FlowLayout());

        Label label2 = new Label("Password: ");
        panelCentral.add(label2);
        TextField textField2 = new TextField(20);
        panelCentral.add(textField2);

        Panel panelInferior = new Panel();
        panelInferior.setLayout(new FlowLayout());

        Button botonentrar = new Button("acceder");
        panelInferior.add(botonentrar);
        Button botoncancel = new Button("cancelar");
        panelInferior.add(botoncancel);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // Eventos
        limpiarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField2.setText("");
            }
        });
        salirItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        botonentrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame frame = new Frame("Frame acceder");
                frame.setTitle("Login correcto");
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);
                frame.setBackground(Color.WHITE);

                Label label3 = new Label("Buenas " + nombre);
                label3.setAlignment(Label.CENTER);
                frame.add(label3);

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

                Actividad93.this.dispose();
                frame.setVisible(true);
            }
        });

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                Actividad93.this.dispose();
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

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
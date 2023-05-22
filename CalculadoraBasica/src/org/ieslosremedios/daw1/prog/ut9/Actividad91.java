package org.ieslosremedios.daw1.prog.ut9;

import java.awt.*;

public class Actividad91 {
    public static void main(String[] args) {
        //Contenedor
        Frame frame = new Frame("Login");

        frame.setBackground(Color.lightGray);
        frame.setLayout(null);
        frame.setSize(1366,768);
        frame.setVisible(true);

        Button button = new Button("cancelar");
        Button button2 = new Button("acceder");

        Label label = new Label("Nombre: ");
        Label label2 = new Label("Password: ");

        TextField textField = new TextField();
        TextField textField2 = new TextField();

        button.setBounds(450,550,75,75);
        button2.setBounds(950,550,75,75);

        label.setBounds(150,100,75,25);
        label2.setBounds(150,300,75,25);
        label.setBackground(Color.darkGray);
        label2.setBackground(Color.darkGray);

        textField.setBounds(250,100,150,25);
        textField2.setBounds(250,300,150,25);

        frame.add(label2);
        frame.add(label);
        frame.add(button);
        frame.add(button2);
        frame.add(textField);
        frame.add(textField2);
    }

}
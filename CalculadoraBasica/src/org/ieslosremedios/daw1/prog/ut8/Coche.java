package org.ieslosremedios.daw1.prog.ut8;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Coche implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "referenciaSeq")
    @SequenceGenerator(initialValue = 20,allocationSize = 10,name ="referenciaSeq" )
    private Integer referencia;
    private String Color;
    private String Marca;
    @Embedded
    private Fabricante fabricante;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Coche() {

    }
}

package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.Serializable;

public class ObjetoSerializable implements Serializable {
    static private long serialVersionUID=1L;
    int atrib1;
    int atrib2;
    static int atrib3;
    transient int atrib4;

    public ObjetoSerializable (int atrib1,int atrib2, int atrib3) {
        this.atrib1=atrib1;
        this.atrib2=atrib2;


    }

    public ObjetoSerializable() {
        this.atrib1=7;
        this.atrib2=7;
        this.atrib4=7;
    }
}
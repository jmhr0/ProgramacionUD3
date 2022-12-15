package org.ieslosremedios.daw1.prog.ut3.examen;

//enumerado color en otra clase diferente a la de equipo con 5 colores
enum Color {
    Verde,Rojo,Azul,Morado,Amarillo
}

public class Equipo {
    private String nombre;
    private Color color;
    private Integer partidosGanados;
    private Integer partidosPerdidos;
    private Integer partidosEmpatados;
    private Integer calidad;
    private Entrenador entrenador;

    Equipo (){
    }
    Equipo(Color color, String nombre){
        this.color=color;
        this.nombre=nombre;
    }
    Equipo(Color color, String nombre, Integer partidosPerdidos, Integer partidosGanados, Integer partidosEmpatados){
        this.color=color;
        this.nombre=nombre;
        this.partidosGanados=partidosGanados;
        this.partidosPerdidos=partidosPerdidos;
        this.partidosEmpatados=partidosEmpatados;
    }

    void actualizarCalidad(){
        calidad=partidosGanados * 2 + partidosEmpatados - partidosPerdidos;
        if (calidad>=100)
            System.out.println();
        if (calidad<=0)
            System.out.println();

        else System.out.println(calidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(Integer partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public Integer getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(Integer partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public Integer getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(Integer partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public Integer getCalidad() {
        return calidad;
    }

    public void setCalidad(Integer calidad) {
        this.calidad = calidad;
    }
}

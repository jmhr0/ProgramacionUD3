package org.ieslosremedios.daw1.prog.ut6.algoritmiaAvanzada.algoritmoVoraz;

public abstract class EsquemaVoraz {
    Object[] solucion;
    Object candidato;
    int etapa;
    public void voraz () {
        inicializa();
        while (!fin()) {
            seleccionaYEliminaCandidato();
            if (esPrometedor()) {
                anotaEnSolucion();
            }
        }
    }

    protected abstract void anotaEnSolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void inicializa();

}
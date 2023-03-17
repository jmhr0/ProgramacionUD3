package org.ieslosremedios.daw1.prog.ut6.algoritmiaAvanzada.algoritmoVoraz;

public abstract class EsquemaVoraz {
    public void voraz (){
        Inicializa();
        while(!fin()) {
            seleccionaYEliminaCandidato();
            if (esPrometodor()) {
                AnotaEnSolución();
            }
        }
    }

    protected abstract void AnotaEnSolución();

    protected abstract boolean esPrometodor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void Inicializa();

}

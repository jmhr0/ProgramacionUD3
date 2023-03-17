package org.ieslosremedios.daw1.prog.ut6.algoritmiaAvanzada.algoritmoVoraz;

public class ProblemaCambioMoneda extends EsquemaVoraz {
    int [] monedas;
    int cambio;
    int [] solución;
    int candidato;
    int etapa;

    public ProblemaCambioMoneda(int[] monedas, int cambio) {
    }


    @Override
    protected void Inicializa() {
        solución=new int[monedas.length];
        candidato = 0;
        etapa = 0;
    }
    @Override
    protected boolean fin() {
        return etapa> monedas.length;
    }
    @Override
    protected void seleccionaYEliminaCandidato() {
        candidato=cambio/monedas[etapa];
    }

    @Override
    protected boolean esPrometodor() {
        return true;
    }
    @Override
    protected void AnotaEnSolución() {
        solución[etapa] = candidato;
        cambio=cambio - monedas[etapa] * candidato;
        etapa++;
    }

}

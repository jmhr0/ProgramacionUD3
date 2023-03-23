package org.ieslosremedios.daw1.prog.ut6.algoritmiaAvanzada.algoritmoVoraz;

import java.util.Arrays;

public class ProblemaMochilaFaccionaria extends EsquemaVoraz {
    private int n;
    private Double max;
    private Double pesoActual;

    private Double[] pesos;
    private Double[] valores;

    public ProblemaMochilaFaccionaria(int n, Integer max, Integer[] pesos, Integer[] valores) {
        this.n = n;
        this.max = max;
        this.pesos = pesos;
        this.valores = valores;
    }

    /**
     *
     */
    @Override
    protected void anotaEnSolucion() {
        if (pesoActual+pesos[etapa]<=max){
            candidato=1;
        }else{
            candidato= (max - pesoActual)/ pesos[etapa];
        }
        solucion[etapa] = candidato;

    }

    /**
     * @return
     */
    @Override
    protected boolean esPrometedor() {
        return true;
    }

    /**
     *
     */
    @Override
    protected void seleccionaYEliminaCandidato() {
        Integer mayor = valores[0]/pesos[0];
        int i ;
        for (i = 0; i < n; i++) {
            if (mayor < valores[i]/pesos[i]) {
                mayor = valores[i]/pesos[i];
            }
        }
        etapa = i;
        // Elimina candidato
        valores[etapa] = 0;
    }

    /**
     * @return
     */
    @Override
    protected boolean fin() {
        return max == pesoActual;
    }

    /**
     *
     */
    @Override
    protected void inicializa() {
        solucion = new Object[n];
        Arrays.fill(solucion,0);
        pesoActual = 0;
    }
}

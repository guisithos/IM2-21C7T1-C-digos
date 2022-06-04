package br.dell.modelos;
import br.dell.modelos.Hospede;

public class Quarto {

    private int numeroQuarto;
    private Hospede hospede;

    public Quarto(int numero, Hospede hospede) {
        this.numeroQuarto = numero;
        this.hospede = hospede;
    }

    public int getNumero() {
        return numeroQuarto;
    }

    public void setNumero(int numero) {
        this.numeroQuarto = numero;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
}

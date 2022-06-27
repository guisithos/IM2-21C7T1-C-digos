package br.dell.model;
/**
 * @author: Guilherme Thomas
 * @version: v0.5
 * @param: nome, endereço, idade, cpf e rg do Hóspede, número do Quarto
 * */


public class Hospede {
    private String nome;
    private String endereco;
    private int idade;
    private long cpf;
    private long rg;
    private int numQuarto;

    /**
     *
     * @param nome Info do Hóspede
     * @param endereco Info do Hóspede
     * @param idade Info do Hóspede
     * @param cpf Info do Hóspede
     * @param rg Info do Hóspede
     * @param numQuarto Info do Hóspede no Hotel
     */

    public Hospede(String nome, String endereco, int idade, long cpf, long rg, int numQuarto) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }
}

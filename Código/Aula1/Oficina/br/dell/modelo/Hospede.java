package br.dell.modelos;

public class Hospede {
    private String nome;
    private String endereco;
    private int idade;
    private long CPF;
    private long RG;

    public Hospede(String nome, String endereco, int idade, long CPF, long RG, int numeroQuarto) {
        this.nome = "";
        this.endereco = "";
        this.idade = 0;
        this.CPF = 0;
        this.RG = 0;
    }

    public Hospede(String nome, int idade, long CPF, long RG, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    } //get = retornar set = ajustar

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}




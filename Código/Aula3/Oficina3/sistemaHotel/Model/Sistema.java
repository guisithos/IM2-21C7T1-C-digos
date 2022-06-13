package br.dell.model;

import java.util.*;

public class Sistema
{
    //Estrutura escolhida: List, ArrayList.
    //Estrutura armazena os dados dos clientes e quarto do hotel
    //Motivos: Estrutura dinamica, se cadastrar um hospede a array se redimensiona
    //Podemos manipular os dados na posição que estão
    private static ArrayList<Hospede> dados = new ArrayList<Hospede>();

    //obtem dados dos hóspedes
    public static void cadastrarHospede() {
        String nome, endereco;
        int idade, numQuarto;
        long cpf, rg;
        nome = EntradaSaida.receberNome("Nome:");
        endereco = EntradaSaida.receberString("Endereco:");
        idade = EntradaSaida.receberInt("Idade:");
        cpf = EntradaSaida.receberLong("CPF: ");
        rg = EntradaSaida.receberLong("RG: ");
        numQuarto = EntradaSaida.receberInt("Núm Quarto: ");

        Hospede hos;
        hos = new Hospede(nome, endereco, idade, cpf, rg, numQuarto);
        dados.add(hos);
    }
    
    //pesquisa hóspedes
    public static void pesquisarHospede() {
        String pesq = EntradaSaida.receberString("Pesquisar Hóspede: ");
        Hospede hos = retornarHospede(pesq);
        String saida = "";
        if (hos != null) {
            saida = saida + hos.getNome() + "\n";
            saida += hos.getEndereco() + "\n";
            saida += hos.getIdade() + "\n";
            saida += hos.getCpf() + "\n";
            saida += hos.getRg();
            saida += hos.getNumQuarto();
        } else {
            saida = "Hóspede não encontrado";
        }
        EntradaSaida.mostrarTexto(saida);
    }

    //recebe a pesquisa e busca o objeto
    private static Hospede retornarHospede(String pesq) {
        Hospede hos = null;
        for (int i=0; i<dados.size(); i++) {
            hos = dados.get(i);
            String nome = hos.getNome();
            if (nome.equalsIgnoreCase(pesq)) {
                return hos;
            }
        }
        return null;
    }
}

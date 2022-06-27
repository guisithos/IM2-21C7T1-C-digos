package br.dell.model;

import java.util.*;

/**
 * @author: Guilherme Thomas
 * @version: v0.5
 * @param: nome, endereço, idade, cpf e rg do Hóspede, número do Quarto
 * @return: Hóspede + num do quarto
 * */

/**Estrutura escolhida: List, ArrayList.
 Estrutura armazena os dados dos clientes e quarto do hotel
 Motivos: Estrutura dinamica, se cadastrar um hospede a array se redimensiona
 Podemos manipular os dados na posição que estão
 * */
public class Sistema
{

    private static ArrayList<Hospede> dados = new ArrayList<Hospede>();

    /** Recebe os dados dos Hóspedes e armazena na array
      */
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

    /** Realiza a pesquisa do Hóspede pelo nome
     */
    public static void pesquisarHospede() {
        String pesq = EntradaSaida.receberString("Pesquisar Hóspede: ");
        Hospede hos = retornarHospede(pesq);
        String saida = "";
        if (hos != null) {
            saida = saida + hos.getNome() + "\n";
            saida += hos.getEndereco() + "\n";
            saida += hos.getIdade() + "\n";
            saida += hos.getCpf() + "\n";
            saida += hos.getRg() + "\n";
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

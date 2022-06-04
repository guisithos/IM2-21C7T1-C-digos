package br.dell.modelos;

import br.dell.modelos.EntradaSaida;
import br.dell.modelos.Hospede;

import java.util.*;

public class Sistema
{
    //armazena hospedes
    private static ArrayList<Hospede> dados = new ArrayList<Hospede>();

    //obtem dados dos hospedes
    public static void cadastrarHospede() {
        String nome, endereco;
        int idade, numeroQuarto;
        long CPF, RG;

        nome = EntradaSaida.receberString("Nome: ");
        endereco = EntradaSaida.receberString("Endereço: ");
        idade = EntradaSaida.receberInt("Idade: ");
        CPF = EntradaSaida.receberLong("CPF: ");
        RG = EntradaSaida.receberLong("RG: ");
        numeroQuarto = EntradaSaida.receberInt("Número do Quarto: ");


        Hospede hosp;
        hosp = new Hospede(nome, endereco, idade, CPF, RG, numeroQuarto);
        dados.add(hosp);
    }

    public static void pesquisaHospede() {
        String pesq = EntradaSaida.receberString("Nome a pesquisar: ");
        Hospede hosp = retornarCliente(pesq);
        String saida = "";
        if (hosp != null) {
            saida = saida + hosp.getNome() + "\n";
            saida += hosp.getEndereco() + "\n";
            saida += hosp.getIdade();
            saida += hosp.getCPF();
            saida += hosp.getRG();

        } else {
            saida = "Cliente não encontrado";
        }
        EntradaSaida.mostrarTexto(saida);
    }

    private static Hospede retornarCliente(String pesq) {
        Hospede hosp = null;
        for (int i=0; i<dados.size(); i++) {
            hosp = dados.get(i);
            String nome = hosp.getNome();
            if (nome.equalsIgnoreCase(pesq)) {
                return hosp;
            }
        }
        return null;
    }
}

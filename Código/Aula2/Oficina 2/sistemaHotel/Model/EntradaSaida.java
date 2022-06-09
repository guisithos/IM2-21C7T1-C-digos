package br.dell.model;

import javax.swing.*;

public class EntradaSaida
{
    public static String receberNome(String msg) {
        String txt;
        txt = JOptionPane.showInputDialog(msg);
        //Em vez de retornar false/true, usei o replaceALL para substituir
        //tudo que não for letras de A a Z, tratando a entrada.
        txt = txt.replaceAll("[^a-zA-Z]", "");
        return txt;
    }

    //String pode receber número pois o endereço pode ser "Rua 33"
    public static String receberString(String msg) {
        String txt;
        txt = JOptionPane.showInputDialog(msg);
        return txt;
    }

    public static int receberInt(String msg) {
        try {
            String i;
            int p;
            i = JOptionPane.showInputDialog(msg);
            p = Integer.parseInt(i);
            return p;
        //Exception avisa erro na tela quando uma letra é inserida no lugar de Int
        } catch (Exception e) {
            mostrarTexto("Favor digitar apenas números!");
        }
        return 0;
    }

    public static long receberLong(String msg) {
            String i;
            long d;
            i = JOptionPane.showInputDialog(msg);
            //replaceALL trata o input e retira a vírgula (pode tbm retirar tudo que não for 0-9)
            i = i.replaceAll(",", "");
            d = Long.parseLong(i);
            return d;

    }

    public static void mostrarTexto(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}

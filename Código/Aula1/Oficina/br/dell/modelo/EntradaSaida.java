package br.dell.modelos;

import javax.swing.*;

public class EntradaSaida
{
    public static String receberString(String msg) {
        String t;
        t = JOptionPane.showInputDialog(msg);
        return t;
    }

    public static int receberInt(String msg) {
        String i;
        int p;
        i = JOptionPane.showInputDialog(msg);
        p = Integer.parseInt(i);
        return p;
    }

    public static long receberLong(String msg) {
        String i;
        long p;
        i = JOptionPane.showInputDialog(msg);
        p = Long.parseLong(i);
        return p;
    }

    public static void mostrarTexto(String t) {
        JOptionPane.showMessageDialog(null, t);
    }
}

public class Principal {
    public static void main(String s[]) {
        System.out.println("Deseja verificar qual venda?");

        System.out.println("1 - Venda 1");
        System.out.println("2 - Venda 2");

          if (s[0].equals("1")) {
               System.out.println("Venda 1");
          } else if (s[0].equals("2")) {
              System.out.println("Venda 2");
          } else {
                System.out.println("Venda não encontrada");
          }
        System.out.println(Principal.vendasPrint());

    }
    public static Venda vendasPrint() {
        Cliente cliente1 = new Cliente("João", "Silva");
        Cliente cliente2 = new Cliente("Pedro", "Cruz");

        Produto produto1 = new Produto("Pacote de Vetores - Shapes Redondos", "www.google.com.br", 379);
        Produto produto2 = new Produto("Sample Rock V.05", "www.google.com.br", 119);
        Produto produto3 = new Produto("Pacote de Áudio - Sonoplastia", "www.google.com.br", 559);
        Produto produto4 = new Produto("Pacote fotografias - Carro ao por do sol", "www.google.com.br", 99);
        Produto produto5 = new Produto("Pacote de Texturas - Carbono", "www.google.com.br", 59);
        Produto produto6 = new Produto("Sample Rock V.08", "www.google.com.br", 219);

        Venda venda1 = new Venda(cliente1, produto1, 379);
        Venda venda2 = new Venda(cliente2, produto2, 119);

        return venda1;
    }
}

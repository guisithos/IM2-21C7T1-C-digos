import java.util.Scanner;

class mensagemCifrada {

    //Metodo que "gira" cada caracter da mensagem escrita

    public static StringBuffer Cifrar(String textoOriginal, int s) {

        StringBuffer resultado = new StringBuffer();

        for (int i = 0; i< textoOriginal.length(); i++) {

            if (Character.isUpperCase(textoOriginal.charAt(i))) {

                char ch = (char)(((int) textoOriginal.charAt(i) +
                        s % 26));
                resultado.append(ch);
            }
            else {

                char ch = (char)(((int) textoOriginal.charAt(i) +
                        s % 26));
                resultado.append(ch);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        Scanner scanMsg = new Scanner(System.in);
        System.out.print("Digite a mensagem a ser cifrada: ");
        String text = scanMsg.nextLine();

        Scanner scanInt = new Scanner(System.in);
        System.out.print("Digite o numero de rotacoes: ");
        int rotacoes = scanInt.nextInt(); {

            while (rotacoes < 0) {
                System.out.print("Favor digitar um valor valido: ");
                rotacoes = scanInt.nextInt();
            }
        }
        System.out.println("Mensagem Cifrada: " + Cifrar(text, rotacoes));
    }
}

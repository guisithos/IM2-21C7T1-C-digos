public class ContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        operacaoBancaria creditar = new Creditar -> {
            double saldo + double valor;
            };
        operacaoBancaria debitar = new Debitar -> {
            double saldo - double valor;
            }
            System.out.println("Saldo pós credito: " + conta.saldo(operacaoBancaria.Creditar(50)));
            System.out.println("Saldo pós débito: " + conta.saldo(operacaoBancaria.Debitar(10)));
    }
        double saldo;

        interface operacaoBancaria {
            static double Calcular(double saldo, double valor, operacaoBancaria operacao) {
                return saldo = saldo + valor;
            }
            private double realizarOperacao(double saldo, double valor, operacaoBancaria operacao) {
                return operacaoBancaria.Calcular(saldo, valor, operacao);
            }
        }
    }


import br.dell.model.EntradaSaida;
import br.dell.model.Sistema;

public class Principal
{
    public static void main(String s[]) 
    {
        String res = "sim";
        int opt = 0;
        while (res.equalsIgnoreCase("sim")) 
        {
            opt = EntradaSaida.receberInt("1: cadastro, 2: pesq");
            switch(opt) {
                case 1:
                    Sistema.cadastrarHospede();
                    break;
                case 2:
                    Sistema.pesquisarHospede();
                    break;
                default:
                    EntradaSaida.mostrarTexto("Inválida");
            }
            res = EntradaSaida.receberString("Continuar?");
        }
    }
}

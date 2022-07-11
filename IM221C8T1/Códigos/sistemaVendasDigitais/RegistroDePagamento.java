import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistroDePagamento {
    public String imprimeProdutos (final List<Produto> produtos) {
        StringBuilder s = new StringBuilder();
        for (Produto produto : produtos) {
            s.append(produto.getNome()).append(", ");
        }
        return s.toString().substring(0, s.length() - 2);
    }

    public List<Venda> colecaoVendas(final String nome, final List<Venda> sales) {
        List<Venda> vendaImagem = new ArrayList<Venda>();
        for (Venda sale : sales) {
            if (sale.getProduto().getNome().equals(nome)) {
                vendaImagem.add(sale);
            }
        }
        return vendaImagem;
    }
    public Date diaVenda() {
        Date data = new Date();
        return data;
    }

}

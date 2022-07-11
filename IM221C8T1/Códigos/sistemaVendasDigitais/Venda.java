public class Venda {
    private final Cliente comprador;
    private final Produto produto;
    private final double custo;

    public Venda(Cliente comprador, Produto produto, double custo) {
        this.comprador = comprador;
        this.produto = produto;
        this.custo = custo;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getCusto() {
        return custo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Venda other = (Venda) obj;
        if (comprador == null) {
            if (other.comprador != null)
                return false;
        } else if (!comprador.equals(other.comprador))
            return false;
        if (produto == null) {
            if (other.produto != null)
                return false;
        } else if (!produto.equals(other.produto))
            return false;
        return Double.doubleToLongBits(custo) == Double.doubleToLongBits(other.custo);
    }

    @Override
    public String toString() {
        return "Venda [Comprador: " + comprador + ", Produto: " + produto + ", Valor: " + custo + "]";
    }

}

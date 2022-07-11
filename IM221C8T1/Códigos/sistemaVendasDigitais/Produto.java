public class Produto {
    private final String nome;
    private final String path;
    private final double valor;

    public Produto (String nome, String path, double valor) {
        this.nome = nome;
        this.path = path;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getPath() {
        return path;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
            return false;
        return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
    }

    @Override
    public String toString() {
        return "Produto [Produto: " + nome + ", Endereço: " + path + "Valor: " + valor + "]";
    }

}

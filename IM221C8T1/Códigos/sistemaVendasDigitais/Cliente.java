public class Cliente {
    private final String nomeCliente;
    private final String sobreNomeCliente;

    public Cliente(String nomeCliente, String sobreNomeCliente) {
        this.nomeCliente = nomeCliente;
        this.sobreNomeCliente = sobreNomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getSobreNomeCliente() {
        return sobreNomeCliente;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (nomeCliente == null) {
            if (other.nomeCliente != null)
                return false;
        } else if (!nomeCliente.equals(other.nomeCliente))
            return false;
        if (sobreNomeCliente == null) {
            return other.sobreNomeCliente == null;
        } else return sobreNomeCliente.equals(other.sobreNomeCliente);
    }

    @Override
    public String toString() {
        return "Cliente [Nome: " + nomeCliente + ", Sobrenome: " + sobreNomeCliente + "]";
    }

}

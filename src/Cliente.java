import java.util.Date;

public abstract class Cliente implements ITaxas{

    private String nome;

    private String endereco;

    private Date data;

    public Cliente(String nome, String endereco, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data de criação: " + getData());
    }

    public abstract boolean autenticar(String chave);

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }
}

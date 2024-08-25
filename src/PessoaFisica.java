import java.util.Date;

public class PessoaFisica extends Cliente implements ITaxas{

    private String cpf;

    private int idade;

    private char genero;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char genero) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    public String toString() {
        System.out.println("---- PF ----");

            String pessoaFisicaString = "Nome = " + this.getNome() + "\n" + "Data = " + this.getData() + "\n" +
                    "Endereço = " + this.getEndereco() + "\n" +
                    "Cpf = " + this.getCpf() + "\n" + "Idade = " + this.getIdade() + "\n" +
                    "Gênero = " + this.getGenero();


            System.out.println("------------");
            return pessoaFisicaString;

    }

    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }else {
            PessoaFisica pFisíca = (PessoaFisica) obj;
            if (this.cpf.equals(pFisíca.cpf)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean autenticar(String chave){
        if(!(chave.equals(this.getCpf()))){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public double calculaTaxas() {
        return 10.0;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }
}

import java.util.Date;

public class PessoaJuridica extends Cliente implements ITaxas{

    private String cnpj;

    private int numFuncionarios;

    private String setor;

    public PessoaJuridica(String nome, String endereco, Date data, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco, data);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }


    public String toString() {
        System.out.println("---- PJ ----");
        String pessoaJuridiaString = "nome = " + this.getNome() + "\n" + "data = " + this.getData() + "\n" +
                            "endereco = " + this.getEndereco() + "\n"
                            + "cnpj = " + getCnpj() + "\n" + "numFuncionarios = " + getNumFuncionarios() + "\n" +
                            "setor = " + getSetor();

        System.out.println("------------");
        return pessoaJuridiaString;
    }

    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }else {
            PessoaJuridica pJuridica = (PessoaJuridica) obj;
            if (this.cnpj.equals(pJuridica.cnpj)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean autenticar(String chave){
        if(!(chave.equals(this.getCnpj()))){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public double calculaTaxas() {
        return 20.0;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

}


public class ContaCorrente extends Conta implements ITaxas{
    public ContaCorrente(int numero, Cliente dono, double saldo) {
        super(numero, dono, saldo);
    }

    @Override
    public void setLimite(double limiteMin, double limiteMax) throws IllegalArgumentException{
        if (limiteMin < -100) {
            this.limiteMin = -100; // Correção aqui para definir o limite mínimo como -100
            throw new IllegalArgumentException("limite esta abaixo do valor minimo: " + limiteMin + "R$");
        }
        this.limiteMin = limiteMin;
        this.limiteMax = limiteMax;

    }

    @Override
    public double calculaTaxas() {
        if(this.getDono().getClass() == PessoaFisica.class){
            return 10.0;
        }else{
            return 20.0;
        }
    }
}
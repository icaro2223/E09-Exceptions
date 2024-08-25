public class ContaPoupanca extends Conta implements ITaxas{

    public ContaPoupanca(int numero, Cliente dono, double saldo) {
        super(numero, dono, saldo);
    }
    @Override
    public void setLimite(double limiteMin, double limiteMax) throws IllegalArgumentException{

            if (limiteMin < 100) {
                this.limiteMin = 100;
                throw new IllegalArgumentException("Limite esta abaixo do valor Mínimo: " + limiteMin + "R$");
            }else if(limiteMax > 1000){
                this.limiteMax = 1000;
                throw new IllegalArgumentException("Limite esta acima do limite Máximo: " + limiteMax + "R$");
            }else {
                this.limiteMin = limiteMin;
                this.limiteMax = limiteMax;
            }


    }

    @Override
    public double calculaTaxas() {
        return 0;
    }
}


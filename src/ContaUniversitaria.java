public class ContaUniversitaria extends Conta implements ITaxas{

    public ContaUniversitaria(int numero, Cliente dono, double saldo){
        super(numero, dono, saldo);
    }

    @Override
    public void setLimite(double limiteMin, double limiteMax) throws IllegalArgumentException{
        if (limiteMin < 0) {
            this.limiteMin = 0;
            throw new IllegalArgumentException("Limite esta abixo do valor Minimo: " + limiteMin + "R$");
        }
        else if (limiteMax > 500) {
            this.limiteMax = 500;
            throw new IllegalArgumentException("Limite esta acima do valor Maximo: " + limiteMax + "R$");
        }
        else {
            this.limiteMin = limiteMin;
            this.limiteMax = limiteMax;
        }

    }

    @Override
    public double calculaTaxas() {
        return 0.0;
    }
}

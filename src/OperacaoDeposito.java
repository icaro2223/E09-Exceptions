public class OperacaoDeposito extends Operacao implements ITaxas{

    public OperacaoDeposito(double valor) {

        super('d', valor);
    }

    public String toString(){
        System.out.println("---Depósito---");
        String operacaoD = "Tipo = " + this.getTipo() + "\n" + "Valor = " + this.getValor() + "\n";

        System.out.println("--------------");

        return operacaoD;
    }

    @Override
    public double calculaTaxas() {
        return 0.0;
    }
}

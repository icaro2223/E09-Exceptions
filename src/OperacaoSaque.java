public class OperacaoSaque extends Operacao implements ITaxas{

    public OperacaoSaque(double valor) {

        super('s', valor);
    }

    public String toString(){
        System.out.println("---Saque---");
        String operacaoS = "Tipo = " + this.getTipo() + "\n" + "Valor = " + this.getValor() + "\n";

        System.out.println("-----------");

        return operacaoS;
    }

    @Override
    public double calculaTaxas() {

        return 0.05;
    }
}

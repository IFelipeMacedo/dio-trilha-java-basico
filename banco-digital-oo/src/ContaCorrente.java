public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente); // super sozinho chama o construtor da classe pai
    }

    public void imprimirExtrato() {
        System.out.println("---Extrato da conta corrente---");
        super.imprimirInfosComuns();
    }

}

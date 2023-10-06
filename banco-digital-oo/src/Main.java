public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {

        Banco banco = new Banco();
        banco.setNome("Banco do Coração\n");
        System.out.println(banco.getNome());

        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

        Conta cc2 = new ContaCorrente(cliente2);
        banco.adicionarConta(cc2);

        try {
            cc2.sacar(50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        Conta cc1 = new ContaCorrente(cliente1); //ja gera automaticamente o numero e agencia, pois, na classe Conta, o construtor já faz isso automaticamente por que é um atributo static
        Conta poupanca1 = new ContaPoupanca(cliente1);

        banco.adicionarConta(cc1);
        banco.adicionarConta(poupanca1);

        try {
            cc1.depositar(150);
            cc1.transferir(poupanca1, 50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();
        cc2.imprimirExtrato();

        System.out.print("\n");
        banco.listarContas();
    }


}

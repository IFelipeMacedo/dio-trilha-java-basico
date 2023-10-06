public  abstract class Conta implements IConta{           //quando a classe é abstrata, não pode ser instanciada, só as filhas dela podem

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;  //static é um atributo da classe, não do objeto. Não é necessário instanciar um objeto para acessar o atributo

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente; //composição, pois, a classe cliente não pode existir sem a classe conta
    //estamos criando uma variavel do tipo cliente dentro da classe conta 



    public Conta(Cliente cliente) {     //construtor é chamado quando a classe é instanciada automaticamente

        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque");
        } else if (saldo >= valor) {
            saldo -= valor;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para movimentação no valor de: " + valor);
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.getAgencia()));
        System.out.println(String.format("Número: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

    public Cliente getCliente() {
        return cliente;  //retorna o objeto cliente que está dentro da classe conta
    }

    public String getNome() {
        return null;
    }

}

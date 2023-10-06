import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>(); // Inicializa a lista de contas vazia
    }
    
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Não há contas no banco.");
        } else {
            System.out.print("Lista de contas do banco " + nome.trim() + ":\n");
            for (Conta conta : contas) {
                System.out.println("Nome do cliente: " + conta.getCliente().getNome()); // Acessa o atributo nome do cliente da conta
                System.out.println("Número da conta: " + conta.getNumero());
                System.out.println("Saldo da conta: " + conta.getSaldo());
                // Adicione outros atributos da conta que deseja listar
            }
        }
    }
}

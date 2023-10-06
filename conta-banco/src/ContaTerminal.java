import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo\nDigite o número da conta: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a agência: ");
        String agency = scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        String name = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double balance = Double.parseDouble(scanner.nextLine());

        System.out.printf("Olá %s, obrigado por criar sua conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", name, agency, number, balance);
        scanner.close();
    }
}
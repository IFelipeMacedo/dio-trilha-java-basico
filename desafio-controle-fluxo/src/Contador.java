import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int first = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int second = scanner.nextInt();
        scanner.close();

        try {
            count(first, second);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    

    static void count(int first, int second) throws ParametrosInvalidosException {
        if (first > second) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int subtraction = second - first;

        for (int i = 1; i <= subtraction; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
    

}
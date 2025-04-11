import java.util.Scanner;

public class DesafioContador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();

        try {
            contar(x, y);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
        }

        sc.close();
    }

    static void contar(int x, int y) throws ParametrosInvalidosException {
        if (x > y) {
            throw new ParametrosInvalidosException();
        }

        int contagem = y - x;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número: " + i);
        }
    }
}



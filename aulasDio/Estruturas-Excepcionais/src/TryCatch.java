import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
       

        try {
            
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            
            
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();
            String NomeCompleto = nome.concat(" ").concat(sobrenome).toUpperCase();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
            
            String texto = String.format("%nOlá me chamo %s%nTenho %d anos%nMinha altura é  %.2f cm.%n", NomeCompleto, idade, altura);
            System.out.println(texto);
            
            sc.close();
        
        } catch (InputMismatchException e) {
            System.out.println("Campos idade e altura precisam ser numéricos");
        }
    }
}

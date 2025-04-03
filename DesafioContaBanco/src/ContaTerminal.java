import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.next(); 
        sc.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String Sobrenome = sc.next(); 
        sc.nextLine();
        String NomeCLiente = nome.concat(" ").concat(Sobrenome); 
        System.out.print("Digite sua agência: ");
        String Agencia = sc.next();
        System.out.print("Digite o número da sua agência: ");
        int Numero = sc.nextInt();
        System.out.print("Digite seu saldo: ");
        double Saldo = sc.nextDouble(); 

        String texto = String.format("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",NomeCLiente,Agencia,Numero,Saldo);
        System.out.println(texto);

        sc.close();
    }
}

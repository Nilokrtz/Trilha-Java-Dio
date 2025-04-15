package ExerciciosPolimorfismo.Banco;
import java.util.Scanner;

import ExerciciosPolimorfismo.Banco.entities.Banco;

public class Saldo {
    public static void main(String[] args)  {

        Menu();
        
    }
    
public static void Menu(){
    Scanner sc =new Scanner(System.in);
    int opcao = 0;
    Banco banco = new Banco();
        
    System.out.println("\nOlá seja Bem vindo!\nRealize seu primeiro depósito");
    int dinheiro = sc.nextInt();
    banco.PrimeiroDeposito(dinheiro);

    do {
        System.out.println("[ 1 ] Consultar saldo\n" + 
        "[ 2 ] Consultar cheque especial\n" + 
        "[ 3 ] Depositar dinheiro\n" + 
        "[ 4 ] Sacar dinheiro\n" + 
        "[ 5 ] Pagar um boleto\n" + 
        "[ 6 ] Sair \n");
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                banco.ConsultarSaldo();
            break;
            case 2:
                banco.ConsultarChequeEspecial();
            break;
            case 3:
                System.out.println("Digite quanto deseja depositar: ");
                dinheiro = sc.nextInt();
                banco.Depositar(dinheiro);
            break;
            case 4:
                System.out.println("Digite quanto deseja sacar: ");
                dinheiro = sc.nextInt();
                banco.Sacar(dinheiro);
            break;
            case 5:
                System.out.println("Digite o valor do boleto que irá pagar: ");
                int boleto = sc.nextInt();
                banco.PagarBoleto(boleto);
            break;
            case 6:
                System.out.println("Programa será encerrado !");
            break;
            default:
                System.out.println("Opção inválida !!");
            break;
        }
    } while (opcao != 6);
    sc.close();
    }
}

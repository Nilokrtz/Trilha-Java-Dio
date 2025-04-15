package ExerciciosPolimorfismo.Banco.entities;

public class Banco {
    
    private double saldo = 0;
    private double limite;
    
    public Banco() {
        
    }    

    public void ConsultarSaldo(){
        System.out.println("Seu saldo é de: " + saldo);
         
    }
    public void VerificarSeEstaUsandoChequeEspecial() {
        if (saldo < 0) {
            double valorUsado = Math.abs(saldo);
            System.out.printf("Você está utilizando R$%.2f do cheque especial. Juros a pagar: R$%.2f%n", 
                              valorUsado, valorUsado * 0.2);
        } else {
            System.out.println("Você não está utilizando o cheque especial.");
        }
    }
    public void ConsultarChequeEspecial() {
        if (saldo >= 0) {
            System.out.printf("Você tem até R$%.2f de cheque especial disponíveis.%n", limite);
        } else {
            double restante = limite - Math.abs(saldo);
            if (restante > 0) {
                System.out.printf("Você ainda pode usar R$%.2f do cheque especial.%n", restante);
            } else {
                System.out.println("Você estourou completamente o limite do cheque especial!");
            }
        }
    }
    public void Depositar(double dinheiro){
            saldo += dinheiro;

            System.out.printf("Depósito de R$%.2f realizado com sucesso. Novo saldo: R$%.2f%n", 
            dinheiro, saldo);
    }
    public void Sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado. Saldo atual: R$%.2f%n", valor, saldo);
        } else {
            System.out.printf("Saque negado! Valor solicitado: R$%.2f | Limite total disponível: R$%.2f%n", 
                              valor, saldo + limite);
        }
    }
    public void PagarBoleto(double boleto){
        if (saldo >= boleto) {
            saldo -= boleto;
            System.out.printf("Boleto de R$%.2f pago com sucesso! Saldo atual: R$%.2f%n", 
                             boleto, saldo);
        } else {
            System.out.printf("Saldo insuficiente! valor do boleto: R$%.2f | Saldo disponível: R$%.2f%n", 
                             boleto, saldo);
        }
    }

    public void PrimeiroDeposito(double valor) {
        saldo += valor;
    
        if (valor < 500) {
            limite = 50;
        } else {
            limite = valor * 0.5;
        }
    
        System.out.printf("Depósito inicial de R$%.2f realizado. Limite de cheque especial definido: R$%.2f%n", valor, limite);
    }
    
}

package ExerciciosHeranca.entities;

import java.util.Scanner;

public abstract class Funcionario {

    Scanner sc = new Scanner(System.in);

    private  String nome;
    private  String email;
    private  String senha;
    private boolean admin;
    
    public Funcionario() {
    }

    public Funcionario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void RealizarLogin(){
        System.out.print("Digite seu email: ");
        String x = sc.next();
        System.out.print("Digite sua senha: ");
        String y = sc.next();

        if(email.equals(x) && senha.equals(y))
            System.out.println("Login Realizado");
        else
            System.out.println("Login Inválido");
        
        
    }
    
    public void RealizarLogOff(){
        
        System.out.println("Deslogando do sistema");
        
    }
    
    public void AlterarDados(){
        System.out.print("Digite seu novo email: ");
        String x = sc.next();
        System.out.print("Digite sua nova senha: ");
        String y = sc.next();
        
        email = x;
        senha = y;
        
        System.out.printf("Seu novo email é: %s%nE sua nova senha é: %s%n", email, senha);

    }
    
    public void AlterarSenha(){
        
        System.out.print("Digite sua nova senha: ");
        senha = sc.next(); // usa o atributo diretamente
        System.out.println("Sua nova senha é: " + senha);
        

    }
    

}

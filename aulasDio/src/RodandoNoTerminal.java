public class RodandoNoTerminal {
    public static void main(String[] args) {
        
        String nome = args[0]; 
        String sobrenome = args[1]; 
        int idade = Integer.valueOf(args[2]);   
        double altura = Double.valueOf(args[3]);   

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        // rodar no terminal, entrer na pasta bin do projeto e execute ' java nome do arquivo '
        // Caso haja args deve por ao lado da execução do código
    }
}

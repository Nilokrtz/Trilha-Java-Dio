public class ForArray {

    public static void main(String[] args) {
        
        String alunos [] = {"FELIPE","JONAS","NILO", "GABRIEL"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("o aluno "+ (i+1) + " é " + alunos[i]);
        }
        
        
        // Como se fosse um for each

        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
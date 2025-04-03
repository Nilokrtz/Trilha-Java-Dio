public class BreakContinue {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                break;           // o break para a execução ao chegar no número

            System.out.println(i);    
        }
        
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;     // o continue pula o número e continua a execução
    
            System.out.println(i);    
        }
    }
}
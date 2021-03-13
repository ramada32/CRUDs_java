//Entrada1 java
import java.util.Scanner;

public class Entrada{

    public static void main(String[]args){
        
         Scanner n1 = new Scanner(System.in);
       System.out.println("digite seu nome ");
         String nome = n1.nextLine();
          System.out.println("endereco residencia ");
         String endereco = n1.nextLine();
    System.out.println("numero da casa ");
         int numero = n1.nextInt();
    
         System.out.println("Nome = " + nome + "\n endereco \n" +endereco+ "\n numero da casa\n " + numero);
    
    }
}
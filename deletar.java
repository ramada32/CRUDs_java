//detar elementos do array
import java.util.Scanner;

public class deletar{

    public static void main(String[]args){
      Scanner n1 = new Scanner(System.in);
    
    
    
        int v[] = new int[5];
           for (int i = 0;i<5;i++){
                System.out.println("digitar numero  "+i);
               v[i] = n1.nextInt();
                System.out.println("numeros = " +v[i]);
           }
           while(true){
           System.out.println("escolher campo para tirar " );
           int e = n1.nextInt();
              for (int i = 0;i<5;i++){
           if(e == v[i]){
           		   v[i] = -1;
           		  for (i = 0;i<5;i++){
           
                System.out.println("numeros = " +v[i]);
                }
                System.out.println("digite -1 pra sair ou 0 para continuar " );
           int eo = n1.nextInt();
          
                  continue;
           
           }
           	  }
           	 
           
           
           
    }






}
}
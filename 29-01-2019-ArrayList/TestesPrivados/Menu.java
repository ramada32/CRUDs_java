// Test array list
import java.util.Scanner;




public class Menu{
	
	 private static Scanner n1 = new Scanner(System.in);
	
	public static void say(){
	
		say("",true);
	}
	
	public static void say(String s){
		
		say(s,true);
	}
	
	public static void say(String s,boolean a){
		if(a){
			System.out.println(a);
		}else{
			System.out.print(a);
		}
	}
	

     private static void principal(){
                    
       say("------------------------------menu--------------------------------");
       say("1 - criar cliente ------------------------------------------------");
       say("2 - editar cliente -----------------------------------------------");
       say("3 - excluir pelo id ----------------------------------------------");
       say("4 - excluir pelo nome --------------------------------------------");
       say("0 - sair ---------------------------------------------------------");
       int op = n1.nextInt();
       switch(op){
       case 1:    break;
       	   case 2:    break;
       	   	   case 3:    break;
       	   	   	   case 4:    break;
       	   	   	   	   default :  say("fim do programa"); break;
       }
     }


   public static void main(String[]args){
   principal();
     
   
   }  
}
    
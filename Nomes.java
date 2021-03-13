//nomes aleatorios


public class Nomes{
  
   public static void main(String[]args){
   
   if(args.length == 0){
   System.out.println("informar nome" + args.length);
    return;
   }
   System.out.println("informar nome" + args.length +"nome(a)!");
   for(int i = 0; i< args.length; i++){
   	   
   	   int index = i + 1;
   		
   		
   		System.out.println(index + " : " +args[i]);
     }
   }
 }
 
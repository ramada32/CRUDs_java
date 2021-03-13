//calculadora1


public class Calculadora{
   public static void main(String[]args){
      
   
   System.out.println("calcular dois valores");
  
   	  
  
 
   if(args.length != 2){
   	      System.out.println("teste soma de dois numeros" + args.length);
   	    return;
  }
  	    int x = Integer.parseInt(args[0]);
   int y = Integer.parseInt(args[1]);
   
   int result = x + y;
   
  	  System.out.println("soma do  "+x+" com "+y+" = "  + result);
     }
   
}
   
//Calculadora 2

public class Calculadora2{

   public static void main(String[]args){
     
   
   	System.out.println(	"subtracao de dois valores");
   	
   	
   	  int x = Integer.parseInt(args[0]);
   
   	  int y = Integer.parseInt(args[2]);

   	  char op = args[1].charAt(0);
   	  int result = 0;
   	  if(op == '+'){
   	  	  result = x + y;
   	  	  System.out.println("resultado da soma = " + result);
   	  	  
   	  }else if(op == '-'){
   	  	  result = x - y;
   	  	  System.out.println("resultado da subtracao = " + result);
   	  	  
   }
   else if(op == '*'){
   	  	  
   	  	  result = x * y;
   	  	  System.out.println("resultado da multiplicacao = " + result);
   }
   else{
   	  	 
   	  	   result = x / y;
   	  	  System.out.println("resultado da divisao = " + result);
   }




}}
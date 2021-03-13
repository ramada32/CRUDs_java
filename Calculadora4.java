//calculadora4 Scanner
import java.util.Scanner;


public class Calculadora4{

    public static void main(String[]args){


         Scanner n1 = new Scanner(System.in);
         
         float resultado;
         System.out.println("digite o primeiro valor");
         int num1 = n1.nextInt();
         
         System.out.println("escolha uma operacao");
         char op = n1.next().charAt(0);
         
         System.out.println("digite o segundo valor");
         int num2 = n1.nextInt();
         
         switch(op){
         
         case '+' :resultado = num1 + num2; System.out.println("\n resutado da soma = " +resultado);break;
         case '-' :resultado = num1 - num2; System.out.println("\n resultado da subtracao = " +resultado);break;
         case '/' :resultado = num1 / num2; System.out.println("\n resultado da divisao = " +resultado);break;
         case '*' :resultado = num1 * num2; System.out.println("\n resultado da multiplicacao = " +resultado);break;
         }
      }
   }
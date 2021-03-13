// try catch 

import java.util.Scanner;

public class TryCatch{

  public static void main(String[]args){
  
 
      	  
      	  String s1 = null;
String s2 = "felipe";
String s3 = s2;
String s4 = new String("felipe");
String s5 = new String(s2);

      	  

System.out.println(s1 == s2 ? "verdadeiro": "falso"); // (null == "John Doe")        false        s1 eh null, portanto s1 não aponta para um endereço de memória valido!
System.out.println(s2 == s3 ? "verdadeiro": "falso"); // ("John Doe" == "John Doe")    true        s2 e s3 apontam para o MESMO ENDEREÇO DE MEMÓRIA!
System.out.println(s2 == s4 ? "verdadeiro": "falso"); // ("John Doe" == "John Doe")    false        s2 e s4 apontam para ENDEREÇOS DE MEMÓRIA DIFERENTES!
System.out.println(s2 == s5 ? "verdadeiro": "falso"); // ("John Doe" == "John Doe")    false        s2 e s5 apontam para ENDEREÇOS DE MEMÓRIA DIFERENTES!
     
System.out.println("Felipe" .equals("felipe"));
System.out.println("Felipe" .equalsIgnoreCase("felipe"));
System.out.println(s2.equals("felipe"));
System.out.println(s2.equals(s5));





  }
}

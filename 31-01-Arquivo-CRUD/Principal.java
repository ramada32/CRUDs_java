import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;


public class Principal{


   
  public static void main(String[]args){
  	 
  	   Funcionario fa = new Funcionario();
  	   fa.Lista();
  	  Scanner n1 = new Scanner(System.in);
  	  //FuncionarioT fun = new FuncionarioT();
  	 
  	  System.out.println("digite nome para salvar");
  	  String nome = n1.nextLine();
  	  //fun.setNome(nome);
  	  fa.insere(nome);
  	   System.out.println("----lista----");
  	  fa.Lista();

  }
}
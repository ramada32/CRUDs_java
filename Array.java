//array
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Array{
  
   public static void main (String[]args){

   	   Scanner n1 = new Scanner(System.in);
   	   String nome = null;
nome = JOptionPane.showInputDialog("Qual é o seu nome? \n");
JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");

String res = null;
res = JOptionPane.showInputDialog("qual seu endereco? \n");
JOptionPane.showConfirmDialog(null, "O seu endereco realmente e " + res + "?");

int numero = null;
numero = JOptionPane.showInputDialog("numero residencial?");
JOptionPane.showConfirmDialog(null, "O seu numero residencial realmente é " + numero + "?");

int idade = null;
idade = JOptionPane.showInputDialog("idade?");
JOptionPane.showConfirmDialog(null, "O seu nome é " + idade + "?");

int idade = null;
idade = JOptionPane.showInputDialog(null,"a sua idade realmente e " +idade);
}

}
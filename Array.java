//array
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Array{
  
   public static void main (String[]args){

   	   Scanner n1 = new Scanner(System.in);
   	   String nome = null;
nome = JOptionPane.showInputDialog("Qual � o seu nome? \n");
JOptionPane.showConfirmDialog(null, "O seu nome � " + nome + "?");

String res = null;
res = JOptionPane.showInputDialog("qual seu endereco? \n");
JOptionPane.showConfirmDialog(null, "O seu endereco realmente e " + res + "?");

int numero = null;
numero = JOptionPane.showInputDialog("numero residencial?");
JOptionPane.showConfirmDialog(null, "O seu numero residencial realmente � " + numero + "?");

int idade = null;
idade = JOptionPane.showInputDialog("idade?");
JOptionPane.showConfirmDialog(null, "O seu nome � " + idade + "?");

int idade = null;
idade = JOptionPane.showInputDialog(null,"a sua idade realmente e " +idade);
}

}
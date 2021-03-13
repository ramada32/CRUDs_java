import java.util.Scanner;
import java.util.Date;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class FuncionarioDAOTest1 {
  private static final String SYSTEM_NAME = "Cadastro de Clientes (DAO + Array)";
  private static final String SYSTEM_VERSION = "Versao 1.0";
  private static final String SYSTEM_AUTHOR = "Felipe Ramada Dos Santos";
  private static final String SYSTEM_DATE = "30/01/2019";

	public static Scanner n1 = new Scanner(System.in);
	
	private static void altera() {  
		Funcionario fun = new Funcionario();
		 FuncionarioDAO dao = new FuncionarioDAO();
		System.out.println("digite seu Id para alterar os dados");
  	    int id = n1.nextInt();
  	    if(dao.contains(id)){		
		System.out.println("digite seu nome");
  	    String nome = n1.next();
  	   
  	    System.out.println("digite seu salario");
  	    double salar = n1.nextDouble();
  	    
  	     System.out.println("digite sua admissao");
  	     String adm = n1.next();
  	     
  	     Date d = Utils.toDate(adm);
  	     fun.setId(id);
  	     fun.setNome(nome);
  	     fun.setAdmissao(d);
  	     fun.setSalario(salar);
  	     dao.alterar(fun);
		} else {
			Utils.say("\nFuncionario inexistente!");
		}
	}

		private static void insere() {  
  	  
    
  	  
     Funcionario fun = new Funcionario();
     FuncionarioDAO dao = new FuncionarioDAO();
    
  	  System.out.println("digite seu Id");
  	  int id = n1.nextInt();
  	  
  	   System.out.println("digite seu nome");
  	   String nome = n1.next();
  	   
  	    System.out.println("digite seu salario");
  	    double salar = n1.nextDouble();
  	    
  	     System.out.println("digite sua admissao");
  	     String adm = n1.next();
  	     Date d = Utils.toDate(adm);
  	     fun.setId(id);
  	     fun.setNome(nome);
  	     fun.setAdmissao(d);
  	     fun.setSalario(salar);
  	     dao.inserir(fun);
  	  // Testar todos os métodos de FuncionarioDAO
    
  }
  
  private static void DeletaNome() {  
  	   Funcionario fun = new Funcionario();
  	   FuncionarioDAO dao = new FuncionarioDAO();
  	   System.out.println("digite seu nome para deletar linha");
  	   String nome = n1.next();
  	 if(dao.containsName(nome)){
			dao.deleteByName(nome);
		} else {
			Utils.say("\nFuncionario inexistente!");
		}
   }
   
     private static void DeletaId() {  
     	   FuncionarioDAO dao = new FuncionarioDAO();
  	  Utils.say("Digite o ID que deseja deletar: ", false);
		int id = n1.nextInt();
		if(dao.contains(id)){
			dao.deletaById(id);
		} else {
			Utils.say("\nFuncionario inexistente!");
		}
  	    
   }
      
  private static void showMenu() {
  	  Funcionario fun = new Funcionario();
    Utils.say();
    String traces = Utils.replicate("-", 50);
    Utils.say(traces);
    Utils.say(SYSTEM_NAME + " - " + SYSTEM_VERSION);
    Utils.say("Author: " + SYSTEM_AUTHOR + " - " + SYSTEM_DATE);
    Utils.say(traces);
    fun.Lista();    
    Utils.say("Menu");
    Utils.say("----");
    Utils.say("1-Novo Cliente");
    Utils.say("2-Altera Nome do Funcionario");
    Utils.say("3-Deleta Funcionario por Id");
    Utils.say("4-Deleta Funcionario por Nome");
    Utils.say("0-Sair");
    Utils.say();
  }
  
  public static void main(String[] args) {
    
  	   int option = Integer.MAX_VALUE;                                                   
    do {
      showMenu();
      Utils.say("Digite sua opcao: ", false);
      option = n1.nextInt(); n1.nextLine();
      switch(option) {
		  case 1: insere(); break;
		  case 2: altera(); break;
		  case 3:  DeletaId(); break;
		  case 4: DeletaNome(); break;
		  default:    Utils.say("Bye"); break;
      }
    }while(option != 0);
      Utils.say("Bye");

}
}

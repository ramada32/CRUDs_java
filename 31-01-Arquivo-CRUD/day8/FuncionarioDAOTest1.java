import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Date;

public class FuncionarioDAOTest1 {
  
public static Scanner sc = new Scanner(System.in);
  	    private static final String SYSTEM_NAME = "Cadastro de Clientes (DAO + Array)";
  private static final String SYSTEM_VERSION = "Versao 1.0";
  private static final String SYSTEM_AUTHOR = "Felipe Ramada Dos Santos";
  private static final String SYSTEM_DATE = "30/01/2019";
  	      private static FuncionarioDAO dao = new FuncionarioDAO();
    private static void insere() {
    //cria um novo cliente id e nome;

    Utils.say("Digite um novo id: ", false);
    int id = sc.nextInt(); sc.nextLine();
    if(id > 0) {
      
       // NOT FOUND
        Utils.say("Digite um novo nome: ", false);
        String nome = sc.nextLine();
        Utils.say("voce quer adicionar data de nascimento do cliente \n 1- sim \n 2- nao \n: ", false);
        int dat = sc.nextInt();
        if(dat != 2){
            Utils.say("Digite data de nascimento DD/MM/yyyy : ", false);
            String date = sc.next();
            Date d = Utils.toDate(date);
            Funcionario fun = new Funcionario();
            fun.setId(id);
            fun.setAdmissao(d);
            fun.setNome(nome);
            dao.insere(fun);
        }
        
        else {
         Funcionario fun = new Funcionario();
        fun.setId(id);
        fun.setNome(nome);
        dao.insere(fun);
      }
    
  }
  }
   //altera nome do cliente pelo id;
  private static void altera() {
  	    
   }

 
    //Deleta id do cliente;
  private static void deletaById() { 
  	      
  }       
  //Deleta nome do cliente;
  private static void deletaByName() {  
  
   }  
   
  
  //Menu do sistema;
  private static void showMenu() {
    Utils.say();
    String traces = Utils.replicate("-", 50);
    Utils.say(traces);
    Utils.say(SYSTEM_NAME + " - " + SYSTEM_VERSION);
    Utils.say("Author: " + SYSTEM_AUTHOR + " - " + SYSTEM_DATE);
    Utils.say(traces);
    //lista de srquivos 
    Utils.say("Menu");
    Utils.say("----");
    Utils.say("1-Novo Cliente");
    Utils.say("2-Altera Nome do Cliente");
    Utils.say("3-Deleta Cliente por Id");
    Utils.say("4-Deleta Cliente por Nome");
    Utils.say("0-Sair");
    Utils.say();
  }
  //Menu do sistema com os switch case de inserir,alterar e deletar e mensagem de sair;
  public static void main(String[] args) {
    int option = Integer.MAX_VALUE;                                                   
    do {
      showMenu();
      Utils.say("Digite sua opcao: ", false);
      option = sc.nextInt(); sc.nextLine();
      switch(option) {
		  case 1: insere(); break;
		  case 2: altera(); break;
		  case 3: deletaById(); break;
		  case 4: deletaByName(); break;
		  default:    Utils.say("Bye"); break;
      }
    }while(option != 0);
      Utils.say("Bye");
  }
    // Testar todos os métodos de FuncionarioDAO
    
  }



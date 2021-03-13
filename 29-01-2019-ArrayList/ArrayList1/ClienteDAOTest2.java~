
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class ClienteDAOTest2 {
  private static final String SYSTEM_NAME = "Cadastro de Clientes (DAO + Array)";
  private static final String SYSTEM_VERSION = "Versao 1.0";
  private static final String SYSTEM_AUTHOR = "Felipe Ramada Dos Santos";
  private static final String SYSTEM_DATE = "30/01/2019";

  private static ClienteDAO dao = new ClienteDAO();
    ArrayList Cliente = new ArrayList();
  
  private static Scanner sc = new Scanner(System.in);
  
  private static void listData() {
    Cliente[] clientes = dao.list();
    for(int i=0; i < clientes.length; i++) {
      Utils.say(clientes[i].toString());
    }
  }
  
  private static void insere() {
    //cria um novo cliente id e nome;

    Utils.say("Digite um novo id: ", false);
    int id = sc.nextInt(); sc.nextLine();
    if(id > 0) {
      int index = dao.indexOf(id);
      if(index == -1) { // NOT FOUND
        Utils.say("Digite um novo nome: ", false);
        String nome = sc.nextLine();
        Utils.say("voce quer adicionar data de nascimento do cliente \n 1- sim \n 2- nao \n: ", false);
        int dat = sc.nextInt();
        if(dat != 2){
            Utils.say("Digite data de nascimento DD/MM/yyyy : ", false);
            String date = sc.next();
            Date d = Utils.toDate(date);
            Cliente cliente = new Cliente();
            cliente.setId(id);
            cliente.setDatas(d);
            cliente.setNome(nome);
            dao.insere(cliente);
        }
        
        else {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        dao.insere(cliente);
      }
    }
  }
  }
   //altera nome do cliente pelo id;
  private static void altera() {
  	Cliente cliente = new Cliente();
    Utils.say("Digite um id que ira receber alteracao no nome: ", false);
    int id = sc.nextInt();
    if(id > 0) {
      int index = dao.indexOf(id);
      if(cliente != null) { // NOT FOUND
      	  Utils.say("voce quer adicionar data de nascimento do cliente \n 1- sim \n 2- nao \n: ", false);
        int dat = sc.nextInt();
        if(dat != 2){
        	Utils.say("Digite novo nome: ", false);
            String nome = sc.next();
            Utils.say("Digite data de nascimento DD/MM/yyyy : ", false);
            String date = sc.next();
            Date d = Utils.toDate(date);
            cliente.setId(id);
            cliente.setNome(nome);
            cliente.setDatas(d);
            dao.altera(cliente);
      } else {
      	  Utils.say("Digite novo nome: ", false);
          String nome = sc.next();
          cliente.setId(id);
           cliente.setNome(nome);
          dao.altera(cliente);
       }
   }
 }
  }
    //Deleta id do cliente;
  private static void deletaById() { 
  	Cliente cliente = new Cliente();   
    Utils.say("digite id para deletar");
    int id = sc.nextInt(); 
    if(id > 0) {    
     int index = dao.indexOf(id);
	 dao.deleta(id);   
    }else{       
     Utils.sayError("Cliente nao cadastrado!");  
     }                                                        
  }       
  //Deleta nome do cliente;
  private static void deletaByName() {  
  	Cliente[] clientes = dao.list(); 
    Cliente cliente = new Cliente(); 
            
    Utils.say("digite nome do cliente para deletar");
    String nome =  sc.next();  
                                
    	for(int i = 0;i<clientes.length;i++){
    		int index = dao.indexOf(nome);             
    		dao.deleta(nome);           
                                    
        }                                              
   }  
   
  
  //Menu do sistema;
  private static void showMenu() {
    Utils.say();
    String traces = Utils.replicate("-", 50);
    Utils.say(traces);
    Utils.say(SYSTEM_NAME + " - " + SYSTEM_VERSION);
    Utils.say("Author: " + SYSTEM_AUTHOR + " - " + SYSTEM_DATE);
    Utils.say(traces);
    listData();    
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
  
}
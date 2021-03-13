import java.util.Scanner;

public class ClienteDAOTest2 {
  private static final String SYSTEM_NAME = "Cadastro de Clientes (DAO + Array)";
  private static final String SYSTEM_VERSION = "Versao 1.0";
  private static final String SYSTEM_AUTHOR = "Fulano de Tal";
  private static final String SYSTEM_DATE = "29/01/2019";

  private static ClienteDAO dao = new ClienteDAO();
  
  private static Scanner sc = new Scanner(System.in);
  
  private static void listData() {
    Cliente[] clientes = dao.list();
    for(int i=0; i < clientes.length; i++) {
      Utils.say(clientes[i].toString());
    }
  }
  
  private static void insere() {
    //Utils.sayError("Funcao 'insere' nao liberada!");
    Utils.say("Digite um novo id: ", false);
    int id = sc.nextInt(); sc.nextLine();
    if(id > 0) {
      int index = dao.indexOf(id);
      if(index == -1) { // NOT FOUND
        Utils.say("Digite um novo nome: ", false);
        String nome = sc.nextLine();
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        dao.insere(cliente);
      } else {
        Utils.sayError("Cliente ja cadastrado!");
      }
    }
  }
  
  private static void altera() {
    Utils.sayError("Funcao 'altera' nao liberada!");
  }
  
  private static void deletaById() {
    Utils.sayError("Funcao 'deletaById' nao liberada!");
  }
  
  private static void deletaByName() {
    Utils.sayError("Funcao 'deletaByName' nao liberada!");
  }
  
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
      }
    } while(option != 0);
    Utils.say("Bye");
  }
  
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Principal{
	
   private static ClienteD da = new ClienteD();
	 private static  Scanner n1 = new Scanner(System.in);
   private static ArrayList Cliente = new ArrayList();

   private static void Menu(){
   	   

   Util.say("-------------------------menu------------------------");
   Util.say("lista de clientes");
   Listas();
   // adicionar clientes
   Util.say("1- cadastrar cliente");
   Util.say("2- editar cliente");
   Util.say("3- deletar cliente pelo id");
   Util.say("4- deletar cliente pelo nome");
   Util.say("digite 0 para sair do sistema");

   }
   
   private static void Listas(){
   	   Cliente [] cliente = da.list();
   	   for(int i = 0 ; i<cliente.length;i++){
       Util.say(cliente[i].toString());
   }
   }
   
   private static void inserir(){
   	 
   	   Cliente cliente = new Cliente();
   	   Util.say("digite Nome do cliente");
   	   String nome = n1.next();
   	   cliente.setNome(nome);
   	   Util.say("digite Id do cliente"); 
   	   int id = n1.nextInt();
   	   cliente.setId(id);
   	   Util.say("voce gostaria de adicionar data de nascimento \n 1 - sim \n 2 - nao \n ");
   	   int i = n1.nextInt();
   	  if(i != 2){
            Util.say("Digite data de nascimento DD/MM/yyyy : ", false);
            String date = n1.next();
            Date d = Util.toDate(date);
            cliente.setId(id);
            cliente.setData(d);
            cliente.setNome(nome);
            da.insere(cliente);
        }
        
        else {
  
        cliente.setId(id);
        cliente.setNome(nome);
        da.insere(cliente);
      }
   }
   
   private static void Alterar(){
   	   Util.say("Digite um id que ira receber alteracao no nome: ", false);
    int id = n1.nextInt();
    if(id > 0) {
    	
    }
    else{
    	
    }
   }
   
   private static void DeletarNome(){
   	   
   }
   
   private static void DeletarId(){
   	   
   	   
   }
   

  

    public static void main(String[]args){
    	int n = Integer.MAX_VALUE;
    	   do{
   	   Scanner n1 = new Scanner(System.in);
       Menu();
      n = n1.nextInt();
   
   switch(n){
   	   
   	case 1:  inserir(); break;
   			case 2:  Alterar(); break;
   					case 3:   DeletarId(); break;
   							case 4: DeletarNome();  break;
   							

    
    }
 } while(n != 0);

       Util.say("fim de programa");

}

}
 	
import java.util.Scanner;

public class MenuTest1 {
  public static void main(String[] args) {
    String[] bancos = {};
    String nome;
    int i = 0;
    
    Scanner sc = new Scanner(System.in);
    
    int option = Integer.MAX_VALUE;
    do {
      System.out.println();
      System.out.println("Lista de Bancos");
      System.out.println("--------------");
      for(i=0; i < bancos.length; i++) {
        System.out.println(bancos[i]);      
      }
      System.out.println("--------------");
      System.out.println("1-Novo Banco");
      System.out.println("2-Edita Banco");
      System.out.println("3-Remove Banco");
      System.out.println("0-Sair");
      System.out.println("--------------");
      System.out.print("Digite sua opcao: ");
      option = sc.nextInt();
      
      switch(option) {
      case 1: 
        // Digitar Nome do Banco
        // Verificar se ja existe no array
        //   Se SIM, emitir mensagem de "Banco ja cadastrado" e voltar ao menu
        //   Se NAO, digitar Nome do Banco
        //   Incluir no Array
        System.out.print("Digite o nome do Banco: ");
        nome = sc.next();
        if(nome != null) {
          boolean found = false; // found == encontrado (true/false) 
          for(i=0; i < bancos.length; i++) {
            if(bancos[i].equalsIgnoreCase(nome)) {
              found = true;
              break;
            }
          }
          if(found) {
            System.out.println("Banco '" + nome + "' ja cadastrado!");
            continue;
          }
          String[] tmp = new String[bancos.length+1];
          for(i=0; i < bancos.length; i++) {
            tmp[i] = bancos[i];
          }
          tmp[tmp.length-1] = nome;
          bancos = tmp;
        }
        break;
      case 2: 
      	  
      	  
      	  System.out.print("digite nome do banco para ser editado \n");
      	  nome = sc.next();
      	  for(i=0; i < bancos.length; i++) {
      	  	  if(bancos[i].equalsIgnoreCase(nome)){
      	  		   System.out.print("editar nome do banco \n");
      	  		   nome = sc.next();
      	  		    
      	  	  	   	   bancos[i]=nome;
      	  	  	   }
      	  		    
      	  		  
      	  	  }
      	  	 
     
      	  		  
        // Digitar Nome do Banco \\
        // Verificar se ja existe no array \\
        //   Se NAO, emitir mensagem de "Banco nao cadastrado" e voltar ao menu
        //   Se SIM, digitar Nome do Banco
        //   Alterar no Array
        // COMPLETAR...
        break;
      case 3:
        // Digitar Nome do Banco
        // Verificar se ja existe no array
        //   Se NAO, emitir mensagem de "Banco nao cadastrado" e voltar ao menu
        //   Se SIM, remover do array
        System.out.print("Digite o nome do Banco: ");
        nome = sc.next();
        if(nome != null) {
          boolean found = false; // found == encontrado (true/false) 
          for(i=0; i < bancos.length; i++) {
            if(bancos[i].equalsIgnoreCase(nome)) {
              found = true;
              break;
            }
          }
          if(!found) {
            System.out.println("Banco '" + nome + "' nao cadastrado!");
            continue;
          }
          int j = 0;
          String[] tmp = new String[bancos.length-1];
          for(i=0; i < bancos.length; i++) {
            if(bancos[i].equalsIgnoreCase(nome)) {
              continue;
            }
            tmp[j] = bancos[i];
            j++;
          }
          bancos = tmp;
        }
        break;
      }
      
    } while (option != 0);
    
    System.out.println("Sistema encerrado com sucesso!");
    
  }
}

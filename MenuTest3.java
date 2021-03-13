import java.util.Scanner;
import java.util.Arrays;

public class MenuTest3 {
  public static void main(String[] args) {
    String[] bancos = {};
    String nome;
    int[]codigo = {};
    int i = 0;
    
    Scanner sc = new Scanner(System.in);
    
    int option = Integer.MAX_VALUE;
    do {
      System.out.println();
      System.out.println("Lista de Bancos");
      System.out.println("--------------");
      Arrays.sort(bancos);
      for(i=0; i < bancos.length; i++) {
        System.out.println(codigo[i] + " : "+ bancos[i]);      
      }
       
      System.out.println("--------------");
      System.out.println("1-criar Banco");
      System.out.println("2-Editar Banco");
      System.out.println("3-Remover Banco");
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
        System.out.println("digite numero do banco ");
        int num1 = sc.nextInt();
        if(nome != null) {
          boolean found = false; // found == encontrado (true/false) 
          for(i=0; i < bancos.length; i++) {
            if(bancos[i].equalsIgnoreCase(nome)) {
              found = true;
              continue;
            }
          }
           for(i=0; i < codigo.length; i++) {
            if(codigo[i] == num1) {
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
          int[] tmp1 = new int[codigo.length+1];
          for(i=0; i < codigo.length; i++) {
            tmp1[i] = codigo[i];
          }
          tmp[tmp.length-1] = nome;
          bancos = tmp;
          tmp1[tmp1.length-1] = num1;
          codigo = tmp1;
        }
        break;
      case 2: 
        
        
        System.out.print("digite numero do banco para ser editado \n");
        num1 = sc.nextInt();
 
        for(i=0; i < codigo.length; i++) {
          nome = "valor";
          if(codigo[i] == num1){
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
       
        System.out.print("Digite o numero do Banco: ");
        num1 = sc.nextInt();
        if(num1 > 0) {
          boolean found = false; // found == encontrado (true/false) 
          for (i=0; i < codigo.length; i++) {
            if(codigo[i]==(num1)) {
              found = true;
              break;
            }
          }
          if(!found) {
            System.out.println("Banco '" + num1 + "' nao cadastrado!");
          }
          
          int j = 0;
          int[] tmp1 = new int[codigo.length-1];
          String[] tmp = new String[bancos.length-1];
          for(i=0; i < codigo.length; i++) {
            if(codigo[i]==(num1)) {
            continue;
            }
            tmp1[j] = codigo[i];
            tmp[j] = bancos[i];
            j++;

          }
          codigo = tmp1;
          bancos = tmp;
          }
        
        break;
      }
      
    } while (option != 0);
    
    System.out.println("Sistema encerrado com sucesso!");
    
  }
}
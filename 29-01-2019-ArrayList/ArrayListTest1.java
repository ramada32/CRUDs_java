import java.util.Collections;
import java.util.ArrayList;

public class ArrayListTest1 {

  public static void main(String[] args) {
    String[] itens = { "Jose", "Katia", "Joao", "Adriana" };
    
    ArrayList nomes = new ArrayList();
    
    System.out.println("Itens");
    System.out.println("-----");
    for(int i=0; i < itens.length; i++) {
      nomes.add(itens[i]);
      System.out.println(itens[i]);
    }
    
    Collections.sort(nomes);
    
    System.out.println();
    System.out.println("Lista Ordenada");
    System.out.println("--------------");
    for(int i=0; i < nomes.size(); i++) {
      String nome = (String)nomes.get(i);
      System.out.println(nome);
    }
    
    nomes.set(1, "Carla");
    
    Collections.sort(nomes);
    
    System.out.println();
    System.out.println("Lista Alterada");
    System.out.println("--------------");
    for(int i=0; i < nomes.size(); i++) {
      String nome = (String)nomes.get(i);
      System.out.println(nome);
    }

    nomes.remove(2);

    System.out.println();
    System.out.println("Lista apos Delecao");
    System.out.println("------------------");
    for(int i=0; i < nomes.size(); i++) {
      String nome = (String)nomes.get(i);
      System.out.println(nome);
    }

  }
  
}

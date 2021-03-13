import java.util.HashMap;

public class HashMapTest1 {
  
  public static void main(String[] args) {
    HashMap<Integer, String> names = new HashMap<>();
    
    //HashMap<Integer, String[]>
    
    names.put(1, "John Doe");
    names.put(2, "Jane Doe");
    
    System.out.println(names);
    
    String name = names.get(2);
    
    System.out.println(name);
    
    System.out.println("Bye");
    
  }
  
}

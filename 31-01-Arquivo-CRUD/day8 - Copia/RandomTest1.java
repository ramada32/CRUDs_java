public class RandomTest1 {
  
  public static void main(String[] args) {
    for(int i=0; i < 10; i++) {
      int number = Utils.getRandomNumber(5000, 45);
      System.out.println(number);
    }

    System.out.println();
    for(int i=0; i < 10; i++) {
      double number = Utils.getRandomNumber(5.5, 45.8);
      System.out.println(number);
    }
  }
  
}

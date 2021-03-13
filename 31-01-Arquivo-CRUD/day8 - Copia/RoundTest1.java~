public class RoundTest1 {
  
  public static void main(String[] args) {
    double[] values = { 1234.5678, 4321.8765, 8765.4321, 8765.4545 };
    for(int i=0; i < values.length; i++) {
      double value = values[i];
      int decimals = Utils.getRandomNumber(0, 3);
      System.out.println("Valor nao arredondado: " + value);
      System.out.println("Numero de decimais   : " + decimals);
      value = Utils.round(value, decimals);
      System.out.println("Valor arredondado    : " + value);
    }
  }
  
}

import java.util.Locale;
import java.text.NumberFormat;

public class MoneyTest1 {
  
  public static void main(String[] args) {
    double salary = 1234.56789;
    System.out.println("Salario sem formatacao: " + salary);
    
    // Formatação
    Locale locale = new Locale("pt", "BR");      
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    System.out.println("Salario em Reais: " + currencyFormatter.format(salary));
    
    System.out.println("Salario sem arredondamento: " + salary);
    
    // Arredondamento de Money
    salary = Utils.roundToMoney(salary);
    System.out.println("Salario com arredondamento: " + salary);

    // Formatação
    System.out.println("Salario em Reais: " + currencyFormatter.format(salary));

  }
  
}

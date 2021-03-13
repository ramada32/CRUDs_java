import java.util.Date;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileUtilsTest1 {
  private static final String FILENAME = "./filetest.txt";
  private static BufferedReader reader;
  private static BufferedWriter writer;
  
  private static void checkFileExists() {
    File f = new File(FILENAME);
    try {
      if(f.exists()) {
        //f.delete();           
      }
      if(!f.exists()) {
        f.createNewFile();
      }
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  
  private static String getDateOfAdmission() {
    int year = Utils.getRandomNumber(2009, 2017);
    int month = Utils.getRandomNumber(1, 12);
    int day = Utils.getRandomNumber(1, Utils.getLastDay(year, month));
    return "" + (day < 10 ? "0" + day : day) + "/" + (month < 10 ? "0"+ month : month) + "/" + year;
  }
  
  public static void main(String[] args) {
    boolean generate = false;
    try {
      checkFileExists();
      reader = FileUtils.getReader(FILENAME);
      if(generate) {
        writer = FileUtils.getWriter(FILENAME);
      
        String familyName = "Doe";
        String[] names = { "John", "Jane" , "Carl", "William", "Richard", "Debra", "Michael", "Cloe", "James", "Joseph" };
      
        Utils.say("Gravando Dados...");
        for(int i=0; i < names.length; i++) {
          String strDate = getDateOfAdmission();
          double salary = Utils.roundToMoney(Utils.getRandomNumber(1024.85, 8978.47));
          String line = "" + (i+1) + ";" + names[i] + " " + familyName + ";" + strDate + ";" + salary;
          FileUtils.writeLine(writer, line);
        }
      }
      
      Funcionario dao = new FuncionarioDAO();
      Utils.say("Lendo Dados...");
      String line = null;
      while((line = FileUtils.readLine(reader)) != null) {
        //Utils.say(line);
        String[] parts = line.split(";");
        if(parts.length != 4) {
          Utils.sayError("Registro invalido");
        }
        int id = Integer.parseInt(parts[0]);
        String nome = parts[1];
        Date admissao = Utils.toDate(parts[2]);
        double salario = Double.parseDouble(parts[3]);
        Utils.say("Id: " + id);
        Utils.say("Nome: " + nome);
        Utils.say("Admissao: " + admissao);
        Utils.say("Salario: " + salario);
        
        Funcionario fun = new Funcionario();
        fun.setId(id);
        fun.setNome(nome);
        fun.setAdmissao(admissao);
        fun.setSalario(salario);

        dao.insere(fun); // altera(fun);
      }
      
    } catch(Exception ex) {
      ex.printStackTrace();
    } finally {
      FileUtils.close(writer);
      FileUtils.close(reader);
    }
    
    System.out.println("Bye");
  }
  
}
// getById(int id)
// looping
// 7;Michael Doe;12/01/2017;1732.19

        String[] parts = line.split(";");
        if(parts.length != 4) {
          Utils.sayError("Registro invalido");
        }
        int id2 = Integer.parseInt(parts[0]);
        if(id == id2) {
        String nome = parts[1];
        Date admissao = Utils.toDate(parts[2]);
        double salario = Double.parseDouble(parts[3]);
        
        Funcionario fun = new Funcionario();
        fun.setId(id);
        fun.setNome(nome);
        fun.setAdmissao(admissao);
        fun.setSalario(salario);

        return fun;
        }
return null;


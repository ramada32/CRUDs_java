import java.util.Date;
import java.text.SimpleDateFormat;

public final class Utils {
  
  private Utils() {
  }
  
  public static void say() {
    say("", true);
  }
  
  public static void say(String s) {
    say(s, true);
  }
  
  public static void say(String s, boolean newLine) {
    if(newLine) {
      System.out.println(s);
    } else {
      System.out.print(s);
    }
  }
  
  public static Date toDate(String tre){
  	      if (tre == null) return null;
     SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
     try{
         return forma.parse(tre);
     
     }
     catch(Exception ex){
         ex.printStackTrace();
     }
     return null;
  }
  public static String toString(Date d) {
		if(d == null) return null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(d);
	}
  
  
  public static void sayError(String s) {
    say("***Error: " + s);
  }
  
  public static String replicate(String s, int times) {
    StringBuilder sb = new StringBuilder();
    for(int i=0; i < times; i++) {
      sb.append(s);
    }
    return sb.toString();
  }

}
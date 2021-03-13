import java.util.Date;
import java.text.SimpleDateFormat;

public class Util{

     
     public Util(){
     
     }
     
     
     public static void say(){
     say("",true);
     
     }
     public static void say(String s){
     
     say(s,true);
     
     }
     public static void say(String s,boolean tes){
     if(tes == true){
     System.out.println(s);
     }
     
     else{
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

  }

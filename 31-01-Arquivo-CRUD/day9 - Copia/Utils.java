import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Locale;
import java.text.NumberFormat;

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
  
  public static Date toDate(String str) {
    return toDate(str, false);
  }
 
  public static Date toDate(String str, boolean withTime) {
    if(str == null) return null;
    String mask = (withTime ? "dd/MM/yyyy HH:mm:ss" : "dd/MM/yyyy");
    SimpleDateFormat sdf = new SimpleDateFormat(mask);
    try {
      return sdf.parse(str);
    } catch(Exception ex) {
      ex.printStackTrace();
    }
    return null;
  }
  
  public static String toString(Date d) {
    return toString(d, false);
  }
  
  public static String toString(Date d, boolean withTime) {
    if(d == null) return null;
    String mask = (withTime ? "dd/MM/yyyy HH:mm:ss" : "dd/MM/yyyy");
    SimpleDateFormat sdf = new SimpleDateFormat(mask);
    return sdf.format(d);
  }
  
  public static Date toDate(long millis) {
    return new Date(millis);
  }
  
  public static int getLastDay(int year, int month) {
    return 28;
  }
  
  public static String formatByteLength(long bytes) {
    return formatByteLength(bytes, false);
  }
  
  public static String formatByteLength(long bytes, boolean si) {
    int unit = si ? 1000 : 1024;
    if (bytes < unit) return bytes + " B";
    int exp = (int) (Math.log(bytes) / Math.log(unit));
    String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp-1) + ""; // + (si ? "" : "i");
    return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
  }

  public static int getRandomNumber(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
  public static double getRandomNumber(double min, double max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return (min + (max - min)) * r.nextDouble();
	}
	
	public static double roundToMoney(double value) {
	  // Antes era: return (double) Math.round(value * 100) / 100;
	  return round(value, 2);
	}
	
	public static double round(double value, int decimals) {               
	  // Math.pow(10.0, decimals);
	  return (double) Math.round(value * Math.pow(10.0, decimals)) / Math.pow(10.0, decimals);
	}
	
	public static String toMoneyString(double value) {
    Locale locale = new Locale("pt", "BR");      
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    return currencyFormatter.format(value);
	}
	                                       
}


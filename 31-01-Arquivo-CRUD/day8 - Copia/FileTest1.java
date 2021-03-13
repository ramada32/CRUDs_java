import java.util.Date;
import java.io.File;

public class FileTest1 {
  
  public static void main(String[] args) {
    String filename = "./tmp.txt";
    File f = new File(filename);
    
    boolean exists = f.exists();
    System.out.println("File '" + filename + "' exists? " + (exists ? "YES" : "No"));
    
    try {
      boolean created = f.createNewFile();
      System.out.println("File '" + filename + "' was created? " + (created ? "YES" : "NO"));
    } catch(Exception ex) {
      ex.printStackTrace();
    }
    exists = f.exists();
    System.out.println("File '" + filename + "' exists? " + (exists ? "YES" : "No"));
    
    String filepath = f.getAbsolutePath();
    System.out.println("File '" + filename + "' has Absolute File Path: " + filepath);
    
    String name = f.getName();
    System.out.println("File '" + filename + "' has Name: " + name);
    
    boolean isFile = f.isFile();
    boolean isDirectory = f.isDirectory();
    System.out.println("File '" + filename + "' is a File? " + (isFile ? "YES" : "No"));
    System.out.println("File '" + filename + "' is a Directory? " + (isDirectory ? "YES" : "No"));
    
    long length = f.length();
    System.out.println("File '" + filename + "' length? " + Utils.formatByteLength(length));
    
    long lastModified = f.lastModified();
    Date d = Utils.toDate(lastModified);
    String str = Utils.toString(d, true);
    System.out.println("File '" + filename + "' last Modified? " + str);
    
    long freeSpace = f.getFreeSpace();
    System.out.println("Disk Free Space? " + Utils.formatByteLength(freeSpace));
    
    long totalSpace = f.getTotalSpace();
    System.out.println("Disk Total Space? " + Utils.formatByteLength(totalSpace));
    
    long usableSpace = f.getUsableSpace();
    System.out.println("Disk Usable Space? " + Utils.formatByteLength(usableSpace));
    
    String filename2 = "./tmp2.txt";
    File f2 = new File(filename2);
    boolean renamed = f.renameTo(f2);
    System.out.println("File '" + filename + "' was renamed to '" + filename2 + "'? " + (renamed ? "YES" : "No"));
    
    boolean deleted = f.delete();
    System.out.println("File '" + filename + "' was deleted? " + (deleted ? "YES" : "No"));

    boolean deleted2 = f2.delete();
    System.out.println("File '" + filename2 + "' was deleted? " + (deleted2 ? "YES" : "No"));
    
    exists = f.exists();
    System.out.println("File '" + filename + "' exists? " + (exists ? "YES" : "No"));

    boolean exists2 = f2.exists();
    System.out.println("File '" + filename2 + "' exists? " + (exists2 ? "YES" : "No"));
    
    System.out.println("Bye");
  }
  
}

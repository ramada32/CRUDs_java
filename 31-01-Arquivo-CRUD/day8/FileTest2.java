import java.io.File;

public class FileTest2 {
  
  private static void walk(String path) {
    walk(path, 1);
  }
  
  private static void walk(String path, int level) {
    String spaces = Utils.replicate(" ", (level-1) * 2);
    File root = new File(path);
    File[] list = root.listFiles();

    if (list == null) return;
      for ( File f : list ) { // foreach( type obj : list)
        if ( f.isDirectory() ) {
          walk( f.getAbsolutePath(), level+1 );
          System.out.println( spaces + "Dir:" + f.getAbsoluteFile() );
        } else {
          String lastModified = Utils.toString(Utils.toDate(f.lastModified()), true);
          String length = Utils.formatByteLength(f.length());
          System.out.println( spaces + "File:" + f.getAbsoluteFile() + " [" + lastModified + " | " + length + "]" );
        }
     }
  }
    
  public static void main(String[] args) {
    walk("c:\\" );
   
    System.out.println("Bye");
  }
  
}

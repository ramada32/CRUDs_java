//P13 java

public class P13{

  public static void main(String[]args){
  	 
  	  String[ ] animals = {"DanaDog", "WallyDog", "JessieDog", "AlexisDog", "LuckyDog" };
              
  	  int i = 0;
      int j =0;          
  	       for(i = 0;i<animals.length;i++){
  	           for(j = 0;j<animals.length;j++){
  	           	       if(animals[i].compareTo(animals[j]) <0){       
  	           	          String aux = animals[i];
  	           	          animals[i] = animals[j];
  	           	          animals[j] = aux;
  	           	       }
  	           	}
  	       }
 
              for(i = 0;i<animals.length;i++){
                 System.out.println("\n" + animals[i]);
                            
               }
                            
                            
  	       }
  }

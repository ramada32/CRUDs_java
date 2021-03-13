//P7 JAVA

public class P7{


          public static void main(String[]args){
	           int i = 1;
               int e = 2;
               boolean result= false;
               
               result= ((i > e) && (1>2));
               result= true;
               
            System.out.println("resultado = " + result);
            
               result=((i< e)|| (1<2));
	           result= false;
	           
            System.out.println("resultado = " + result);


               result= !(i == e);
		       result= true;
		       
	         System.out.println("resultado = " + result);
}


}

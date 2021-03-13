import java.util.Scanner;

public class Ordenacao{
	
	public static void main(String[]args){
	
	System.out.println("Arrays");
	
	Scanner sc = new Scanner(System.in);
	int[] real = new int [3];
	
	System.out.println("Insira 3 valores: ");
	
	for (int i = 0; i < real.length; i ++){
	real [i] = sc.nextInt();	
	}
	
	
	for (int i = 0; i < real.length - 1; i ++ ){
		for (int j = i+1; j < real.length; j ++ ){
			System.out.println(
				"Comparando " + real[i] + " < " + real [j]);
			if (real[i] > real [j]){
			System.out.println("\t se assim, inverte os valores");
			
			int tmp = real [i];
			real [i] = real [j];
			real [j] = tmp;
		}		
	}
	}
	
	for (int i = 0; i<real.length; i++){
		System.out.println(real[i]);
	}
}	
}
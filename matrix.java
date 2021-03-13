// test 3

import java.util.Scanner;
public class matrix{

	public static void main(String[]args){
		int i = 0;
		int vet[] = new int[5];
		Scanner n1 = new Scanner(System.in);
		
		
		for(i=0;i<5;i++){
		System.out.println("digite numero");
		vet[i] = n1.nextInt();
	}
	
	for(i = 0;i<5;i++){
		for(int j = 0;j<4;j++){
		if(vet[j] > vet[j+1]){
			int aux = vet[j];
			vet[j] = vet[j+1];
			vet[j+1] = aux;

		}
			
		}
	
 }
 
 for(i = 0;i<5;i++){
			System.out.println("lista numeros = " +vet[i]);
			}}}
import java.util.Scanner;

public class MenuTest4 {
	public static void main(String[] args) {
		String[] bancos = {};
		int[] id = {};
		String nome;
		int cod;
    
		Scanner sc = new Scanner(System.in);
    
		int option = Integer.MAX_VALUE;
		do {
			System.out.println();
			System.out.println("Lista de Bancos e seu Codigos");
			System.out.println("--------------");
			for(int i=0; i < bancos.length; i++) {
				System.out.println(bancos[i] + " - ID: " + id[i]);      
			}
			System.out.println("--------------");
			System.out.println("1-Novo Banco");
			System.out.println("2-Edita Banco");
			System.out.println("3-Remove Banco");
			System.out.println("4-Organiza Banco");
			System.out.println("0-Sair");
			System.out.println("--------------");
			System.out.print("Digite sua opcao: ");
			option = sc.nextInt();
			switch(option) {
				case 1: 
					// Digitar Nome do Banco
					// Verificar se ja existe no array
					//   Se SIM, emitir mensagem de "Banco ja cadastrado" e voltar ao menu
					//   Se NAO, digitar Nome do Banco
					//   Incluir no Array
					System.out.print("Digite o codigo do Banco: ");
					cod = sc.nextInt();
					if(cod != 0) {
						System.out.print("Digite o nome do banco: ");
						nome = sc.next();
						boolean found = false; // found == encontrado (true/false) 
						for(int i=0; i < id.length; i++) {
							if(id[i] == cod) {
								found = true;
								break;
							}
						}
						if(found) {
							System.out.println("Codigo '" + cod + "' ja cadastrado!");
							continue;
						}
						int[] fnt = new int[id.length+1];
						for(int i=0; i < id.length; i++) {
							fnt[i] = id[i];
						}
						fnt[fnt.length-1] = cod;
						id = fnt;
						
						String[] tmp = new String[bancos.length+1];
						for(int i=0; i < bancos.length; i++) {
							tmp[i] = bancos[i];
						}
						tmp[tmp.length-1] = nome;
						bancos = tmp;
					}
					break;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 2: 
					// Digitar Nome do Banco
					// Verificar se ja existe no array
					//   Se NAO, emitir mensagem de "Banco nao cadastrado" e voltar ao menu
					//   Se SIM, digitar Nome do Banco
					//   Alterar no Array
					// COMPLETAR...
				
					System.out.print("Digite o Codigo do Banco: ");
					cod = sc.nextInt();
					if(cod != 0){
						boolean found = false; // found == encontrado (true/false) 
						for(int i=0; i < id.length; i++) {
							if(id[i] == cod) {
								found = true;
								break;
							}
						}
						if(!found) {
							System.out.println("Codigo não cadastrado");
							continue;
						}
						for(int i=0; i < bancos.length; i++) {
							if(id[i] == cod) {  
								System.out.print("Digite o novo nome do Banco: ");
								nome = sc.next();
								bancos[i] = nome;
								continue;
							}
						}
					} 
					break;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 3:
					// Digitar Nome do Banco
					// Verificar se ja existe no array
					//   Se NAO, emitir mensagem de "Banco nao cadastrado" e voltar ao menu
					//   Se SIM, remover do array
					System.out.print("Digite o codigo do Banco: ");
					cod = sc.nextInt();
					nome = "";
					if(cod != 0) {
						boolean found = false; // found == encontrado (true/false) 
						for(int i=0; i < bancos.length; i++) {
							if(id[i] == cod) {
								found = true;
								break;
							}
						}
						if(!found) {
							System.out.println("Codigo '" + cod + "' nao cadastrado!");
							continue;
						}
						int j = 0;
						int[] fnt = new int[id.length-1];
						String[] tmp = new String[bancos.length-1];
						for(int i=0; i < id.length; i++) {
							if(id[i] == cod) {
								nome = bancos[i];
								
							}
							fnt[j] = id[i];
							j++;
						}
						id = fnt;
						for(int i=0; i < bancos.length; i++) {
							if(bancos[i].equalsIgnoreCase(nome)) {
								continue;
							}
							tmp[j] = bancos[i];
							j++;
						}
						bancos = tmp;
					}
					break;
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				case 4:
					//Ordenar bancos existentes em ordem alfabética
					String aux = "";
					if(bancos.length >= 2){
						for (int i = 0; i < bancos.length; i++) {
							for (int j = 0; j < bancos.length; j++) {
								if(bancos[i].compareTo(bancos[j]) < 0){
									aux = bancos[i]; 
									bancos[i] = bancos[j];
									bancos[j] = aux;
								}
							}
						}
					} else {
						continue;
					}
						
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				}
			  
			} while (option != 0);
			
		System.out.println("Sistema encerrado com sucesso!");
	}
}
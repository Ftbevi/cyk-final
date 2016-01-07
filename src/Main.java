import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner recebido = new Scanner(System.in);
		ArrayList<String> cadeiasRecebidas = new ArrayList<>();
		ArrayList<String> cadeiasValidadas = new ArrayList<>();
		String palavra;
		int opcao;
		
		
		Gramatica glc = new Gramatica("/home/fthiago/Documentos/Teoria da Computação/TesteTeoria/exemplo1/inp-glc.txt");
		Algoritmo cyk = new Algoritmo();
		
		System.out.println("Digite as strings desejadas: \nOpções:\n");
		do{
			System.out.println("\t1-Acrescentar String\n \t2-Sair\n");
			opcao = recebido.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("String:");
				Scanner entrada = new Scanner(System.in);
				palavra = entrada.nextLine();
				cadeiasRecebidas.add(palavra);
				break;
			case 2:
				for (int i = 0; i <cadeiasRecebidas.size(); i++) {
					System.out.println(cadeiasRecebidas.get(i)+"\n");
				}
				System.out.println("Obrigado!");
				break;
			default:
				System.out.println("Opção não é válida!");
			}
	
		}while(opcao != 2);
		
		cadeiasValidadas = cyk.validaPalavra(glc, cadeiasRecebidas);
		for (int i = 0; i < cadeiasValidadas.size(); i++) {
			System.out.println(cadeiasValidadas.get(i));
		}
		
		cyk.processaPalavras(glc, cadeiasValidadas);
	}
}

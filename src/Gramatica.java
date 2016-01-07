import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Gramatica {

	String[] variaveis;
	String[] terminais;
	ArrayList<String[]> regras = new ArrayList<>();
	
	public Gramatica(String caminhoGramatica){
		carregarValores(caminhoGramatica);
	}

	private void carregarValores(String caminhoGramatica) {
		try {
			FileReader arq = new FileReader(caminhoGramatica);
			BufferedReader lerArquivo = new BufferedReader(arq);
		
			variaveis = lerArquivo.readLine().split(" ");
			mostrar(variaveis);
			
			terminais = lerArquivo.readLine().split(" ");
			mostrar(terminais);
			
			while (lerArquivo.read() != -1) {
				String[] divisao = lerArquivo.readLine().split("[ ][>][ ]");
				String[] reg = divisao[1].split("[ ][|][ ]");
				regras.add(reg);
				mostrar(reg);
			}
						
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
		} 
	}

	private void mostrar(String[] opcao) {
		for (int i = 0; i < opcao.length; i++) {
			System.out.println(opcao[i]);
		}
		System.out.println("\n");
	}
	
}

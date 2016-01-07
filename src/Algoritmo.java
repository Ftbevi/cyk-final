	
import java.util.ArrayList;

public class Algoritmo {
	

	public ArrayList<String> validaPalavra(Gramatica glc, ArrayList<String> cadeias) {
		boolean validaCaract;
		for (int i = 0; i < cadeias.size(); i++) {
			//separa a palavra atual em caracteres..
			String[] caracteres = cadeias.get(i).split("");
			for (int j = 0; j < caracteres.length; j++) {
				validaCaract = false;
				for (int k = 0; k < glc.terminais.length; k++) {
					if(glc.terminais[k].equals(caracteres[j])){
						validaCaract = true;
						break;
					}
				}
				if(!validaCaract){
					System.out.println("A palavra "+cadeias.get(i)+" não é está na gramática.");
					cadeias.remove(i);
					break;
				}
			}
		}
		return cadeias;
	}


	public void processaPalavras(Gramatica glc, ArrayList<String> cadeiasValidadas) {
		for (int i = 0; i < cadeiasValidadas.size(); i++) {
			String atual = cadeiasValidadas.get(i);
			ArrayList<String> tabela[][] = new ArrayList[atual.length()+1][atual.length()];	
			String[] caracteres = atual.split("");
			
			//LAÇO QUE PREENCHE ULTIMA LINHA DA TABELA COM OS CARACTERES DA PALAVRA	
			for (int j = 0; j < caracteres.length; j++) {
				tabela[atual.length()][j].add(caracteres[j]);
			}
			
			//LAÇOS PARA PREENCHER O RESTANTE DA TABELA..
		
		
		
		
		}
		
	}

	
	
}


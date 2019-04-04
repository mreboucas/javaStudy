package mreboucas.java_estudo.annotation.delete;

import java.util.ArrayList;
import java.util.List;

public class DadoDeleteTest {
	
	public static void main(String[] args) {
		new DadoDeleteTest().testar();
	}
	
	private void testar() {
		DadoDelete dadoDelete = new DadoDelete();
		List<String> nomes = new ArrayList<String>();
		nomes.add("Marcelo");
		nomes.add("João");
		nomes.add("Bela");
		
		dadoDelete.setNomeList(nomes);
		
		try {
			
			AnnotationUtil.deletarListarMarcadasParaDelecao(dadoDelete);
			
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}

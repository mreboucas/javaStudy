package mreboucas.java_estudo.annotation.delete;

import java.util.List;

public class DadoDelete {
	
	@Delete
	private List<Long> codigosDeletarList;
	
	private List<String> nomeList;
	
	@Delete
	private List<String> cidadeDeletarList;

	public List<Long> getCodigosDeletarList() {
		return codigosDeletarList;
	}

	public void setCodigosDeletarList(List<Long> codigosDeletarList) {
		this.codigosDeletarList = codigosDeletarList;
	}

	public List<String> getNomeList() {
		return nomeList;
	}

	public void setNomeList(List<String> nomeList) {
		this.nomeList = nomeList;
	}

	public List<String> getCidadeDeletarList() {
		return cidadeDeletarList;
	}

	public void setCidadeDeletarList(List<String> cidadeDeletarList) {
		this.cidadeDeletarList = cidadeDeletarList;
	}

}

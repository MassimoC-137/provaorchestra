package it.prova.provaorchestra.model;

import java.util.List;

public class Orchestra {

	private List<Strumento> orchestrina;
	
	
	public Orchestra() {
	}
	
	public Orchestra(List<Strumento> orchestrina) {
		this.orchestrina = orchestrina;		
	}
	
	public void accordaStrumenti() {
		for (Strumento strumento : orchestrina) {
			strumento.accorda();
		} 
	}
	
	public void eseguiConcerto() {
		for (Strumento strumento : orchestrina) {
			System.out.println(strumento.produciSuono());
		}
	}

	public List<Strumento> getOrchestrina() {
		return orchestrina;
	}

	public void setOrchestrina(List<Strumento> orchestrina) {
		this.orchestrina = orchestrina;
	}
	

}

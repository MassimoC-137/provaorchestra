package it.prova.provaorchestra.model;

public abstract class Strumento {

	private String nome; 
	private int estensione; 
	private Famiglia famiglia; 
	private boolean accordabile; 
	private boolean accordato;
	
	
	public Strumento() {
		
	}
	
	public Strumento(String nome, int estensione, Famiglia famiglia, boolean accordabile, boolean accordato) {
		this.nome = nome; 
		this.estensione = estensione; 
		this.famiglia = famiglia; 
		this.accordabile = accordabile; 
		this.accordato = accordato;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstensione() {
		return estensione;
	}
	public void setEstensione(int estensione) {
		this.estensione = estensione;
	}
	public Enum getFamiglia() {
		return famiglia;
	}
	public void setFamiglia(Famiglia famiglia) {
		this.famiglia = famiglia;
	}
	public boolean isAccordabile() {
		return accordabile;
	}
	public void setAccordabile(boolean accordabile) {
		this.accordabile = accordabile;
	}
	public boolean isAccordato() {
		return accordato;
	}
	public void setAccordato(boolean accordato) {
		this.accordato = accordato;
	} 
	
	
	abstract public void accorda(); 
	abstract public String produciSuono(); 
	abstract public String ottieniDescrizione(); 
	
	
	
	
}

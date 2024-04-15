package it.prova.provaorchestra.model;

public class Violino extends Strumento{
	
	public Violino () {
	}
	
	public Violino (String nome, int estensione, Famiglia famiglia, boolean accordabile, boolean accordato) {
		super(nome, estensione, famiglia, accordabile, accordato); 
	}

	@Override
	public void accorda() {
		if (!isAccordabile()) {
			System.out.println("Lo strumento non è accordabile.");
		} else if (!isAccordato()){
			setAccordato(true);
			System.out.println("Lo strumento è ora accordato!");
		}
	}

	@Override
	public String produciSuono() {
		if (isAccordato()) {
			return "Suono il violino: VRRRR";
		} else {
			return "Lo strumento è da accordare"; 
		}
	}

	@Override
	public String ottieniDescrizione() {
		return "Questo strumento è un " + this.getNome() + ". Appartiene alla famiglia de' " + this.getFamiglia() 
		+ ". Ha un numero di ottave pari ad " + this.getEstensione() + ". E' accordabile? " + this.isAccordabile()
		+ " E' accordato? " + this.isAccordato();
	}

}

package it.prova.provaorchestra.test;

import java.util.ArrayList;
import java.util.*;

import it.prova.provaorchestra.model.Famiglia;
import it.prova.provaorchestra.model.Flauto;
import it.prova.provaorchestra.model.Strumento;
import it.prova.provaorchestra.model.Timpano;
import it.prova.provaorchestra.model.Trombone;
import it.prova.provaorchestra.model.Violino;
import it.prova.provaorchestra.model.Orchestra;

public class TestOrchestra {

	public static void main(String[] args) {

		Strumento musi1 = new Violino ("Violino", 4, Famiglia.Archi, true, false); 
		Strumento musi2 = new Flauto ("Flauto", 3, Famiglia.Legni, true, true); 
		Strumento musi3 = new Trombone ("Trombone", 3, Famiglia.Ottoni, true, false); 
		Strumento musi4 = new Timpano ("Timpano", 1, Famiglia.Percussioni, true, false); 

		
		List<Strumento> strumenti = new ArrayList<>(); 
		strumenti.add(musi1); 
		strumenti.add(musi2);
		strumenti.add(musi3);
		strumenti.add(musi4);
		
		
		System.out.println(musi1.ottieniDescrizione());
		musi1.accorda();
		System.out.println(musi1.produciSuono());
		
		System.out.println(musi2.ottieniDescrizione());
		musi2.accorda();
		System.out.println(musi2.produciSuono());
		
		System.out.println(musi3.ottieniDescrizione());
		musi3.accorda();
		System.out.println(musi3.produciSuono());
		
		System.out.println(musi4.ottieniDescrizione());
		musi4.accorda();
		System.out.println(musi4.produciSuono());
		
		Orchestra orchestrina = new Orchestra(strumenti);
		
		orchestrina.accordaStrumenti();
		orchestrina.eseguiConcerto();
		
		
	}

}

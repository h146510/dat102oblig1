package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

	private Film[] filmer;
	
	public Filmarkiv(int filmerAntall) {
		this.filmer = new Film[filmerAntall];
	}
	
	/**
     * Hente en film med gitt nr fra arkivet
     * @param nr nummer på film som skal hentes.
     * @return film med gitt nr. Om nr ikke finnes, returneres null.
     */
	@Override
	public Film finnFilm(int nr) {
		
		return null;
	}
	
	/** 
	  * Legger til en ny film. 
	  * @param nyFilm 
	  */ 
	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		
	}
	
	/** 
	  * Sletter en fil med gitt nr 
	  * @param filmnr nr på film som skal slettes 
	  * @return true dersom filmen ble slettet, false ellers 
	  */ 
	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/** 
	  * Søker og henter Filmer med en gitt delstreng i tittelen. 
	  * @param delstreng som må være i tittel 
	  * @return tabell med filmer som har delstreng i tittel 
	  */
	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 /** 
	  * Finner antall filmer med gitt sjanger 
	  * @param sjanger  
	  * @return antall filmer av gitt sjanger. 
	  */ 
	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 /** 
	  *  
	  * @return antall filmer i arkivet 
	  */ 
	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}

}

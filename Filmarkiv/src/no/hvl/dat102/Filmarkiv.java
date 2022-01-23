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
		for (int i = 0; i<filmer.length; i++) {
			if(filmer[i] != null && filmer[i].getFilmnr() == nr) {
				return filmer[i];
			}
		}
		Film film = null;
		return film;
	}
	
	/** 
	  * Legger til en ny film. 
	  * @param nyFilm 
	  */ 
	@Override
	public void leggTilFilm(Film nyFilm) {
		boolean laTil = false;
		for (int i = 0; i<filmer.length; i++){
			if(filmer[i] == null || filmer[i].equals(nyFilm)) {
				filmer[i] = nyFilm;
				laTil = true;
				break;
			}
		} 
		if (!laTil) {
			utvid();
			leggTilFilm(nyFilm);
		}
	}
	
	private void utvid() {
		Film[] filmerDobbel = new Film[filmer.length*2];
		for (int i = 0; i<filmer.length; i++) {
			filmerDobbel[i] = filmer[i];
		}
		filmer = filmerDobbel;
	}
	
	/** 
	  * Sletter en film med gitt nr 
	  * @param filmnr nr på film som skal slettes 
	  * @return true dersom filmen ble slettet, false ellers 
	  */ 
	@Override
	public boolean slettFilm(int filmnr) {
		for(int i = 0; i < filmer.length; i++) {
			if(filmer[i].getFilmnr() == filmnr) {
				filmer[i] = null;
				return true;
			}
		}
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

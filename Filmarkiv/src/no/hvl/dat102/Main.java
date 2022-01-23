package no.hvl.dat102;

public class Main {

	public static void main(String[] args) {
		
		Filmarkiv filmarkiv = new Filmarkiv(3);

        Sjanger action = Sjanger.ACTION;
        Sjanger drama = Sjanger.DRAMA;

        Film f1 = new Film(1, "Kai", "Road to Immortal", 1998, action, "Filmselskap");
        Film f2 = new Film(2, "Jarle", "Destroy items", 1993, drama, "Filmselskap");
        Film f3 = new Film(3, "Idiot", "xD", 1928, action, "Filmselskap");
	}

}

package histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain humain = new Humain("H","eau",54);
		humain.direBonjour();
		humain.acheter("une boisson", 12);
		humain.acheter("un jeu", 2);
		humain.acheter("un kimono", 50);
	}
}

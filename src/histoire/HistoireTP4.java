package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
//		1- Tous Humains !		
//		Humain humain = new Humain("H","eau",54);
//		humain.direBonjour();
//		humain.acheter("une boisson", 12);
//		humain.acheter("un jeu", 2);
//		humain.acheter("un kimono", 50);
//		
//		2- Commerçants, Ronins, et Yakuzas
		Commercant marco = new Commercant("Marco",15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		Ronin roro = new Ronin("Roro","shochu",60);
//		roro.direBonjour();
//		roro.donner(marco);
		roro.provoquer(yaku);
	}
}

package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
//		TP4
//		1- Tous Humains !		
//		Humain humain = new Humain("H","eau",54);
//		humain.direBonjour();
//		humain.acheter("une boisson", 12);
//		humain.acheter("un jeu", 2);
//		humain.acheter("un kimono", 50);
//		
//		2- Commerçants, Ronins, et Yakuzas
//		Commercant marco = new Commercant("Marco",15);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
//		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
//		Ronin roro = new Ronin("Roro","shochu",60);
//		roro.direBonjour();
//		roro.donner(marco);
//		roro.provoquer(yaku);
//		TP5
//		1- Les humains ont une mémoire
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();

	}
}

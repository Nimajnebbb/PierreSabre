package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;
import personnages.Humain;

public class HistoireTP5 {

	public static void main(String[] args) {
//		1- Les humains ont une mémoire
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
//		
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		
//		2- Le yakuza est fier de son clan
//		yaku.direBonjour();
		
//		3- Les Samouraïs
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
//		akimoto.faireConnaissanceAvec(marco);
//		akimoto.listerConnaissance();
//		akimoto.boire("thé");
		
//		4- Les traîtres
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
//		masako.faireLeGentil();
//		masako.ranconner(kumi);
//		masako.ranconner(chonin);
//		masako.ranconner(marco);
//		akimoto.faireConnaissanceAvec(masako);
//		masako.ranconner(kumi);
//		masako.faireConnaissanceAvec(yaku);
//		masako.faireLeGentil();
//		masako.faireConnaissanceAvec(roro);
		
//		5- Humains, Ronin, Samouraï et Traître : les mêmes origines mais pas
//		les mêmes combats !
		Samourai akira = new Traitre("Miyamoto", "Akira", "whisky", 50);
		Ronin hiro = new Traitre("Miyamoto", "Hiro", "saké", 20);
		Humain nori = new Traitre("Miyamoto", "Nori", "whisky", 70);
//		Quelles méthodes (et de quelles classes) peuvent être utilisées par les objets :
//		masako ? : les méthodes des classes Traitre, Samourai, Ronin et Humain
//		akira ? : les méthodes des classes Samourai, Ronin et Humain
//		hiro ?  : les méthodes des classes Ronin et Humain
//		nori ? : les méthodes de la classe Humain
		
//		6- Les grand-mères : les derniers personnages mais pas les moins
//		importants !
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();
	}

}

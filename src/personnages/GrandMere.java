package personnages;

import java.util.Random;

public class GrandMere extends Humain {

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	
	protected void memoriser(Humain humain) {
//		System.out.println("GrandMere class");
		if (nbConnaissance<5) {
			memoire[nbConnaissance] = humain;
//			System.out.println("Mémorisé par "+ this.getNom() + " : " + memoire[nbConnaissance].getNom());
			nbConnaissance += 1;
		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une "
					+ "personne supplémentaire !");
		}
	}
	
	private enum TypeHumain {
		HUMAIN("habitant"),COMMERCANT("commerçant"),YAKUZA("yakuza"),RONIN("ronin"),SAMOURAI("samouraï"),TRAITRE("traître"),GRANDMERE("grand-mère");
		
		private String nom;
		
		private TypeHumain(String nom) {
			this.nom = nom;
		}
	}
	
	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
//		System.out.println(TypeHumain.HUMAIN.nom);
//		for (int i=0;i<types.length;i++) {
//			System.out.println(types[i].nom);
//		}
		Random random =  new Random();
		int indiceHumain = random.nextInt(7);
		return types[indiceHumain].nom;
	}
	
	public void ragoter() {
		for (int i=0;i<5;i++) {
			if (memoire[i] != null) {
				if (memoire[i] instanceof Traitre) parler("Je crois que " + memoire[i].getNom() + " est un traitre. Petit chenapan !");
					else parler("Je crois que " + memoire[i].getNom() + " est un "+ humainHasard() + ".");
			}
		}
	}
}

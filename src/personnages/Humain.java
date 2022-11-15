package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain [30];
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + getNom() +") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boisson + ".");
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson +" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien +" à " + prix + " sous.");
			if (bien == "une boisson") this.boire();
			perdreArgent(prix);
		} else {
			parler("Je n'ai que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien +" à " + prix + " sous.");
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
//		System.out.println("Autre Humain : " + autreHumain.getNom());
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissance==30) {
			nbConnaissance = 0;
		} 
		memoire[nbConnaissance] = humain;
//		System.out.println("Mémorisé par "+ this.getNom() + " : " + memoire[nbConnaissance].getNom());
		nbConnaissance += 1;
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont : ");
		for (int i=0;i<nbConnaissance;i++) {
			System.out.print(" " + memoire[i].getNom());
			if (i < nbConnaissance-1) {
				System.out.print(",");
			}
		}
		System.out.println("");
	}
}

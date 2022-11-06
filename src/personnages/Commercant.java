package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		perdreArgent(argent);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
}

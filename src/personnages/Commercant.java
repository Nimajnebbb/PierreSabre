package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		argent = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		this.argent += argent;
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
}

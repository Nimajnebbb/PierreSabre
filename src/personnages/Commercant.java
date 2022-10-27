package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
		// TODO Auto-generated constructor stub
	}
	
	public int seFaireExtorquer() {
		argent = 0;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		this.argent += argent;
		parler(argent + " sous ! Je te remercie généreux donateur!");
		System.out.println(this.argent);
	}
}

package personnages;

public class Traitre extends Samourai{
	
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+ niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		//TODO
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
//			System.out.println(argentCommercant);
			double argentRanconner = argentCommercant*(2.0/10.0);
//			System.out.println(argentRanconner + 2.0/10.0 );
			commercant.perdreArgent((int) argentRanconner);
			gagnerArgent((int) argentRanconner);
			niveauTraitrise ++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi "+ (int) argentRanconner +" sous ou gare à toi !");
			commercant.parler("Tout de suite grand "+ commercant.getNom() +".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un Samouraï va me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami-ami avec personne car je ne connais personne ! Snif.");
		} else {
			// Génération d'un humain connu aléatoire
			int has = 0 + (int)(Math.random() * (nbConnaissance - 0));
//			System.out.println(nbConnaissance + " nb aléa: "+ has);
			Humain humain = memoire[has];
//			System.out.println(humain.getNom());
			
			int don = argent*(1/20);
			String nomAmi = humain.getNom();
			parler("Il faut absolument remonter ma côte de confiance. Je vais faire ami-ami avec "+ nomAmi +".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+ don +" sous.");
			humain.gagnerArgent(don);
			perdreArgent(don);
			humain.parler("Merci "+ getNom() +". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise >= 0) niveauTraitrise--;
		}
	}
}

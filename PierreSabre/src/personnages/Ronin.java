package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;

	public Ronin(String nom, String boissons, int argent, int honneur) {
		super(nom, boissons, argent);
		this.honneur = honneur;
	}
	
	
	public void donner(Commercant beneficiare) {
		int argentdonner = getArgent() / 10;
		
		parler(beneficiare.getNom() + " prend ces " + argentdonner + " sous");
		
		
		perdreArgent(argentdonner);
		
		beneficiare.recevoir(argentdonner);
		
		
	}
	
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		int force = honneur;
		int reputationYakuza = adversaire.getReputation();
		
		if(force >= reputationYakuza) {
			parler("Je t’ai eu petit yakusa!");
			int argentpris = adversaire.perdre();
			if(argentpris > 0) {
				gagnerArgent(argentpris);
			}
			
			honneur = honneur + 1;
		}else {
			honneur = honneur - 1;
			int argentronin = getArgent();
			if(argentronin > 0) {
				perdreArgent(argentronin);
			}
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentronin);
		}
		
		
		
	}
	
	
	
	
	

}

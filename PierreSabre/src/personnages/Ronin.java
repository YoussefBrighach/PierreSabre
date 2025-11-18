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
	
	
	

}

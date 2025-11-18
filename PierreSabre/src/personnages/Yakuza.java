package personnages;
import personnages.Humain;
import personnages.Commercant;


public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boissons, int argent, String clan, int reputation) {
		super(nom, boissons, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		
		int argent_pris = victime.seFaireExtorquer();
		
		gagnerArgent(argent_pris);
		
		reputation++;
		
		parler("J’ai piqué les " + argent_pris + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() +" sous dans ma poche. Hi ! Hi !");
		
	}
	
	
	
	
	
	
	
	
	
	

}

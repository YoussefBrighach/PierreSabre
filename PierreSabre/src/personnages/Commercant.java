package personnages;



public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thè", argent);
	}
	
	
	public int seFaireExtorquer(){
		int argent_commercant = getArgent();
		if(argent_commercant >= 0) {
			perdreArgent(argent_commercant);
			
		}
		
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argent_commercant;
		
		
	}
	
	public void recevoir(int argent) {
		if(argent > 0) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
		
		}
		
	}
	
	
	
	

}

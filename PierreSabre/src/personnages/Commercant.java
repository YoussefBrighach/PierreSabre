package personnages;



public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	
	public int seFaireExtorquer(){
		int argentcommercant = getArgent();
		if(argentcommercant >= 0) {
			perdreArgent(argentcommercant);
			
		}
		
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentcommercant;
		
		
	}
	
	public void recevoir(int argent) {
		if(argent > 0) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
		
		}
		
	}
	
	
	
	

}

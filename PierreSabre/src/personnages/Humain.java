package personnages;
public class Humain {
	
	private String nom;
	private String boissons;
	int argent;
	
	
	
	public Humain(String nom, String boissons, int argent) {
		this.nom = nom;
		this.boissons = boissons;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du "+ boissons);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissons + "! GLOUPS !");
		
	}
	
	
	public void acheter(String bien, int prix) {
		if(argent >= prix) {
			parler("J'ai " + argent +" sous en poche. Je vais pouvoir m'offrir " + bien +"à "+ prix + " sous");
			perdreArgent(prix);
		}else {
			parler("Je n' ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien +" à 50 sous.");
		}
	}
	
	protected void gagnerArgent(int gain) {
		argent = argent + gain;
		
	}
	
	protected void perdreArgent(int perte) {
		argent = argent - perte;
		
		
	}
	
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	
	
	
	
	
	
	
}


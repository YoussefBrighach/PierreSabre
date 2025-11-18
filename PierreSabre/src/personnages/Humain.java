package personnages;

import java.util.Iterator;

public class Humain {
	
	private String nom;
	private String boissons;
	private int argent;
	protected int nbConnaisssances;
	protected Humain[] memoires = new Humain[30];
	
	
	
	

	public Humain(String nom, String boissons, int argent) {
		super();
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
		argent += gain;
		
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
		
		
	}
	
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	
	public void faireConnaissancesAvec(Humain homme2){
		this.direBonjour();
		homme2.repondre(this);
		this.memoriser(homme2);
		
		
	}
	
	private void repondre(Humain homme1) {
		this.direBonjour();
		this.memoriser(homme1);
		
		
	}
	
	private void memoriser(Humain homme1) {
		if(nbConnaisssances < memoires.length)
		{
			memoires[nbConnaisssances] = homme1;
			nbConnaisssances++;
		}
		
	}
	
	public void listerConnaissance() {
		if(nbConnaisssances == 0)
		{
			return;
		}
		
		parler(nom + " Je connais beaucoup de monde dont : ");
			for (int i = 0; i < nbConnaisssances; i++) {
				System.out.print(memoires[i].getNom());
				if( i < nbConnaisssances - 1)
				{
					System.out.print(", ");
				}
				
				
			}
			
			System.out.println();
			
	}
	
	
	
	
	
	
	
	
}


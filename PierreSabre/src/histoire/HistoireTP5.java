package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Commercant;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		
		
		Commercant marco =  new Commercant("Marco", 20); 
		
		Commercant chonin =  new Commercant("Chonin", 40); 
		
		Commercant kumi =  new Commercant("Kumi", 10); 
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong",0);
		
		Ronin roro = new Ronin("Roro", "shochu", 60, 1); 
		
		marco.faireConnaissancesAvec(roro);
		marco.faireConnaissancesAvec(yaku);
		marco.faireConnaissancesAvec(chonin);
		marco.faireConnaissancesAvec(kumi);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
	}

}

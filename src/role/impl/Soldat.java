package role.impl;

import java.util.Random;

import etat.impl.Adulte;
import general.Constantes;

public class Soldat extends Role{
	
	public void genererAge() {
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Soldat);
	}
	
	public void patrouille(Adulte a) {
		
	}
	
	public static void actionSoldat() {
		
	}
}

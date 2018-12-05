package role.impl;

import java.awt.Point;
import java.util.Random;

import etat.impl.Adulte;
import general.Constantes;
import general.Fourmi;

public class Ouvriere extends Role{
	protected int nourriture;

	public Ouvriere (){
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Ouvriere);
		//System.out.println("Ouvriere");
	}
	
	public void chasse(Adulte a) {
		
	}
	
	public void donnerNourriture(Adulte a) {
		
	}
	
	public void nidConstruction(Adulte a) {
		
	}
}

package role.impl;

import java.util.Random;

import etat.impl.Adulte;
import general.Constantes;

public class Ouvriere extends Role{
	protected int nourriture;

	public Ouvriere (){
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
		this.couleur = Constantes.couleurOuvriere;
		this.taille = 10;
	}
	
	public void deplacement(Adulte a) {
		Random r = new Random();
		int x,y,probabilite;
		probabilite = r.nextInt(4-1) + 1;
		if(probabilite == 1) {
			x = a.getPositionX();
			y = a.getPositionY();
			a.setPositionX(x+1);
			a.setPositionY(y+1);
		}
		if(probabilite == 2) {
			x = a.getPositionX();
			y = a.getPositionY();
			a.setPositionX(x-1);
			a.setPositionY(y-1);
		}
		if(probabilite == 3) {
			x = a.getPositionX();
			y = a.getPositionY();
			a.setPositionX(x-1);
			a.setPositionY(y+1);
		}
		if(probabilite == 4) {
			x = a.getPositionX();
			y = a.getPositionY();
			a.setPositionX(x+1);
			a.setPositionY(y-1);
		}
	}
	
	public void chasse(Adulte a) {
		
	}
	
	public void donnerNourriture(Adulte a) {
		
	}
	
	public void nidConstruction(Adulte a) {
		
	}
}

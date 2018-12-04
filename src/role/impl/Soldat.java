package role.impl;

import java.util.Random;

import etat.impl.Adulte;
import general.Constantes;

public class Soldat extends Role{
	
	public void genererAge() {
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
		this.couleur = Constantes.couleurSoldat;
		this.taille = Constantes.tailleFourmis;
	}
	
	public void deplacement(Adulte a) {
		Random r = new Random();
		int x,y,probabilite;
		probabilite = r.nextInt(4-1) + 1;
		if(probabilite == 1) {
			x = a.getPositionX();
			a.setPositionX(x+1);
		}
		if(probabilite == 2) {
			x = a.getPositionX();
			a.setPositionX(x-1);
		}
		if(probabilite == 3) {
			y = a.getPositionY();
			a.setPositionY(y+1);
		}
		if(probabilite == 4) {
			y = a.getPositionY();
			a.setPositionY(y-1);
		}
		
	}
	
	public void patrouille(Adulte a) {
		
	}
}

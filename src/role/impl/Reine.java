package role.impl;

import java.util.Random;

import etat.impl.Oeuf;
import general.Constantes;

public class Reine extends Role{
	
	public Reine() {
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxReine-Constantes.nombreJourMiniReine) + Constantes.nombreJourMiniReine;
		this.taille = Constantes.tailleReine; 
		this.setRole(RoleFourmi.Reine);
	}
	
	public Oeuf genererFourmi(int tempsdenaissance) {
		Random rx = new Random();
		Random ry = new Random();
		int posx,posy;
		posx = rx.nextInt((Constantes.tailleFourmiliereX+Constantes.departFourmiliereX-Constantes.tailleFourmis)-Constantes.departFourmiliereX)+Constantes.departFourmiliereX;
		posy = ry.nextInt((Constantes.tailleFourmiliereY+Constantes.departFourmiliereY-Constantes.tailleFourmis)-Constantes.departFourmiliereY)+Constantes.departFourmiliereY;
		Oeuf oeuf = new Oeuf(tempsdenaissance,posx,posy);
		return oeuf;
	}
}

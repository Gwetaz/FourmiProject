package role.impl;

import java.util.Random;

import etat.impl.Oeuf;
import general.Constantes;

public class Reine extends Role{
	
	public Reine() {
		Random r = new Random(); 
		this.age = r.nextInt(Constantes.nombreJourMaxReine-Constantes.nombreJourMiniReine) + Constantes.nombreJourMiniReine;
		this.couleur = Constantes.couleurReine;
		this.taille = 20;
	}
	
	public Oeuf genererFourmi(int tempsdenaissance) {
		Oeuf oeuf = new Oeuf(tempsdenaissance,4,5);
		return oeuf;
	}
}

package etat.impl;


import general.Constantes;

public class Oeuf extends Etat implements Transformation{
	
	public Oeuf(int tempsNaissance, int positionX, int positionY) {
		super(tempsNaissance, positionX, positionY);
		this.changerEtat(EtatFourmi.Oeuf);
		this.poid = 0;
		this.couleur = Constantes.couleurOeuf; 
	}
	
	
	@Override
	public Etat transformation() {
		return new Larve(tempsNaissance, positionX, positionY);
	}

}

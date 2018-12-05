package etat.impl;


import general.Constantes;

public class Oeuf extends Etat{
	
	public Oeuf() {
		this.changerEtat(EtatFourmi.Oeuf);
		this.poid = 0;
		this.color = Constantes.couleurOeuf;
	}
	
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Oeuf ne fait rien");
	}
	
	/*@Override
	public Etat transformation() {
		return new Larve(tempsNaissance, positionX, positionY);
	}*/

}

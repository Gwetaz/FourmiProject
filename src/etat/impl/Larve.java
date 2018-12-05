package etat.impl;


import java.awt.Color;
import java.util.Random;

import general.Action;
import general.Constantes;


public class Larve extends Etat{

	public Larve()
	{
		this.changerEtat(EtatFourmi.Larve);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5)*4;
		this.color = Constantes.couleurLarve;
	}
	
	@Override
	public void action() {
		System.out.println("Larve fait rien");
		
	}
	
	
	
	/*@Override
	public Etat transformation() {
		return new Nymphe(tempsNaissance, positionX, positionY);
	}*/

}

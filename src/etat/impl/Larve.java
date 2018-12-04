package etat.impl;

import java.awt.Color;
import java.util.Random;

import general.Constantes;

public class Larve extends Etat implements Transformation{

	public Larve(int tempsNaissance, int positionX, int positionY)
	{
		super(tempsNaissance, positionX, positionY);
		this.changerEtat(EtatFourmi.Larve);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5)*4;
		this.couleur = Constantes.couleurLarve; 
	}
	
	
	@Override
	public Etat transformation() {
		return new Nymphe(tempsNaissance, positionX, positionY);
	}

}

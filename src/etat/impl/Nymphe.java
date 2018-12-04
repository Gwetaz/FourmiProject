package etat.impl;

import java.awt.Color;
import java.util.Random;

import general.Constantes;

public class Nymphe extends Etat implements Transformation{

	public Nymphe(int tempsNaissance, int positionX, int positionY)
	{
		super(tempsNaissance, positionX, positionY);
		this.changerEtat(EtatFourmi.Nymphe);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		this.couleur = Constantes.couleurNymphe;
	}
	
	@Override
	public Etat transformation() {
		return new Adulte(tempsNaissance, positionX, positionY);
	}

}

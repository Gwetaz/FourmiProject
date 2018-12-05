package etat.impl;

import java.awt.Color;
import java.util.Random;

import general.Action;
import general.Constantes;

public class Nymphe extends Etat{

	public Nymphe()
	{
		this.changerEtat(EtatFourmi.Nymphe);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		this.color = Constantes.couleurNymphe;
	}
	
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Nymphe fait rien");
	}
	
	/*@Override
	public Etat transformation() {
		return new Adulte(tempsNaissance, positionX, positionY);
	}*/

}

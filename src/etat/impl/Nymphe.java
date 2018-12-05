package etat.impl;

import java.awt.Color;
import java.util.Random;

import general.Action;
import general.Constantes;
import general.Fourmi;

public class Nymphe extends Etat{

	public Nymphe()
	{
		this.changerEtat(EtatFourmi.Nymphe);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		this.color = Constantes.couleurNymphe;
	}
	
	public static void actionEtat(Fourmi f){
		// TODO Auto-generated method stub
		System.out.println("Oeuf ne fait rien");
	}
	
	/*@Override
	public Etat transformation() {
		return new Adulte(tempsNaissance, positionX, positionY);
	}*/

}

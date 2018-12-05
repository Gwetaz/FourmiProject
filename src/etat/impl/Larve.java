package etat.impl;

import java.util.Random;

import general.Constantes;
import general.Fourmi;


public class Larve extends Etat{

	public Larve()
	{
		this.changerEtat(EtatFourmi.Larve);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5)*4;
		this.color = Constantes.couleurLarve;
	}
	
	public static void actionEtat(Fourmi f){
		// TODO Auto-generated method stub
		System.out.println("Oeuf ne fait rien");
	}
	
	
	
	/*@Override
	public Etat transformation() {
		return new Nymphe(tempsNaissance, positionX, positionY);
	}*/

}

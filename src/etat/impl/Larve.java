package etat.impl;

import java.util.Random;

import general.Constantes;
import general.Fourmi;


public class Larve extends Etat{

	public Larve()
	{
		//this.nbJourEnEtat = 0;
		this.changerEtat(EtatFourmi.Larve);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5)*4;
		this.color = Constantes.couleurLarve;
	}
	
	public static void actionEtat(Fourmi f){
		f.setEtat(new Nymphe());
	}

}

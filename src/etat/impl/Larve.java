package etat.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import general.Constantes;
import general.Fourmi;


public class Larve extends Etat{

	public Larve()
	{
		//this.nbJourEnEtat = 0;
		this.changerEtat(EtatFourmi.Larve);
		Random r = new Random();
		this.poid = BigDecimal.valueOf((1.5 + r.nextFloat() * (2-1.5))*4).setScale(2, RoundingMode.HALF_UP).doubleValue();
		this.color = Constantes.couleurLarve;
	}
	
	/*public static void actionEtat(Fourmi f){
		f.setEtat(new Nymphe());
	}*/

}

package etat.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import general.Constantes;

public class Nymphe extends Etat{

	public Nymphe()
	{
		this.changerEtat(EtatFourmi.Nymphe);
		Random r = new Random();
		this.poid = BigDecimal.valueOf(1.5 + r.nextFloat() * (2-1.5)).setScale(2, RoundingMode.HALF_UP).doubleValue();
		this.color = Constantes.couleurNymphe;
	}
}

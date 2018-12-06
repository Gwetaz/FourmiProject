package etat.impl;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import role.impl.Ouvriere;
import role.impl.RoleFourmi;
import role.impl.Soldat;
import general.Action;
import general.Constantes;
import general.Fourmi;

public class Nymphe extends Etat{

	public Nymphe()
	{
		//this.nbJourEnEtat = 0;
		this.changerEtat(EtatFourmi.Nymphe);
		Random r = new Random();
		this.poid = BigDecimal.valueOf(1.5 + r.nextFloat() * (2-1.5)).setScale(2, RoundingMode.HALF_UP).doubleValue();
		this.color = Constantes.couleurNymphe;
	}
	
	/*public static void actionEtat(Fourmi f){
		Random r = new Random();
		int role = r.nextInt(100-0);
		if(role <= Constantes.pourcentOuvriere)
		{
			f.setEtat(new Adulte(new Ouvriere()));
			f.setRoleAdulte(RoleFourmi.Ouvriere);
		}else{
			f.setEtat(new Adulte(new Soldat()));
			f.setRoleAdulte(RoleFourmi.Soldat);
		}		
	}*/

}

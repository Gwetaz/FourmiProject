package role.impl;

import general.Constantes;
import general.Fourmi;

public class Sexuee extends Role{
	protected int nourriture;

	public Sexuee (){
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Sexuee);
	}
	
	
	public static void sortirEcran(Fourmi f)
	{
		int posx,posy,ecartHaut,ecartBas,ecartDroite,ecartGauche;
		int finFourX = Constantes.tailleJframeX;
		int finFourY = Constantes.tailleJframeY;
		posx = f.getPosX();
		posy = f.getPosY();
		ecartHaut = posy;
		ecartBas = finFourY - posy;
		ecartGauche = posx;
		ecartDroite = finFourX - posx;
		
		if(ecartHaut < ecartBas && ecartHaut < ecartGauche && ecartHaut < ecartDroite)
		{
			f.setPosY(posy-10);
		}else if(ecartBas < ecartHaut && ecartBas < ecartGauche && ecartBas < ecartDroite)
		{
			f.setPosY(posy+10);
		}else if(ecartGauche < ecartBas && ecartGauche < ecartHaut && ecartGauche < ecartDroite)
		{
			f.setPosX(posx-10);
		}else if(ecartDroite < ecartBas && ecartDroite < ecartGauche && ecartDroite < ecartHaut)
		{
			f.setPosX(posx+10);
		}else{
			f.setPosY(posy-10);
		}
	}
	
	public static void deplacement(Fourmi f) {
		int posx,posy;
		posx = f.getPosX();
		posy = f.getPosY();
		if(posy <= 0 || posy >= Constantes.tailleJframeY || posx <= 0 || posx >= Constantes.tailleJframeX)
		{
			f.setNbJourDeVie(f.getNbJourDeMort());
		}
		if(posy > 0 && posy < Constantes.tailleJframeY && posx > 0 && posx < Constantes.tailleJframeX){
			sortirEcran(f);
		}
	}
	
	public static void actionSexuee(Fourmi f) {
		deplacement(f);
	}
}


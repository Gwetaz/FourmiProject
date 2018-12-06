package role.impl;

import java.util.Random;

import general.Constantes;
import general.Fourmi;

public class Ouvriere extends Role{
	protected int nourriture;

	public Ouvriere (){
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Ouvriere);
	}
	
	public static void sortirNid(Fourmi f)
	{
		int posx,posy,ecartHaut,ecartBas,ecartDroite,ecartGauche;
		int finNidX = Constantes.departNidX+Constantes.tailleNidX;
		int finNidY = Constantes.departNidY+Constantes.tailleNidY;
		posx = f.getPosX();
		posy = f.getPosY();
		ecartHaut = posy - Constantes.departNidY;
		ecartBas = finNidY - posy;
		ecartGauche = posx - Constantes.departNidX;
		ecartDroite = finNidX - posx;
		
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
		//if(posx)
	}
	
	public static void chasse(Fourmi f) {
		Random r = new Random();
		int posx,posy,probabilite;
		posx = f.getPosX();
		posy = f.getPosY();
		probabilite = r.nextInt(5-1) + 1;
		if(probabilite == 1)
			f.setPosX(posx+10);
		if(probabilite == 2)
			f.setPosX(posx-10);
		if(probabilite == 3)
			f.setPosY(posy+10);
		if(probabilite == 4)
			f.setPosY(posy-10);
	}
	
	public void donnerNourriture(Fourmi f) {
		
	}
	
	public void nidConstruction(Fourmi f) {
		
	}
	
	public static void actionOuvriere(Fourmi f) {
		chasse(f);
	}
}

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
	}
	
	public static void sortirFourmiliere(Fourmi f)
	{
		int posx,posy,ecartHaut,ecartBas,ecartDroite,ecartGauche;
		int finFourX = Constantes.departFourmiliereX+Constantes.tailleFourmiliereX;
		int finFourY = Constantes.departFourmiliereY+Constantes.tailleFourmiliereY;
		posx = f.getPosX();
		posy = f.getPosY();
		ecartHaut = posy - Constantes.departFourmiliereY;
		ecartBas = finFourY - posy;
		ecartGauche = posx - Constantes.departFourmiliereX;
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
		Random r = new Random();
		int prob;
		prob = r.nextInt(2-1) + 1;
		if(prob == 1) {
			deplacementFourmiliere(f);
		}
		else if(prob == 2) {
			deplacementChasse(f);
		}
		
	}
	
	public static void deplacementFourmiliere(Fourmi f) {
		sortirNid(f);
		Random r = new Random();
		int posx,posy, prob;
		posx = f.getPosX();
		posy = f.getPosY();
		prob = r.nextInt(5-1) + 1;
		if(prob == 1)
			f.setPosX(posx+10);
		if(prob == 2)
			f.setPosX(posx-10);
		if(prob == 3)
			f.setPosY(posy+10);
		if(prob == 4)
			f.setPosY(posy-10);
	}
	
	public static void deplacementChasse(Fourmi f) {
		sortirFourmiliere(f);
		Random r = new Random();
		int posx,posy, prob;
		posx = f.getPosX();
		posy = f.getPosY();
		prob = r.nextInt(5-1) + 1;
		if(prob == 1)
			f.setPosX(posx+10);
		if(prob == 2)
			f.setPosX(posx-10);
		if(prob == 3)
			f.setPosY(posy+10);
		if(prob == 4)
			f.setPosY(posy-10);
	}
	
	public void donnerNourriture(Fourmi f) {
		
	}
	
	public void nidConstruction(Fourmi f) {
		
	}
	
	public static void actionOuvriere(Fourmi f) {
		deplacement(f);
	}
}

package role.impl;

import java.awt.Point;
import java.util.Random;

import IHM.Monde3;
import general.Constantes;
import general.Fourmi;
import general.Matrice;

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
	
	public static void deplacement(Fourmi f, Monde3 m) {
		Random r = new Random();
		int prob;
		prob = r.nextInt(3-1) + 1;
		if(m.getMatrice().PheroOuPas(f) == 1) {
			deplacementChasse(f,m);
		}
		else {
			if(prob == 1) {
				deplacementFourmiliere(f);
			}
			else if(prob == 2) {
				deplacementChasse(f,m);
			}
		}
		
	}
	
	public static void deplacementFourmiliere(Fourmi f) {
		Random r = new Random();
		int posx,posy, prob;
		posx = f.getPosX();
		posy = f.getPosY();
		if(posy > Constantes.departNidY && posy < Constantes.finNidY && posx > Constantes.departNidX && posx < Constantes.finNidX) {
			sortirNid(f);
		}
		
		prob = r.nextInt(5-1) + 1;
		if(prob == 1)
			if(posx+10 > Constantes.tailleJframeX);
			else f.setPosX(posx+10);
		if(prob == 2)
			if(posx-10 < 10);
			else f.setPosX(posx-10);
		if(prob == 3)
			if(posy+10 > Constantes.tailleJframeY);
			else f.setPosY(posy+10);
		if(prob == 4)
			if(posy-10 < 10);
			else f.setPosY(posy-10);
	}
	
	public static void deplacementChasse(Fourmi f, Monde3 m) {	
		Random r = new Random();
		int posx,posy, prob;
		Point proie;
		posx = f.getPosX();
		posy = f.getPosY();
		if(posy > Constantes.departFourmiliereY && posy < Constantes.departFourmiliereY+Constantes.tailleFourmiliereY && posx > Constantes.departFourmiliereX && posx < Constantes.departFourmiliereX+Constantes.tailleFourmiliereX) {
			sortirFourmiliere(f);
		}
		if(f.isCreationChemin())
		{
			if(m.getMatrice().DePosACase(f.getPosX(), f.getPosY()).getX() == f.getStackproche(m).getX() && m.getMatrice().DePosACase(f.getPosX(), f.getPosY()).getY() == f.getStackproche(m).getY())
			{
				f.setPossedeNourriture(false);
			}else{
			}
		}else{
			if(m.getMatrice().PheroOuPas(f) == 1) {
				
				if(f.isPossedeNourriture())
				{
					
				}else{ //si case phromone et pas nourriture
					
					if(m.affProieDansCase(m.getMatrice().DePosACase(posx, posy)))
					{
						
						f.setCreationChemin(true);
					}else
					if(m.proieDansCase(m.getMatrice().DePosACase(posx, posy)))//si case phromone et pas nourriture et dans une proie
					{
						f.setPossedeNourriture(true);
						
						f.setCreationChemin(true);
					}
					else if(m.cheminExiste(m.getMatrice().DePosACase(posx, posy))) { //si case phromone et pas nourriture et sur un chemin qui existe
						// go to proie
						
					}else{ //si case phromone et pas nourriture et pas dans de chemin qui existe = 1ere qui crer le chemin
						
						//m.affProieDansCase(m.getMatrice().DePosACase(posx, posy));
					}
				}
				
			}
			else {
				prob = r.nextInt(5-1) + 1;
				if(prob == 1)
					if(posx+10 > Constantes.tailleJframeX);
					else f.setPosX(posx+10);
				if(prob == 2)
					if(posx-10 < 10);
					else f.setPosX(posx-10);
				if(prob == 3)
					if(posy+10 > Constantes.tailleJframeY);
					else f.setPosY(posy+10);
				if(prob == 4)
					if(posy-10 < 10);
					else f.setPosY(posy-10);
			}
		}
				
	}
	
	public void donnerNourriture(Fourmi f) {
		
	}
	
	public void nidConstruction(Fourmi f) {
		
	}
	
	public static void actionOuvriere(Fourmi f, Monde3 m) {
		deplacement(f,m);
	}
}

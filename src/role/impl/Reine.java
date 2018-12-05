package role.impl;

import java.util.Random;

import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;

public class Reine extends Role{
	
	public Reine() {
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxReine-Constantes.nombreJourMiniReine) + Constantes.nombreJourMiniReine;
		this.taille = Constantes.tailleReine; 
		this.setRole(RoleFourmi.Reine);
	}
	
	public static void genererFourmi(int tempsdenaissance) {
		Random rx = new Random();
		Random ry = new Random();
		int posx,posy;
		posx = rx.nextInt((Constantes.tailleFourmiliereX+Constantes.departFourmiliereX-Constantes.tailleFourmis)-Constantes.departFourmiliereX)+Constantes.departFourmiliereX;
		posy = ry.nextInt((Constantes.tailleFourmiliereY+Constantes.departFourmiliereY-Constantes.tailleFourmis)-Constantes.departFourmiliereY)+Constantes.departFourmiliereY;
		Fourmi fourmi = new Fourmi(tempsdenaissance, posx, posy);
		Fourmiliere.ajouterFourmis(fourmi);
	} 
	
	public static void actionReine() {
		genererFourmi(1);
	}
}

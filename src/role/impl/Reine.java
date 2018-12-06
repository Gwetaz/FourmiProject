package role.impl;

import java.util.Random;

import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;

public class Reine extends Role{
	
	
	public Reine() {
		/*Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxReine-Constantes.nombreJourMiniReine) + Constantes.nombreJourMiniReine;*/
		this.taille = Constantes.tailleReine; 
		this.setRole(RoleFourmi.Reine);
	}
	
	public static void genererFourmi(int tempsdenaissance, Fourmiliere fourmiliere) {
		//System.out.println("generer fourmi REINE");
		Random rx = new Random();
		Random ry = new Random();
		int posx,posy;
		posx = rx.nextInt((Constantes.tailleNidX+Constantes.departNidX-Constantes.tailleFourmis)-Constantes.departNidX)+Constantes.departNidX;
		posy = ry.nextInt((Constantes.tailleNidY+Constantes.departNidY-Constantes.tailleFourmis)-Constantes.departNidY)+Constantes.departNidY;
		Fourmi fourmi = new Fourmi(tempsdenaissance, posx, posy, fourmiliere);
		//System.out.println(fourmi.toString());
		fourmiliere.ajouterFourmis(fourmi);
	} 
	
	public static void actionReine(Fourmiliere fourmiliere) {
		genererFourmi(1, fourmiliere);
		//System.out.println("ACTION REINE");
	}
}

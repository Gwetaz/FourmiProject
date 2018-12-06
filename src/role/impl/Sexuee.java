package role.impl;

import general.Constantes;
import general.Fourmi;

import java.util.Random;

public class Sexuee extends Role{
	protected int nourriture;

	public Sexuee (){
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Sexuee);
	}
	
	public static void deplacement(Fourmi f) {
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
	
	public static void actionSexuee(Fourmi f) {
		deplacement(f);
	}
}


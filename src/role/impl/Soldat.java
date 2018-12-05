package role.impl;

import java.util.Random;

import general.Constantes;
import general.Fourmi;

public class Soldat extends Role{
	
	public Soldat() {
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Soldat);
	}
	
	public static void patrouille(Fourmi f) {
		Random r = new Random();
		int posx,posy,probabilite;
		posx = f.getPosX();
		posy = f.getPosY();
		probabilite = r.nextInt(5-1) + 1;
		if(probabilite == 1)
			if(posy > 350 && posy < 450 && posx+10 > 750 && posx+10 < 850);
			else if(posx+10 > 900);
			else if(posx+10 < 700);
			else if(posy > 500);
			else if(posy < 300);
			else {
				f.setPosX(posx+10);
			}
			
		if(probabilite == 2)
			if(posy > 350 && posy < 450 && posx-10 > 750 && posx-10 < 850);
			else if(posx-10 > 900);
			else if(posx-10 < 700);
			else if(posy > 500);
			else if(posy < 300);
			else {
				f.setPosX(posx-10);
			}
		if(probabilite == 3)
			if(posy+10 > 350 && posy+10 < 450 && posx > 750 && posx < 850);
			else if(posx > 900);
			else if(posx < 700);
			else if(posy+10 > 500);
			else if(posy+10 < 300);
			else {
				f.setPosY(posy+10);

			}
		if(probabilite == 4)
			if(posy-10 > 350 && posy-10 < 450 && posx > 750 && posx < 850);
			else if(posx > 900);
			else if(posx < 700);
			else if(posy-10 > 500);
			else if(posy-10 < 300);
			else {
				f.setPosY(posy-10);
			}
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
	
	public static void actionSoldat(Fourmi f) {
		patrouille(f);
	}
}

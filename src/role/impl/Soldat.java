package role.impl;

import java.awt.Point;
import java.util.Random;

import etat.impl.Adulte;
import general.Constantes;
import general.Fourmi;

public class Soldat extends Role{
	
	public void genererAge() {
		Random r = new Random();
		this.age = r.nextInt(Constantes.nombreJourMaxAdulte-Constantes.nombreJourMiniAdulte) + Constantes.nombreJourMiniAdulte;
		this.couleur = Constantes.couleurSoldat;
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Soldat);
	}
	
	public void deplacement(Fourmi f) {
		Random r = new Random();
		int x,y,probabilite;
		probabilite = r.nextInt(4-1) + 1;
		x = (int) f.getC().getPosition().getX();
		y = (int) f.getC().getPosition().getY();
		if(probabilite == 1) {
			x++;
		}
		if(probabilite == 2) {
			x--;
		}
		if(probabilite == 3) {
			y++;
		}
		if(probabilite == 4) {
			y--;
		}
		f.getC().setPosition(new Point(x,y));
	}
	
	public void patrouille(Adulte a) {
		
	}
}

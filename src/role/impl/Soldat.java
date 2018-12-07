package role.impl;

import java.util.Random;

import general.Constantes;
import general.Fourmi;

public class Soldat extends Role{
	
	public Soldat() {
		this.taille = Constantes.tailleFourmis;
		this.setRole(RoleFourmi.Soldat);
	}
	
	//Comme son nom l'indique lorsque la fourmi devient adulte cette méthode la fait sortir du nid
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
	
	//Cette méthode défini le déplacement d'une fourmi soldat qui protège le nid et donc reste dans un périmètre autour du nid
	public static void patrouille(Fourmi f) {
		Random r = new Random();
		int posx,posy,probabilite;
		posx = f.getPosX();
		posy = f.getPosY();
		//Si la fourmi est dans le nid alors on appel la méthode sortirNid();
		if(posy > Constantes.departNidY && posy < Constantes.finNidY && posx > Constantes.departNidX && posx < Constantes.finNidX) {
			sortirNid(f);
		}
		probabilite = r.nextInt(5-1) + 1;
		if(probabilite == 1)
			//si la fourmi est fourmi est dans le nid on ne fait rien
			if(posy > Constantes.departNidY && posy < Constantes.finNidY && posx+10 > Constantes.departNidX && posx+10 < Constantes.finNidX);
			//Les constantes expliques les frontières (voir Constantes pour plus de précisions sur les limites)
			else if(posx+10 > Constantes.finFrontierePatrouilleX);
			else if(posx+10 < Constantes.departFrontierePatrouilleX);
			else if(posy > Constantes.finFrontierePatrouilleY);
			else if(posy < Constantes.departFrontierePatrouilleY);
			else {
				f.setPosX(posx+10);
			}
			
		if(probabilite == 2)
			if(posy > Constantes.departNidY && posy < Constantes.finNidY && posx-10 > Constantes.departNidX && posx-10 < Constantes.finNidX);
			else if(posx-10 > Constantes.finFrontierePatrouilleX);
			else if(posx-10 < Constantes.departFrontierePatrouilleX);
			else if(posy > Constantes.finFrontierePatrouilleY);
			else if(posy < Constantes.departFrontierePatrouilleY);
			else {
				f.setPosX(posx-10);
			}
		if(probabilite == 3)
			if(posy+10 > Constantes.departNidY && posy+10 < Constantes.finNidY && posx > Constantes.departNidX && posx < Constantes.finNidX);
			else if(posx > Constantes.finFrontierePatrouilleX);
			else if(posx < Constantes.departFrontierePatrouilleX);
			else if(posy+10 > Constantes.finFrontierePatrouilleY);
			else if(posy+10 < Constantes.departFrontierePatrouilleY);
			else {
				f.setPosY(posy+10);

			}
		if(probabilite == 4)
			if(posy-10 > Constantes.departNidY && posy-10 < Constantes.finNidY && posx > Constantes.departNidX && posx < Constantes.finNidX);
			else if(posx > Constantes.finFrontierePatrouilleX);
			else if(posx < Constantes.departFrontierePatrouilleX);
			else if(posy-10 > Constantes.finFrontierePatrouilleY);
			else if(posy-10 < Constantes.departFrontierePatrouilleY);
			else {
				f.setPosY(posy-10);
			}
	}
	
	public static void actionSoldat(Fourmi f) {
		patrouille(f);
	}
}

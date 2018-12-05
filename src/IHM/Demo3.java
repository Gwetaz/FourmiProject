package IHM;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import vue.Vue;
import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;
import general.RectangleForme;

public class Demo3 {

	//Fourmi f = new Fourmi(1, 50, 50);
	
	public static void main(String[] args) {
		/*List<Fourmi> listeFourmis = new ArrayList<Fourmi>();
		int posx,posy;
		Random rx = new Random();
		Random ry = new Random();
		for(int i = 0; i<50; i++)
		{
			posx = rx.nextInt((Constantes.tailleFourmiliereX+Constantes.departFourmiliereX-Constantes.tailleFourmis)-(Constantes.departFourmiliereX+Constantes.tailleFourmis))+(Constantes.departFourmiliereX+Constantes.tailleFourmis);
			posy = ry.nextInt((Constantes.tailleFourmiliereY+Constantes.departFourmiliereY-Constantes.tailleFourmis)-(Constantes.departFourmiliereY+Constantes.tailleFourmis))+(Constantes.departFourmiliereY+Constantes.tailleFourmis);
			Fourmi f = new Fourmi(1,posx,posy);
			listeFourmis.add(f);
		}
		for(int i = 0; i<50; i++)
		{
			System.out.println(listeFourmis.get(i).toString());
		}*/
		Fourmiliere fourmiliere = new Fourmiliere();
		List<Fourmi> listeFourmis = new ArrayList<Fourmi>();
		int posx,posy;
		Random rx = new Random();
		Random ry = new Random();
		for(int i = 0; i<50; i++)
		{
			posx = rx.nextInt((Constantes.tailleFourmiliereX+Constantes.departFourmiliereX-Constantes.tailleFourmis)-(Constantes.departFourmiliereX+Constantes.tailleFourmis))+(Constantes.departFourmiliereX+Constantes.tailleFourmis);
			posy = ry.nextInt((Constantes.tailleFourmiliereY+Constantes.departFourmiliereY-Constantes.tailleFourmis)-(Constantes.departFourmiliereY+Constantes.tailleFourmis))+(Constantes.departFourmiliereY+Constantes.tailleFourmis);
			Fourmi f = new Fourmi(1,posx,posy);
			//Fourmiliere.ajouterFourmis(f);
			listeFourmis.add(f);
		}
		fourmiliere.setListeFourmis(listeFourmis);
		Monde3 monMonde = new Monde3("monMonde",fourmiliere);
		monMonde.setBackground(Constantes.couleurSol);
		monMonde.setPreferredSize(new Dimension(Constantes.tailleJframeX, Constantes.tailleJframeY));
		monMonde.open();
		Vue maVue = new Vue(listeFourmis);
		RectangleForme rectFourmiliere = maVue.fourmiliere(fourmiliere);
		//maVue.
		monMonde.add(rectFourmiliere);
	}
}

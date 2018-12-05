package IHM;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import etat.impl.EtatFourmi;
import vue.Vue;
import general.Cercle;
import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;
import general.IMovableDrawable;
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
		
		//Vue maVue = new Vue(listeFourmis);
		RectangleForme rectFourmiliere = Vue.fourmiliere(fourmiliere);
		List<Cercle> listeCercle = Vue.listeFourmis(listeFourmis);
		//maVue.
		Monde3 monMonde = new Monde3("monMonde",fourmiliere, listeCercle);
		monMonde.setBackground(Constantes.couleurSol);
		monMonde.setPreferredSize(new Dimension(Constantes.tailleJframeX, Constantes.tailleJframeY));
		monMonde.open();
		monMonde.add(rectFourmiliere);
		//listeCercle = Vue.listeFourmis(listeFourmis);
		while (true) {
			List<IMovableDrawable> drawables = monMonde.contents();
			//listeCercle.clear();
			
			//Fourmiliere.
			//evolutionFourmi
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i = 0; i<50; i++)
			{
				//System.out.println("Coucou");
				listeFourmis.get(i).action();
				System.out.println(listeFourmis.get(i).toString());
			}
			listeCercle = Vue.listeFourmis(listeFourmis);
			monMonde.setListeCercle(listeCercle);
			monMonde.repaint();
		}
	}
}

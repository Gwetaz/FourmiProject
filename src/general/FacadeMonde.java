package general;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import IHM.Monde;
import IHM.Monde3;
import role.impl.Reine;
import vue.Vue;

public class FacadeMonde {


	
	/*public static Monde3 genererMonde() 
	{
		Reine reine = new Reine();
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
			listeFourmis.add(f);
		}
		fourmiliere.setListeFourmis(listeFourmis);
		Nid nid = new Nid();
		RectangleForme rectFourmiliere = Vue.fourmiliere(fourmiliere);
		RectangleForme rectNid = Vue.nid(nid);
		List<Cercle> listeCercle = Vue.listeFourmis(listeFourmis);
		Monde3 monMonde = new Monde3("monMonde",fourmiliere, listeCercle);
		monMonde.setBackground(Constantes.couleurSol);
		monMonde.setPreferredSize(new Dimension(Constantes.tailleJframeX, Constantes.tailleJframeY));
		return monMonde;
	}*/
	
	public static Monde3 genererMonde(Fourmiliere fourmiliere, Nid nid, List<Cercle> listeCercle) 
	{
		Monde3 monMonde = new Monde3("Mon Monde",fourmiliere,listeCercle);
		monMonde.setBackground(Constantes.couleurSol);
		monMonde.setPreferredSize(new Dimension(Constantes.tailleJframeX, Constantes.tailleJframeY));
		return monMonde;
	}
	
	public static RectangleForme genererFourmilliere(Fourmiliere fourmiliere)
	{
		return Vue.fourmiliere(fourmiliere);
	}
	
	public static RectangleForme genererNid(Nid nid)
	{
		return Vue.nid(nid);
	}
	
	public static List<Cercle> genererListCercle(Fourmiliere fourmiliere)
	{
		return Vue.listeFourmis(Fourmiliere.listeFourmis);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

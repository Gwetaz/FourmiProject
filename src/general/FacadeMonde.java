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
	
	public static Monde3 genererMonde(Fourmiliere fourmiliere, Nid nid, List<Cercle> listeCercle, List<Cercle> listeProie) 
	{
		Monde3 monMonde = new Monde3("Mon Monde",fourmiliere,listeCercle, listeProie);
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
		return Vue.listeFourmis(fourmiliere.listeFourmis);
	}
	
	public static List<Cercle> genererProie(Fourmiliere fourmiliere, Matrice m)
	{
		return Vue.listeproie(fourmiliere,m);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

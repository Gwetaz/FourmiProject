package IHM;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import role.impl.Reine;
import role.impl.RoleFourmi;
import etat.impl.Adulte;
import etat.impl.EtatFourmi;
import vue.Vue;
import general.Cercle;
import general.Constantes;
import general.FacadeMonde;
import general.Fourmi;
import general.Fourmiliere;
import general.IMovableDrawable;
import general.Nid;
import general.RectangleForme;

public class Demo4 {

	public static void main(String[] args) {
		Fourmiliere fourmiliere = new Fourmiliere();
		RectangleForme fourmiliereForme = FacadeMonde.genererFourmilliere(fourmiliere);
		Nid nid = new Nid();
		RectangleForme nidForme = FacadeMonde.genererNid(nid);
		List<Cercle> listeCercle = FacadeMonde.genererListCercle(fourmiliere);
		List<Cercle> listeProie = new ArrayList<Cercle> ();
		Monde3 monMonde = FacadeMonde.genererMonde(fourmiliere, nid, listeCercle, listeProie);
		monMonde.add(fourmiliereForme);
		monMonde.add(nidForme);
		monMonde.open();
		
		
		Fourmi reine = new Fourmi(1,(Constantes.tailleJframeX-Constantes.tailleFourmis)/2,(Constantes.tailleJframeY-Constantes.tailleFourmis)/2, fourmiliere);
		//reine.setEtat(etat);
		reine.setFourmiFemelle(true);
		Random r = new Random();
		reine.setNbJourDeMort(r.nextInt(Constantes.nombreJourMaxReine-Constantes.nombreJourMiniReine) + Constantes.nombreJourMiniReine);
		reine.setEtat(new Adulte(new Reine()));
		reine.setRoleAdulte(RoleFourmi.Reine);
		
		fourmiliere.ajouterUneReine(reine);
		//int tour = 0;
		int nbFourmis;
		while (true) {
			//System.out.println("Tour : "+tour);
			List<IMovableDrawable> drawables = monMonde.contents();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("fourmiliere size "+fourmiliere.getListeFourmis().size());
			
			nbFourmis = fourmiliere.getListeFourmis().size();
			for(int i = 0; i<nbFourmis; i++)
			{
				//System.out.println("i : "+i);
				fourmiliere.getListeFourmis().get(i).action();
				//System.out.println(fourmiliere.getListeFourmis().get(i).toString());
			}
			
			listeCercle = FacadeMonde.genererListCercle(fourmiliere);
			monMonde.setListeCercle(listeCercle);

			//System.out.println("BACKSLASH AINE");
			monMonde.repaint();
			//tour++;
		}
	}
}

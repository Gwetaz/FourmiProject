package IHM;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import role.impl.Reine;
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
		Monde3 monMonde = FacadeMonde.genererMonde(fourmiliere, nid, listeCercle);
		monMonde.add(fourmiliereForme);
		monMonde.add(nidForme);
		monMonde.open();
		
		
		Fourmi reine = new Fourmi(1,(Constantes.tailleJframeX-Constantes.tailleFourmis)/2,(Constantes.tailleJframeY-Constantes.tailleFourmis)/2);
		//reine.setEtat(etat);
		reine.setFourmiFemelle(true);
		reine.setEtat(new Adulte(new Reine()));
		fourmiliere.ajouterUneReine(reine);
		while (true) {
			List<IMovableDrawable> drawables = monMonde.contents();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*for(int i = 0; i<50; i++)
			{
				listeFourmis.get(i).action();
			}*/
			listeCercle = FacadeMonde.genererListCercle(fourmiliere);
			monMonde.setListeCercle(listeCercle);
			monMonde.repaint();
		}
	}
}

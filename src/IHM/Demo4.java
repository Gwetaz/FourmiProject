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
import general.Stack;

public class Demo4 {

	public static void main(String[] args) {
		Fourmiliere fourmiliere = new Fourmiliere();
		RectangleForme fourmiliereForme = FacadeMonde.genererFourmilliere(fourmiliere);
		Nid nid = new Nid();
		Stack s1,s2,s3,s4;
		List<Stack> listeStack = new ArrayList<Stack>();
		RectangleForme nidForme = FacadeMonde.genererNid(nid);
		List<Cercle> listeCercle = FacadeMonde.genererListCercle(fourmiliere);
		List<Cercle> listeProies = new ArrayList<Cercle> ();
		List<RectangleForme> listeStackForme = Vue.stack();
		Monde3 monMonde = FacadeMonde.genererMonde(fourmiliere, nid, listeCercle, listeProies);
		monMonde.add(fourmiliereForme);
		s1 = new Stack((int)monMonde.getMatrice().DePosACase(Constantes.departStack1X, Constantes.departStack1Y).getX(),(int)monMonde.getMatrice().DePosACase(Constantes.departStack1X, Constantes.departStack1Y).getY());
		s2 = new Stack((int)monMonde.getMatrice().DePosACase(Constantes.departStack2X, Constantes.departStack2Y).getX(),(int)monMonde.getMatrice().DePosACase(Constantes.departStack2X, Constantes.departStack2Y).getY());
		s3 = new Stack((int)monMonde.getMatrice().DePosACase(Constantes.departStack3X, Constantes.departStack3Y).getX(),(int)monMonde.getMatrice().DePosACase(Constantes.departStack3X, Constantes.departStack3Y).getY());
		s4 = new Stack((int)monMonde.getMatrice().DePosACase(Constantes.departStack4X, Constantes.departStack4Y).getX(),(int)monMonde.getMatrice().DePosACase(Constantes.departStack4X, Constantes.departStack4Y).getY());
		listeStack.add(s1);
		listeStack.add(s2);
		listeStack.add(s3);
		listeStack.add(s4);
		fourmiliere.setListeStack(listeStack);
		monMonde.add(listeStackForme.get(0));
		monMonde.add(listeStackForme.get(1));
		monMonde.add(listeStackForme.get(2));
		monMonde.add(listeStackForme.get(3));
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
		
		
		
		listeProies = FacadeMonde.genererProie(fourmiliere, monMonde.getMatrice());
		monMonde.setListeproie(listeProies);
		//int tour = 0;
		int nbFourmis;
		while (true) {
			//System.out.println("Tour : "+tour);
			List<IMovableDrawable> drawables = monMonde.contents();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("fourmiliere size "+fourmiliere.getListeFourmis().size());
			
			nbFourmis = fourmiliere.getListeFourmis().size();
			for(int i = 0; i<nbFourmis; i++)
			{
				//System.out.println("i : "+i);
				fourmiliere.getListeFourmis().get(i).action(monMonde);
				//System.out.println(fourmiliere.getListeFourmis().get(i).toString());
			}
			int nbProies = fourmiliere.getListeProies().size();
			for(int i = 0; i<nbProies; i++)
			{
				//System.out.println("i : "+i);
				//fourmiliere.getListeProies().;
				//System.out.println(fourmiliere.getListeFourmis().get(i).toString());
			}
			
			listeCercle = FacadeMonde.genererListCercle(fourmiliere);
			monMonde.setListeCercle(listeCercle);

			
			/*listeProies = FacadeMonde.genererProie(fourmiliere);
			monMonde.setListeproie(listeProies);*/
			
			System.out.println("");
			monMonde.repaint();
			//tour++;
		}
	}
}

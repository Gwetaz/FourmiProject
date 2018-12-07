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
import general.Nid;
import general.Proie;
import general.RectangleForme;

public class Demo3 {

	public static void main(String[] args) {
	/*	Fourmiliere fourmiliere = new Fourmiliere();
		List<Fourmi> listeFourmis = new ArrayList<Fourmi>();
		int posx,posy;
		Random rx = new Random();
		Random ry = new Random();
		for(int i = 0; i<50; i++)
		{
			posx = rx.nextInt((Constantes.tailleFourmiliereX+Constantes.departFourmiliereX-Constantes.tailleFourmis)-(Constantes.departFourmiliereX+Constantes.tailleFourmis))+(Constantes.departFourmiliereX+Constantes.tailleFourmis);
			posy = ry.nextInt((Constantes.tailleFourmiliereY+Constantes.departFourmiliereY-Constantes.tailleFourmis)-(Constantes.departFourmiliereY+Constantes.tailleFourmis))+(Constantes.departFourmiliereY+Constantes.tailleFourmis);
			Fourmi f = new Fourmi(1,posx,posy,fourmiliere);
			listeFourmis.add(f);
		}
		
		
		List<Proie> listeProie = new ArrayList<Proie>();
		for(int i = 0; i<8; i++)
		{
			posx = rx.nextInt(Constantes.tailleJframeX ) ;
			while(posx >= Constantes.departFourmiliereX && posx <= (Constantes.departFourmiliereX + Constantes.tailleFourmiliereX))
					{
						posx = rx.nextInt(Constantes.tailleJframeX );
					}
			
			posy = ry.nextInt(Constantes.tailleJframeY ) ;
			while(posy >= Constantes.departFourmiliereY && posy <= (Constantes.departFourmiliereY + Constantes.tailleFourmiliereY))
					{
						posy = ry.nextInt(Constantes.tailleJframeX );
					}
			
			Proie p = new Proie(2, posx, posy );
			listeProie.add(p);		
		}
		
		fourmiliere.setListeFourmis(listeFourmis);
		Nid nid = new Nid();
		RectangleForme rectFourmiliere = Vue.fourmiliere(fourmiliere);
		RectangleForme rectNid = Vue.nid(nid);
		List<Cercle> listProie = Vue.listeproie(listeProie);
		List<Cercle> listeCercle = Vue.listeFourmis(listeFourmis);
		Monde3 monMonde = new Monde3("monMonde",fourmiliere, listeCercle, listProie);
		monMonde.setBackground(Constantes.couleurSol);
		monMonde.setPreferredSize(new Dimension(Constantes.tailleJframeX, Constantes.tailleJframeY));
		monMonde.open();
		monMonde.add(rectFourmiliere);
		monMonde.add(rectNid);
		while (true) {
			List<IMovableDrawable> drawables = monMonde.contents();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i = 0; i<50; i++)
			{
				listeFourmis.get(i).action();
			}
			for(int i = 0; i<8; i++)
			{
				listeProie.get(i).actionProie();
				System.out.println(listeProie.get(i).toString() )  ;
			}
			System.out.println("");
			listeCercle = Vue.listeFourmis(listeFourmis);
			listProie = Vue.listeproie(listeProie);
			monMonde.setListeCercle(listeCercle);
			monMonde.setListeproie(listProie);
			monMonde.repaint();
		}*/
	}
}
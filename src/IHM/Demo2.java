package IHM;

import etat.impl.EtatFourmi;
import general.Cercle;
import general.Constantes;
import general.Fourmi;
import general.RectangleForme;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Demo2 {

	public static final int nombreOeufs = 10;
	
	
	public static void main(String[] args) {
		Random x = new Random();
		Monde2 jc = new Monde2("Un essai de Morphs",nombreOeufs);
		jc.setBackground(Constantes.couleurSol);
		jc.setPreferredSize(new Dimension(Constantes.tailleJframeX, Constantes.tailleJframeY));
		Dimension dim = new Dimension(10, 10);
		
		//Dimension dim2 = new Dimension(Constantes.tailleFourmiliereX, Constantes.tailleFourmiliereY);
		//System.out.println("depart x : "+Constantes.departFourmiliereX+" depart y : "+Constantes.departFourmiliereY+" taille x : "+Constantes.tailleFourmiliereX+" taille y : "+Constantes.tailleFourmiliereY);
		jc.add(new RectangleForme(Constantes.couleurFourmiliere,new Point(Constantes.departFourmiliereX, Constantes.departFourmiliereY),new Dimension(Constantes.tailleFourmiliereX, Constantes.tailleFourmiliereY)));
		/*for (int i = 0; i < 20000; i++) {
			dim = new Dimension(x.nextInt(20), x.nextInt(20));
			jc.add(new Oval(new Color((int) (Math.random() * 0x1000000)), new Point(0, 0), dim));
		}*/
		
		Random rx = new Random();
		int posx;
		Random ry = new Random();
		int posy;
		for (int i = 0; i < nombreOeufs; i++)
		{
			posx = rx.nextInt((Constantes.tailleFourmiliereX+Constantes.departFourmiliereX-Constantes.tailleFourmis)-(Constantes.departFourmiliereX+Constantes.tailleFourmis))+(Constantes.departFourmiliereX+Constantes.tailleFourmis);
			posy = ry.nextInt((Constantes.tailleFourmiliereY+Constantes.departFourmiliereY-Constantes.tailleFourmis)-(Constantes.departFourmiliereY+Constantes.tailleFourmis))+(Constantes.departFourmiliereY+Constantes.tailleFourmis);
			Fourmi f = new Fourmi(true, 1, new Cercle(Constantes.couleurOeuf, new Point(posx, posy), dim));
			
			jc.listeFourmis.add(f);
		}
		
		
		jc.open();
		while (true) {
			//List<IMovableDrawable> drawables = jc.contents();
			//for (Iterator<IMovableDrawable> iter = drawables.iterator(); iter.hasNext();) {
			//	iter.next().setPosition(new Point(x.nextInt(800), x.nextInt(600)));
			//}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < jc.listeFourmis.size(); i++)
			{
				/*Etat etatTest = new Oeuf(1, 2, 3);
				System.out.println(etatTest.toString());
				etatTest = ((Oeuf) etatTest).transformation();*/
				if(jc.listeFourmis.get(i).getEtat().getEtatFourmi() == EtatFourmi.Adulte)
				{
					jc.listeFourmis.get(i).deplacement();
				}else{
					jc.listeFourmis.get(i).changerEtat();
				}
				
				
				//listeFourmi.get(i).getEtat();
			}
			jc.repaint();
		}
	}
}

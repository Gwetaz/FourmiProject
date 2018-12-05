package vue;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import general.Cercle;
import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;
import general.RectangleForme;

public class Vue {
	//private List<Fourmi> listeFourmis;

	/*public Vue(List<Fourmi> listeFourmis) {
		this.listeFourmis = listeFourmis;
	}*/
	
	public static List<Cercle> listeFourmis(List<Fourmi> listeFourmis){
		List<Cercle> listeCercles = new ArrayList<Cercle>();
		for(int i=0;i<listeFourmis.size();i++) {
			listeCercles.add(new Cercle(listeFourmis.get(i).getEtat().getColor(), new Point(listeFourmis.get(i).getPosX(), listeFourmis.get(i).getPosY()), new Dimension(Constantes.tailleFourmis,Constantes.tailleFourmis)));
			System.out.println("Fourmis couleur : "+listeFourmis.get(i).getEtat().getColor());
		}
		return listeCercles;
	}
	
	public static RectangleForme fourmiliere(Fourmiliere f) {
		RectangleForme r;
		r = new RectangleForme(Constantes.couleurFourmiliere, new Point(Constantes.departFourmiliereX, Constantes.departFourmiliereY),new Dimension(Constantes.tailleFourmiliereX, Constantes.tailleFourmiliereY));
		return r;
	}
	
	
}

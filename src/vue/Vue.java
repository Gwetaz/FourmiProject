package vue;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import etat.impl.Adulte;
import etat.impl.Etat;
import etat.impl.EtatFourmi;
import general.Cercle;
import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;
import general.RectangleForme;

public class Vue {
	private List<Fourmi> listeFourmis;

	public Vue(List<Fourmi> listeFourmis) {
		this.listeFourmis = listeFourmis;
	}
	
	public List<Cercle> listeFourmis(){
		Etat etat;
		Adulte a;
		List<Cercle> listeCercles = new ArrayList<Cercle>();
		for(int i=0;i<listeFourmis.size();i++) {
			etat = listeFourmis.get(i).getEtat();
			listeCercles.add(new Cercle(listeFourmis.get(i).getEtat().getCouleur(), new Point(listeFourmis.get(i).getPosX(), listeFourmis.get(i).getPosY()), new Dimension(Constantes.tailleFourmis,Constantes.tailleFourmis)));
		}
		return listeCercles;
	}
	
	public RectangleForme fourmiliere(Fourmiliere f) {
		RectangleForme r;
		r = new RectangleForme(Constantes.couleurFourmiliere, new Point(Constantes.departFourmiliereX, Constantes.departFourmiliereY),new Dimension(Constantes.tailleFourmiliereX, Constantes.tailleFourmiliereY));
		return r;
	}
	
	
}

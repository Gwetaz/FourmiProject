package vue;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import role.impl.RoleFourmi;
import general.Cercle;
import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;
import general.Nid;
import general.Proie;
import general.RectangleForme;

public class Vue {

	public static List<Cercle> listeFourmis(List<Fourmi> listeFourmis){
		List<Cercle> listeCercles = new ArrayList<Cercle>();
		List<Cercle> listeReine = new ArrayList<Cercle>();
		for(int i=0;i<listeFourmis.size();i++) {
			if (listeFourmis.get(i).getRoleAdulte() == RoleFourmi.Reine)
			{
				listeReine.add(new Cercle(listeFourmis.get(i).getEtat().getColor(), new Point(listeFourmis.get(i).getPosX(), listeFourmis.get(i).getPosY()), new Dimension(Constantes.tailleReine,Constantes.tailleReine)));

			}else{
				listeCercles.add(new Cercle(listeFourmis.get(i).getEtat().getColor(), new Point(listeFourmis.get(i).getPosX(), listeFourmis.get(i).getPosY()), new Dimension(Constantes.tailleFourmis,Constantes.tailleFourmis)));

			}
		}
		for(int i=0;i<listeReine.size();i++) {
			listeCercles.add(new Cercle(listeFourmis.get(i).getEtat().getColor(), new Point(listeFourmis.get(i).getPosX(), listeFourmis.get(i).getPosY()), new Dimension(Constantes.tailleReine,Constantes.tailleReine)));
		}
		//listeCercles.add(new Cercle(listeFourmis.get(0).getEtat().getColor(), new Point(listeFourmis.get(0).getPosX(), listeFourmis.get(0).getPosY()), new Dimension(Constantes.tailleReine,Constantes.tailleReine)));
		return listeCercles;
	}
	
	public static List<Cercle> listeproie(Fourmiliere fourmiliere){
		List<Cercle> listeCercles = new ArrayList<Cercle>();
		/*for(int i=0;i<listeproie.size();i++) {
			listeCercles.add(new Cercle(listeproie.get(i).getColor(), new Point(listeproie.get(i).getPosX(), listeproie.get(i).getPosY()), new Dimension(Constantes.tailleProie,Constantes.tailleProie)));
		}*/
		return listeCercles;
	}
	
	public static RectangleForme fourmiliere(Fourmiliere f) {
		RectangleForme r;
		r = new RectangleForme(Constantes.couleurFourmiliere, new Point(Constantes.departFourmiliereX, Constantes.departFourmiliereY),new Dimension(Constantes.tailleFourmiliereX, Constantes.tailleFourmiliereY));
		return r;
	}
	
	public static RectangleForme nid(Nid n) {
		RectangleForme r;
		r = new RectangleForme(Constantes.couleurNid, new Point(Constantes.departNidX, Constantes.departNidY),new Dimension(Constantes.tailleNidX, Constantes.tailleNidY));
		return r;
	}
	
	
}

package vue;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import role.impl.RoleFourmi;
import general.Cercle;
import general.Constantes;
import general.Fourmi;
import general.Fourmiliere;
import general.Matrice;
import general.Nid;
import general.Proie;
import general.RectangleForme;

public class Vue {

	//Créer les cercles représentant les fourmis
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
		return listeCercles;
	}
	
	//Créer les cercles représentant les proies
	public static List<Cercle> listeproie(Fourmiliere fourmiliere, Matrice m){
		List<Cercle> listeProie = new ArrayList<Cercle>();
		for(int i=0; i<Constantes.nombreProies; i++) {
			int posx,posy;
			Random rx = new Random();
			Random ry = new Random();
			posx = rx.nextInt(Constantes.tailleJframeX ) ;
			while((posx >= Constantes.departFourmiliereX && posx <= (Constantes.departFourmiliereX + Constantes.tailleFourmiliereX)) || posx >= (Constantes.tailleJframeX - Constantes.tailleProie))
			{
				posx = rx.nextInt(Constantes.tailleJframeX );
			}
			
			posy = ry.nextInt(Constantes.tailleJframeY ) ;
			while((posy >= Constantes.departFourmiliereY && posy <= (Constantes.departFourmiliereY + Constantes.tailleFourmiliereY)) || posy >= (Constantes.tailleJframeY - Constantes.tailleProie))
			{
				posy = ry.nextInt(Constantes.tailleJframeX );
			}
			m.MarquerCaseProie(posx, posy);
			Proie p = new Proie(2, posx, posy );
			fourmiliere.getListeProies().add(p);
			listeProie.add(new Cercle(Constantes.couleurProie, new Point(posx, posy), new Dimension(Constantes.tailleProie,Constantes.tailleProie)));
		}
		
		return listeProie;
	}
	
	//Créer le rectangle représentant la fourmilière
	public static RectangleForme fourmiliere(Fourmiliere f) {
		RectangleForme r;
		r = new RectangleForme(Constantes.couleurFourmiliere, new Point(Constantes.departFourmiliereX, Constantes.departFourmiliereY),new Dimension(Constantes.tailleFourmiliereX, Constantes.tailleFourmiliereY));
		return r;
	}
	
	//Créer le rectangle représentant le nid
	public static RectangleForme nid(Nid n) {
		RectangleForme r;
		r = new RectangleForme(Constantes.couleurNid, new Point(Constantes.departNidX, Constantes.departNidY),new Dimension(Constantes.tailleNidX, Constantes.tailleNidY));
		return r;
	}
	
	//Créer les rectangles représentant les stack de nourriture (endroit où les fourmis déposent la nourriture)
	public static List<RectangleForme> stack() {
		List<RectangleForme> listeStack = new ArrayList<RectangleForme>();
		RectangleForme s1,s2,s3,s4;
		s1 = new RectangleForme(Constantes.couleurStack, new Point(Constantes.departStack1X,Constantes.departStack1Y), new Dimension(Constantes.tailleStack, Constantes.tailleStack));
		s2 = new RectangleForme(Constantes.couleurStack, new Point(Constantes.departStack2X,Constantes.departStack2Y), new Dimension(Constantes.tailleStack, Constantes.tailleStack));
		s3 = new RectangleForme(Constantes.couleurStack, new Point(Constantes.departStack3X,Constantes.departStack3Y), new Dimension(Constantes.tailleStack, Constantes.tailleStack));
		s4 = new RectangleForme(Constantes.couleurStack, new Point(Constantes.departStack4X,Constantes.departStack4Y), new Dimension(Constantes.tailleStack, Constantes.tailleStack));
		listeStack.add(s1);
		listeStack.add(s2);
		listeStack.add(s3);
		listeStack.add(s4);
		return listeStack;
	}
}

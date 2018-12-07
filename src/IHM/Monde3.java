package IHM;

import general.Cercle;
import general.Fourmi;
import general.Fourmiliere;
import general.IMovableDrawable;
import general.Matrice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Monde3 extends JPanel{

	private static final long serialVersionUID = 1L;
	private List<IMovableDrawable> drawables = new LinkedList<IMovableDrawable>();
	private Fourmiliere fourmiliere;
	private List<Cercle> listeCercle;
	private List<Cercle> listeproie;
	private Matrice matrice;
	String name = "";
	private int nbJour;
	private HashMap<List<Point>,Point> mapProieChemin;
	
	public Monde3(String name, Fourmiliere fourmiliere, List<Cercle> listeCercle, List<Cercle> listeproie) {
		this.matrice = new Matrice(fourmiliere);
		this.name = name;
		this.listeCercle = listeCercle;
		this.fourmiliere = fourmiliere;
		this.listeproie = listeproie; 
		this.nbJour = 0;
		this.mapProieChemin = new HashMap<List<Point>,Point>();
	}
	public List<IMovableDrawable> contents() {
		return drawables;
	}
	
	public void afficherMatrice()
	{
		for (int i=0; i<matrice.getMatrice().length; i++)
		{
			for (int j=0; j<matrice.getMatrice()[0].length; j++)
			{
				System.out.println(matrice.getMatrice()[i][j]+",");
			}
		}
	}
	
	public void open() {
		JFrame frame = new JFrame(name);
		WindowAdapter wa = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		frame.addWindowListener(wa);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}
	
     public void add(IMovableDrawable d) {
        drawables.add(d);
     }

     public void remove(IMovableDrawable d) {
        drawables.remove(d);
     }
	  public List<Cercle> getListeCercle() {
		return listeCercle;
	}
	public void setListeCercle(List<Cercle> listeCercle) {
		this.listeCercle = listeCercle;
	}
	
	
	public List<Cercle> getListeproie() {
		return listeproie;
	}
	public void setListeproie(List<Cercle> listeproie) {
		this.listeproie = listeproie;
	}
	
	public void paint(Graphics g) {
		
	      super.paint(g);
	      this.nbJour++;
	      fourmiliere.purge();
	      //g.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
	      g.drawString("Jour : "+this.nbJour, 50, 50);
	      g.drawString("Nombre d'ouvrières : "+this.fourmiliere.getNbOuvriere(), 50, 75);
	      g.drawString("Nombre de soldats : "+this.fourmiliere.getNbSoldat(), 50, 100);
	      g.drawString("Nombre de sexuées : "+this.fourmiliere.getNbSexuee(), 50, 125);
	      for (Iterator<IMovableDrawable> iter = drawables.iterator(); iter.hasNext();) {
	          iter.next().draw(g);
	      }
	      for (Iterator<Cercle> iter = listeCercle.iterator(); iter.hasNext();) {
	    	  iter.next().draw(g);;
	      }
	      for (Iterator<Cercle> iter2 = listeproie.iterator(); iter2.hasNext();) {
	    	  iter2.next().draw(g);;
	      }
	      
	  }

    public void clear() {
        drawables.clear();
     }

	
    public  Matrice getMatrice()
	{
		return this.matrice;
	}
	public boolean cheminExiste(Point caseMatrice) {
		//System.out.println("Chemin existe Monde3");
		/*for (int i=0; i< mapProieChemin.size(); i++)
		{
			//for(int j=0; mapProieChemin.get(i); )
		}*/
		
		

		Set<List<Point>> cles = mapProieChemin.keySet();
		Iterator<List<Point>> it = cles.iterator();
		while (it.hasNext()){
			
		   List<Point> cle = it.next(); // tu peux typer plus finement ici
		   for (int i =0; i<cle.size(); i++)
		   {
			   if(caseMatrice.getX() == cle.get(i).getX() && caseMatrice.getY() == cle.get(i).getY())
			   {
				   return true;
			   }
		   }
		   Object valeur = mapProieChemin.get(cle); // tu peux typer plus finement ici
		   //System.out.println("OUI "+cle.toString()+" "+valeur.toString());
		}
		
		return false;
	}
	public void creerChemin(Point caseMatrice) {
		System.out.println("creer chemin Monde3");
		// TODO Auto-generated method stub
		List<Point> listePoint = new ArrayList<Point>();
		listePoint.add(caseMatrice);
		mapProieChemin.put(listePoint, caseMatrice);
	}

	
}

package IHM;

import general.Cercle;
import general.Fourmi;
import general.Fourmiliere;
import general.IMovableDrawable;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Monde3 extends JPanel{

	private static final long serialVersionUID = 1L;
	private List<IMovableDrawable> drawables = new LinkedList<IMovableDrawable>();
	private Fourmiliere fourmiliere;
	private List<Cercle> listeCercle;
	private List<Cercle> listeproie;
	String name = "";
	
	public Monde3(String name, Fourmiliere fourmiliere, List<Cercle> listeCercle, List<Cercle> listeproie) {
		this.name = name;
		this.listeCercle = listeCercle;
		this.fourmiliere = fourmiliere;
		this.listeproie = listeproie; 
	}
	public List<IMovableDrawable> contents() {
		return drawables;
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

	
}

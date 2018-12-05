package general;

import java.awt.Color;
import java.util.*;
import role.impl.*;

public class Fourmiliere {
	
	protected List<Fourmi>  listeFourmis;
	protected Reine reine;
	protected RectangleForme rectangle;
	protected Nid nid;
	
	public Fourmiliere()
	{
		listeFourmis = new ArrayList<Fourmi>();
	}

	public List<Fourmi> getListeFourmis() {
		return listeFourmis;
	}

	public void setListeFourmis(List<Fourmi> listeFourmis) {
		this.listeFourmis = listeFourmis;
	}

	public Reine getReine() {
		return reine;
	}
	
	public void ajouterUneReine(Fourmi f)
	{
		listeFourmis.add(f);
	}
	
	public void ajouterFourmis(Fourmi f)
	{
		listeFourmis.add(f);
	}
	
	public void setReine(Reine reine) {
		this.reine = reine;
	}
	
	
	
	

}


package general;

import java.awt.Color;
import java.util.*;
import role.impl.*;

public class Fourmiliere {
	
	protected List<Fourmi>  listeFourmis;
	protected Reine reine;
	protected Color color;
	
	
	public Fourmiliere(Reine reine,Color color)
	{
		listeFourmis = new ArrayList<Fourmi>();
		color = new Color(61,40,4);
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
	
	
	public void setReine() {
		this.reine = reine;
	}
	
	
	
	

}


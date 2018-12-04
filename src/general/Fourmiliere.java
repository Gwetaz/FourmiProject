package general;

import java.util.*;
import role.impl.*;

public class Fourmiliere {
	
	protected List<Fourmi>  listeFourmis;
	protected Reine reine;
	
	
	public Fourmiliere(Reine reine)
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
	
	
	public void setReine() {
		this.reine = reine;
	}
	
	
	
	

}


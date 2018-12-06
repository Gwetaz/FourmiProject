package general;

import java.awt.Color;
import java.util.*;

import etat.impl.EtatFourmi;
import role.impl.*;

public class Fourmiliere {
	
	protected List<Fourmi>  listeFourmis;
	protected Reine reine;
	protected RectangleForme rectangle;
	protected Nid nid;
	private int nbOuvriere;
	private int nbSoldat;
	private int nbSexuee;

	
	
	public Fourmiliere()
	{
		this.nbOuvriere = 0;
		this.nbSoldat = 0;
		this.nbSexuee = 0;
		listeFourmis = new ArrayList<Fourmi>();
	}
	
	public void purge()
	{
		this.nbOuvriere = 0;
		this.nbSoldat = 0;
		this.nbSexuee = 0;
		for(int i=0; i<this.listeFourmis.size(); i++)
		{
			if (!this.listeFourmis.get(i).isVivante())
			{
				this.listeFourmis.remove(i);
			}
			if (this.listeFourmis.get(i).getEtat().getEtatFourmi() == EtatFourmi.Adulte)
			{
				switch(this.listeFourmis.get(i).getRoleAdulte())
				{
				case Ouvriere:
					this.nbOuvriere++;
					break;
				case Soldat:
					this.nbSoldat++;
					break;
				case Sexuee:
					this.nbSexuee++;
					break;
				default:
					
					break;
				}
			}
		}
	}

	public int getNbOuvriere() {
		return nbOuvriere;
	}

	public int getNbSoldat() {
		return nbSoldat;
	}

	public int getNbSexuee() {
		return nbSexuee;
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


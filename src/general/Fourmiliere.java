package general;

import java.util.*;

import etat.impl.EtatFourmi;
import role.impl.*;

public class Fourmiliere {
	
	protected List<Fourmi>  listeFourmis;
	private List<Proie> listeProies;//a voir
	private List<Stack> listeStack;
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
		listeProies = new ArrayList<Proie>();
		listeStack = new ArrayList<Stack>();
	}
	
	public List<Proie> getListeProies() {
		return listeProies;
	}

	public void setListeProies(List<Proie> listeProies) {
		this.listeProies = listeProies;
	}
	

	public List<Stack> getListeStack() {
		return listeStack;
	}

	public void setListeStack(List<Stack> listeStack) {
		this.listeStack = listeStack;
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


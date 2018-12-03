package etat.impl;

public class Etat {
	protected EtatFourmi etat;
	
	public Etat() {
		this.etat = EtatFourmi.Oeuf;
	}
	
	
	public void changerEtape(EtatFourmi nouvelEtat)
	{
		this.etat = nouvelEtat;
	}
	public String toString()
	{
		if (etat == EtatFourmi.Oeuf)
		{
			return "Oeuf";
		}
		if (etat == EtatFourmi.Oeuf)
		{
			return "Oeuf";
		}
		if (etat == EtatFourmi.Oeuf)
		{
			return "Oeuf";
		}
		return "";
	}
}

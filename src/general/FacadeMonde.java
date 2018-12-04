package general;

import role.impl.Reine;

public class FacadeMonde {

	public final int pourcentOuvriere = 70;
	public final int pourcentSoldat = 30;
	public final int lol = 0;
	
	public void genererMonde(int nombreOeuf) 
	{
		Reine reine = new Reine();
		Fourmiliere fourmiliere = new Fourmiliere(reine); 
		int nombreOuvriere = (int) (nombreOeuf*pourcentOuvriere/100);
		int nombreSoldat = (int) (nombreOeuf*pourcentSoldat/100);
	}
}

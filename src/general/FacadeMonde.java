package general;

import IHM.Monde;
import role.impl.Reine;

public class FacadeMonde {


	
	public static Monde genererMonde(int nombreOeuf) 
	{
		Reine reine = new Reine();
		Fourmiliere fourmiliere = new Fourmiliere(reine); 
		int nombreOuvriere = (int) (nombreOeuf*Constantes.pourcentOuvriere/100);
		int nombreSoldat = (int) (nombreOeuf*Constantes.pourcentSoldat/100);
		Monde monde = new Monde(nombreOeuf); 
		return monde;
	}
}

package general;

public class FacadeMonde {

	public final int pourcentOuvriere = 70;
	public final int pourcentSoldat = 30;
	
	public void genererMonde(int nombreOeuf)
	{
		Fourmiliere fourmiliere = new Fourmiliere();
		int nombreOuvriere = (int) (nombreOeuf*pourcentOuvriere/100);
		int nombreSoldat = (int) (nombreOeuf*pourcentSoldat/100);
	}
}

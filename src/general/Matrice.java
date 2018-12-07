package general;

import java.awt.Point;

public class Matrice {
	
	
	protected boolean[][] Matrice;

	
	public Matrice() {
		
		Matrice = new boolean[Constantes.tailleJframeX/Constantes.tailleCase][Constantes.tailleJframeX/Constantes.tailleCase] ;
		// Donne le nombre de cases 
		
	}
	
	
	
	public void initialiser()
	{
		 int i,j;
		 
		 for(i=0;i < Matrice.length ; i++) // On parcours les lignes 
		 {
			 for(j =0; j < Matrice[i].length ; j++) // On parcours les colonnes
			 {
				 Matrice[i][j] = false;
			 }
		 }
		
	}
	
	
	public void PrioPlus(int posx , int posy )
	{
		Matrice[posx][posy] = true;
		
		
	}
	
	
	
	
	
	public void Reset(int posx , int posy )
	{
		Matrice[posx][posy] = false;
		
		
	}
	
	
	public Point DePosACase(int posx , int posy)
	{
		int i,j;
		
		i = Math.round(posx/Constantes.tailleCase);
		j = Math.round(posy/Constantes.tailleCase);
		Point p = new Point(i,j) ;
		return p;
		
	}
	
	
	public void MarquerCaseProie(int posx , int posy)
	{
		int i,j;
		
		i = Math.round(posx/Constantes.tailleCase);
		j = Math.round(posy/Constantes.tailleCase);
		Point p = new Point(i,j) ;
		//return p;
		
	}
	
	
	
	
	
	
	
	
	public boolean PheroOuPas(Fourmi f)
	{
		
		int i,j;
		Point p = this.DePosACase(f.getPosX(), f.getPosY());
		return this.Matrice[p.x][p.y];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

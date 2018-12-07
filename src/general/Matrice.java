package general;

import java.awt.Point;

public class Matrice {
	
	
	protected int[][] matrice;

	
	public Matrice() {
		
		matrice = new int[Constantes.tailleJframeX/Constantes.tailleCase][Constantes.tailleJframeX/Constantes.tailleCase] ;
		this.initialiser(); 
		// Donne le nombre de cases 
		
	}
	
	
	
	public void initialiser()
	{
		 int i,j;
		 
		 for(i=0;i < matrice.length ; i++) // On parcours les lignes 
		 {
			 for(j =0; j < matrice[i].length ; j++) // On parcours les colonnes
			 {
				 matrice[i][j] = 0;
			 }
		 }
		
	}
	
	
	public void PrioPlus(int posx , int posy )
	{
		matrice[posx][posy] = 1;
		
		
	}
	
	
	
	
	
	public void Reset(int posx , int posy )
	{
		matrice[posx][posy] = 0;
		
		
	}
	
	
	public Point DePosACase(int posx , int posy)
	{
		int i,j;
		
		i = Math.round(posx/Constantes.tailleCase);
		j = Math.round(posy/Constantes.tailleCase);
		Point p = new Point(j,i) ;
		return p;
		
	}
	
	
	public void MarquerCaseProie(int posx , int posy)
	{
		int i,j;
		
		i = Math.round(posx/Constantes.tailleCase);
		j = Math.round(posy/Constantes.tailleCase);
		matrice[i][j] = 1;
		Point p = new Point(j,i) ;
		//return p;
		
	}
	
	
	
	
	
	
	
	
	public int PheroOuPas(Fourmi f)
	{
		
		int i,j;
		Point p = this.DePosACase(f.getPosX(), f.getPosY());
		return this.matrice[p.x][p.y];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

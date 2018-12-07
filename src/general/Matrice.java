package general;

import java.awt.Point;

//Cette classe représente comme son nom l'indique une matrice de case de 50 par 50 en fonction de la longueur et de la largeur de la fenêtre
public class Matrice {
	
	
	protected int[][] matrice;
	Fourmiliere f ;
	

	
	public Matrice(Fourmiliere f) {
		
		matrice = new int[Constantes.tailleJframeX/Constantes.tailleCase][Constantes.tailleJframeX/Constantes.tailleCase] ;
		this.initialiser(); 
		// Donne le nombre de cases 
		this.f = f ;
		
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
		Point  p = this.DePosACase(posx, posy);
		this.matrice[p.x][p.y] = 1;
		
	
		
	
		
	}
	
	
	public Point RenvoyerCoordProie(int posx,int posy)
	{
		Point p = this.DePosACase(posx, posy);
		Point renvoi = new Point(0,0);
		
		for (int i = 0; i < f.getListeProies().size() ; i ++ )
		{
			Point pProie = this.DePosACase(f.getListeProies().get(i).posX, f.getListeProies().get(i).posY);
			if (pProie.equals(p)) 
				{
					renvoi.x = f.getListeProies().get(i).posX;
					renvoi.y =  f.getListeProies().get(i).posY;
					return renvoi;
				}
			
			
		}
		
		
		return null;
		
	}
	
	
	public int[][] getMatrice() {
		return matrice;
	}



	public int PheroOuPas(Fourmi f)
	{
		Point p = this.DePosACase(f.getPosX(), f.getPosY());
		if (p.x >0 && p.x <=(Constantes.tailleJframeX-10) && p.y >0 && p.y <= Constantes.tailleJframeY-10)
		{
			return this.matrice[p.x][p.y];
		}
		return 0;
	}
	
	
	public Point DeCaseaPos(int Casex , int Casey)
	{

		int i,j;
		
		i = Math.round(Casex*Constantes.tailleCase);
		j = Math.round(Casey*Constantes.tailleCase);
		Point p = new Point(j,i);
		return p;
		
		
		
	}
	

	
}

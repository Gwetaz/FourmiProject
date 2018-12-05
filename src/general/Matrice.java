package general;

public class Matrice {
	
	
	protected int[][] Matrice;
	
	public Matrice() {
		
		Matrice = new int[Constantes.tailleJframeX][Constantes.tailleJframeX/Constantes.tailleCase] ;
		
		
	}
	
	
	
	public void initialiser()
	{
		 int i,j;
		 
		 for(i=0;i < Matrice[i].length ; i++)
		 {
			 for(j =0; j < Matrice[i][j] ; j++)
			 {
				 Matrice[i][j] = 0;
			 }
		 }
		
	}
	
	
	public void PrioPlus(int posx , int posy )
	{
		Matrice[posx][posy] = Matrice[posx][posy]+1;
		
		
	}
	
	
	
	public void PrioManger(int posx , int posy )
	{
		Matrice[posx][posy] = Constantes.prioriteManger;
		

	}
	
	
	public void Reset(int posx , int posy )
	{
		Matrice[posx][posy] = 0;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package general;

import java.awt.Color;
import java.util.Random;

public class Proie {
	
	protected Color color ;
	protected double poids; 
	protected int posX;
	protected int posY;
	
	
	public Proie(double poid, int posx, int posy)
	{
		this.color = Constantes.couleurProie;
		this.posX = posx;
		this.posY = posy;
		
	}
	
	public double getPoids() {
		return poids;
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public void actionProie() {
		//this.bouger();
	}

	private void bouger() {
		Random r = new Random();
		int probabilite;
		probabilite = r.nextInt(4-1) + 1;
		System.out.println(probabilite);
		if(probabilite == 1)
		{
			this.posX= this.posX+10;
		//	if( this.posX < 200 )this.posX=+10;
		}		
		if(probabilite == 2)
		{
			this.posX= this.posX-10;
			//if( this.posX > 1400 )this.posX=-10;
		}		
		if(probabilite == 3)
		{
			this.posY= this.posY-10;
		
			//if( this.posY > 650 )this.posY=-10;
		}
		
		if(probabilite == 4)
		{
			this.posY= this.posY+10;
		}
	}

	@Override
	public String toString() {
		return "Proie [color=" + color + ", poids=" + poids + ", posX=" + posX + ", posY=" + posY + "]";
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

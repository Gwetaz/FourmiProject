package etat.impl;

import java.util.Random;

public class Adulte extends Etat{

	public Adulte(int tempsNaissance, int positionX, int positionY)
	{
		super(tempsNaissance, positionX, positionY);
		this.changerEtat(EtatFourmi.Adulte);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		// set role 
	}
	
	public int getPositionX()
	{
		return this.positionX;
	}
	
	public void setPositionX(int pos)
	{
		this.positionX = pos;
	}
	
	public int getPositionY()
	{
		return this.positionY;
	}
	
	public void setPositionY(int pos)
	{
		this.positionY = pos;
	}
	
}

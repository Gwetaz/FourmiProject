package etat.impl;

import java.util.Random;

import role.impl.Role;

public class Adulte extends Etat{

	private Role role;
	
	public Adulte(int tempsNaissance, int positionX, int positionY, Role role)
	{
		super(tempsNaissance, positionX, positionY);
		this.changerEtat(EtatFourmi.Adulte);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		this.role = role;
		
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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

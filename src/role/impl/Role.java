package role.impl;

import java.awt.Color;

public class Role {
	protected int age;
	protected Color couleur;
	protected int taille;
	protected RoleFourmi roleFourmi;
	
	public int getAge() {
		return this.age;
	}
	
	public Color getColor() {
		return this.couleur;
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public void setRole(RoleFourmi roleFourmi)
	{
		this.roleFourmi = roleFourmi;
	}
	
	public RoleFourmi getRoleFourmi()
	{
		return roleFourmi;
	}
}

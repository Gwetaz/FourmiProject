package role.impl;

import java.awt.Color;

public class Role {
	protected int age;
	protected int taille;
	protected RoleFourmi roleFourmi;
	
	public int getAge() {
		return this.age;
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

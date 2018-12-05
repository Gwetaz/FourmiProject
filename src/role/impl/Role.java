package role.impl;

import java.awt.Point;
import java.util.Random;

import general.Fourmi;

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
	
	public void deplacement(Fourmi f) {
		Random r = new Random();
		int x,y,probabilite;
		probabilite = r.nextInt(5-1) + 1;
		x = (int) f.getC().getPosition().getX();
		y = (int) f.getC().getPosition().getY();
		if(probabilite == 1) {
			x++;
		}
		if(probabilite == 2) {
			x--;
		}
		if(probabilite == 3) {
			y++;
		}
		if(probabilite == 4) {
			y--;
		}
		f.getC().setPosition(new Point(x,y));
	}
}

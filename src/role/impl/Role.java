package role.impl;

import java.util.Random;

import general.Action;
import general.Fourmi;

public class Role implements Action{
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
		x = f.getPosX();
		y = f.getPosY();
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
		f.setPosX(x);
		f.setPosY(y);
	}

	@Override
	public void action(Fourmi f) {
		switch(roleFourmi) {
			case Ouvriere:
				Ouvriere.actionOuvriere(f);	
				break;
				
			case Soldat:
				Soldat.actionSoldat(f);
				break;
				
			case Reine: 
				Reine.actionReine();
				break;
				
			default: break;
		}
	}
}

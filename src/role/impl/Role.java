package role.impl;


import general.Action;
import general.Fourmi;

public class Role implements Action{

	protected int taille;
	protected RoleFourmi roleFourmi;
	
	
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
				Reine.actionReine(f.getFourmiliere());
				break;
				
			default: break;
		}
	}
}

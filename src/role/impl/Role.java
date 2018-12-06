package role.impl;


import general.Action;
import general.Fourmi;

public class Role {

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
	

	/*@Override
	public void action(Fourmi f) {
		System.out.println("f : "+f.getRoleAdulte());
		switch(roleFourmi) {
			case Ouvriere:
				//Ouvriere.actionOuvriere(f);	
				break;
				
			case Soldat:
				//Soldat.actionSoldat(f);
				break;
				
			case Reine: 
				//Reine.actionReine(f.getFourmiliere());
				break;
			case Sexuee:
				System.out.println("ActionSexuee");
				Sexuee.actionSexuee(f);
				break;
			default: break;
		}
	}*/
}

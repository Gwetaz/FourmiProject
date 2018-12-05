package etat.impl;

import general.Constantes;
import general.Fourmi;

import java.util.Random;

import role.impl.Role;

public class Adulte extends Etat{

	private static Role role;
	
	public Adulte(Role role)
	{
		
		this.changerEtat(EtatFourmi.Adulte);
		Random r = new Random();
		this.poid = 1.5 + r.nextFloat() * (2-1.5);
		Adulte.role = role;
		switch (role.getRoleFourmi())
		{
		case Ouvriere:
			this.color = Constantes.couleurOuvriere;
			break;
		case Soldat:
			this.color = Constantes.couleurSoldat;
			break;
		case Reine:
			this.color = Constantes.couleurReine;
			break;
		default:
				break;
		}
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		Adulte.role = role;
	}

	
	public static void actionEtat(Fourmi f){
		// TODO Auto-generated method stub
		//System.out.println("Oeuf ne fait rien");
		role.action(f);
	}
	
}

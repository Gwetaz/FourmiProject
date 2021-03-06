package etat.impl;

import general.Constantes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import role.impl.Role;

public class Adulte extends Etat{

	private  Role role;
	
	public Adulte(Role role)
	{
		
		this.changerEtat(EtatFourmi.Adulte);
		Random r = new Random();
		this.poid = BigDecimal.valueOf(1.5 + r.nextFloat() * (2-1.5)).setScale(2, RoundingMode.HALF_UP).doubleValue();
		this.role = role;
		
		//Selon le rôle d'une fourmi, une couleur lui sera attribué
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
		case Sexuee:
			this.color = Constantes.couleurSexuee;
			break;
		default:
				break;
		}
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}

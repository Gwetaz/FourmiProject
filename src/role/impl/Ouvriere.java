package role.impl;

import java.awt.Color;
import java.util.Random;

public class Ouvriere extends Role{
	protected int nourriture;

	public Ouvriere (){
		Random r = new Random();
		this.age = r.nextInt(912-547) + 547;
		this.couleur = new Color(0, 33, 245);
		this.taille = 10;
	}
	
	public void chasse() {
		
	}
	
	public void donnerNourriture() {
		
	}
	
	public void nidConstruction() {
		
	}
}

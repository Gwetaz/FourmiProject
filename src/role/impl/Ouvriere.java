package role.impl;

import java.util.Random;

public class Ouvriere extends Role{
	int nourriture;

	public void genererAge() {
		Random r = new Random();
		this.age = r.nextInt(912-547) + 547;
	}
	
	public void chasse() {
		
	}
	
	public void donnerNourriture() {
		
	}
	
	public void nidConstruction() {
		
	}
}

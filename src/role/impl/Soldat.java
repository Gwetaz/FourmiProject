package role.impl;

import java.awt.Color;
import java.util.Random;

public class Soldat extends Role{
	
	public void genererAge() {
		Random r = new Random();
		this.age = r.nextInt(912-547) + 547;
		this.couleur = new Color(47, 222, 20);
		this.taille = 10;
	}
	
	public void patrouille() {
		
	}
}

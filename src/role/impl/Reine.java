package role.impl;

import java.awt.Color;
import java.util.Random;

public class Reine extends Role{
	
	public Reine() {
		Random r = new Random();
		this.age = r.nextInt(3650-1460) + 1460;
		this.couleur = new Color(232, 27, 27);
		this.taille = 20;
	}
	
	public void genererFourmi() {
		
	}
}

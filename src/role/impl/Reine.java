package role.impl;

import java.util.Random;

public class Reine extends Role{
	
	public void genererAge() {
		Random r = new Random();
		this.age = r.nextInt(3650-1460) + 1460;
	}
	
	public void genererFourmi() {
		
	}
}

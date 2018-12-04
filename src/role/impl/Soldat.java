package role.impl;

import java.util.Random;

public class Soldat extends Role{
	
	
	public void genererAge() {
		Random r = new Random();
		this.age = r.nextInt(912-547) + 547;
	}
	
	public void patrouille() {
		
	}
}

package etat.impl;

public class Oeuf extends Etat implements Transformation{

	/*public Oeuf() {
		this.etat = EtatFourmi.Oeuf;
	}*/
	
	
	@Override
	public void transformation() {
		this.etat = EtatFourmi.Larve;
	}

}

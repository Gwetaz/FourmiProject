package etat.impl;


public class Oeuf extends Etat implements Transformation{
	
	public Oeuf(int tempsNaissance) {
		super(tempsNaissance);
		this.changerEtat(EtatFourmi.Oeuf);
		this.poid = 0;
	}
	
	
	@Override
	public Etat transformation() {
		return new Larve(tempsNaissance);
	}

}

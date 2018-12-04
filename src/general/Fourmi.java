package general;
import java.awt.Graphics;

import etat.impl.* ;
import role.impl.*;

public class Fourmi {
	
	Boolean FourmiFemelle;
	Double FourmiPoid;
	Etat Etat;
	Reine reine;
	int posX,posY;
	
	
	public Fourmi(Boolean FourmiFemelle, Double FourmiPoid, int naissance, int posX, int posY, Graphics g)
	{
		FourmiFemelle = this.FourmiFemelle ;
		FourmiPoid = this.FourmiPoid;
		this.Etat = new Oeuf(naissance, posX, posY);
		this.posX =posX;
		this.posY = posY;
		g.fillOval(posX, posY, 10, 10);
	}
	
	
	
	
	public Boolean getFourmiFemelle() {
		return FourmiFemelle;
	}



	public void setFourmiFemelle(Boolean fourmiFemelle) {
		FourmiFemelle = fourmiFemelle;
	}



	public Double getFourmiPoid() {
		return FourmiPoid;
	}



	public void setFourmiPoid(Double fourmiPoid) {
		FourmiPoid = fourmiPoid;
	}



	public Etat getEtat() {
		return Etat;
	}



	public void setEtat(Etat etat) {
		Etat = etat;
	}



	public Reine getReine() {
		return reine;
	}



	public void setReine(Reine reine) {
		this.reine = reine;
	}


	
	
	

}

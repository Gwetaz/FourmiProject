package general;
import java.awt.Graphics;

import etat.impl.* ;
import role.impl.*;

public class Fourmi {
	
	Boolean FourmiFemelle;
	//Double FourmiPoid;
	Etat Etat;
	Reine reine;
	int posX,posY;
	int naissance;
	
	public Fourmi(Boolean FourmiFemelle, int naissance, int posX, int posY, Graphics g)
	{
		FourmiFemelle = this.FourmiFemelle ;
		//FourmiPoid = this.FourmiPoid;
		this.naissance = naissance;
		this.Etat = new Oeuf(naissance, posX, posY);
		this.posX =posX;
		this.posY = posY;
		g.setColor(Constantes.couleurOeuf);
		g.fillOval(posX, posY, 10, 10);
	}
	
	
	public void setColor(Graphics g)
	{
		
	}
	
	public void changerEtat()
	{
		Etat nouvelEtat;
		switch(this.getEtat().getEtatFourmi())
		{
		case Oeuf:
			nouvelEtat = new Larve(naissance,posX,posY);
			this.setEtat(nouvelEtat);
			break;
		case Larve :
			nouvelEtat = new Nymphe(naissance,posX,posY);
			this.setEtat(nouvelEtat);
			break;
		case Nymphe :
			nouvelEtat = new Adulte(naissance,posX,posY);
			this.setEtat(nouvelEtat);
			break;
		case Adulte :
			break;
		default :
			break;
		}
	}
	
	public Boolean getFourmiFemelle() {
		return FourmiFemelle;
	}



	public void setFourmiFemelle(Boolean fourmiFemelle) {
		FourmiFemelle = fourmiFemelle;
	}



	/*public Double getFourmiPoid() {
		return FourmiPoid;
	}*/



	/*public void setFourmiPoid(Double fourmiPoid) {
		FourmiPoid = fourmiPoid;
	}*/



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


	public String toString()
	{
		String res = "Fourmis : ";
		res = res+" posX = "+this.posX+" posY = "+this.posY+" Poids : "+this.getEtat().getPoid()+" Etat : "+this.getEtat().toString();
		return res;
	}
	
	

}

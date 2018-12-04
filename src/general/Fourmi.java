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
	Cercle c;
	
	

	public Fourmi(Boolean FourmiFemelle, int naissance, Cercle c)
	{
		FourmiFemelle = this.FourmiFemelle ;
		//FourmiPoid = this.FourmiPoid;
		this.naissance = naissance;
		this.Etat = new Oeuf(naissance, posX, posY);
		this.posX =posX;
		this.posY = posY;
		this.c = c;
		/*g.setColor(Constantes.couleurOeuf);
		g.fillOval(posX, posY, 10, 10);*/
		//c.setPosition(p);
	}
	
	
	public Cercle getC() {
		return c;
	}


	public void setC(Cercle c) {
		this.c = c;
	}

	
	/*public void setColor(Graphics g)
	{
		
	}*/
	
	public void changerEtat()
	{ 
		Etat nouvelEtat;
		switch(this.getEtat().getEtatFourmi())
		{
		case Oeuf:
			nouvelEtat = new Larve(naissance,posX,posY);
			this.setEtat(nouvelEtat);
			this.c.SetColor(Constantes.couleurLarve);
			break;
		case Larve :
			nouvelEtat = new Nymphe(naissance,posX,posY);
			this.setEtat(nouvelEtat);
			this.c.SetColor(Constantes.couleurNymphe);
			break;
		case Nymphe :
			nouvelEtat = new Adulte(naissance,posX,posY);
			//this.c.SetColor(Constantes.couleurAdulte);
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

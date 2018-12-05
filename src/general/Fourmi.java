package general;
import java.util.Random;

import etat.impl.* ;
import role.impl.*;

public class Fourmi implements Action {
	
	Boolean FourmiFemelle;
	Etat Etat;
	Reine reine;
	int posX,posY;
	int naissance;
	
	

	public Fourmi(int naissance, int posx, int posy)
	{
		Random r = new Random();
		int sexe; 
		sexe = r.nextInt(2-1) + 1;
		if(sexe == 1)
		{
			this.FourmiFemelle = true;
		}else{ 
			this.FourmiFemelle = false;
		}
		this.posX = posx;
		this.posY = posy;
		this.naissance = naissance;
		this.Etat = new Oeuf();
	}
	
	
	/*public void changerEtat()
	{ 
		Etat nouvelEtat;
		switch(this.getEtat().getEtatFourmi())
		{
		case Oeuf:
			nouvelEtat = new Larve(naissance,posX,posY);
			this.setEtat(nouvelEtat);
			//this.c.SetColor(Constantes.couleurLarve);
			break;
		case Larve :
			nouvelEtat = new Nymphe(naissance,posX,posY);
			this.setEtat(nouvelEtat);
			//this.c.SetColor(Constantes.couleurNymphe);
			break;
		case Nymphe :
			
			//this.c.SetColor(Constantes.couleurAdulte);
			
			Random r = new Random();
			int role = r.nextInt(100-0);
			//System.out.println(role);
			if(role <= Constantes.pourcentOuvriere)
			{
				//this.c.SetColor(Constantes.couleurOuvriere);
				nouvelEtat = new Adulte(naissance,posX,posY, new Ouvriere());
			}else{
				//this.c.SetColor(Constantes.couleurSoldat);
				nouvelEtat = new Adulte(naissance,posX,posY, new Soldat());
			}
			this.setEtat(nouvelEtat);
			break;
		case Adulte :
			break;
		default :
			break;
		}
	}*/
	 
	public void changerEtat()
	{
		//this.Etat.
	}
	
	public Boolean getFourmiFemelle() {
		return FourmiFemelle;
	}



	public void setFourmiFemelle(Boolean fourmiFemelle) {
		FourmiFemelle = fourmiFemelle;
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


	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}



	public String toString()
	{
		String res = "Fourmis : sexe "+this.getFourmiFemelle();
		res = res+" posX = "+this.posX+" posY = "+this.posY+" Poids : "+this.getEtat().getPoid()+" Etat : "+this.getEtat().toString();
		return res;
	}


	@Override
	public void action() {
		this.getEtat().toString();
		
	}
	
	

}

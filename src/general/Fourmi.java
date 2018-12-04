package general;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

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
	
	public void deplacement() {
		/*Random r = new Random();
		int x,y,probabilite;
		probabilite = r.nextInt(4-1) + 1;
		x = (int) this.getC().getPosition().getX();
		y = (int) this.getC().getPosition().getY();
		if(probabilite == 1) {
			x++;
		}
		if(probabilite == 2) {
			x--;
		}
		if(probabilite == 3) {
			y++;
		}
		if(probabilite == 4) {
			y--;
		}
		this.getC().setPosition(new Point(x,y));*/
		if (this.getEtat().getEtatFourmi() == EtatFourmi.Adulte)
		{
			RoleFourmi roleFourmi;
			roleFourmi = ((Adulte) this.getEtat()).getRole().getRoleFourmi();
			Role role2 = ((Adulte) this.getEtat()).getRole();
			System.out.println("Role2 : "+role2.toString());
			//System.out.println("erreur : "+roleFourmi.toString());
			if (roleFourmi == RoleFourmi.Ouvriere)
			{
				System.out.println("Ouvriere");
				((Ouvriere) ((Adulte) this.getEtat()).getRole()).deplacement(this);
			}else if (roleFourmi == RoleFourmi.Soldat){
				System.out.println("Soldat");
				((Soldat) ((Adulte) this.getEtat()).getRole()).deplacement(this);
			}else{
				System.out.println("ELSE");
			}
			/*switch (roleFourmi)
			{
			case Soldat:
				((Soldat) ((Adulte) this.getEtat()).getRole()).deplacement(this);
				break;
			case Ouvriere:
				((Ouvriere) ((Adulte) this.getEtat()).getRole()).deplacement(this);
				break;
			case Reine:
				break;
			default:
				System.out.println("erreur");
					break;
			}*/
		}
		
	}
	
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
			
			//this.c.SetColor(Constantes.couleurAdulte);
			
			Random r = new Random();
			int role = r.nextInt(100-0);
			//System.out.println(role);
			if(role <= Constantes.pourcentOuvriere)
			{
				this.c.SetColor(Constantes.couleurOuvriere);
				nouvelEtat = new Adulte(naissance,posX,posY, new Ouvriere());
			}else{
				this.c.SetColor(Constantes.couleurSoldat);
				nouvelEtat = new Adulte(naissance,posX,posY, new Soldat());
			}
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

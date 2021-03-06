package general;
import java.awt.Point;
import java.util.Random;

import IHM.Monde3;
import etat.impl.* ;
import role.impl.*;

public class Fourmi {
	
	Boolean FourmiFemelle;
	Etat Etat;
	Reine reine;
	int posX,posY;
	int naissance;
	RoleFourmi roleAdulte;
	Fourmiliere fourmiliere;
	public int nbJourEnOeuf;
	public int nbJourEnLarve;
	public int nbJourEnNymphe;
	public int nbJourDeVie;
	public int nbJourDeMort;
	boolean vivante;
	boolean PossedeNourriture;
	boolean creationChemin;

	public int getNbJourDeVie() {
		return nbJourDeVie;
	}


	public int getNbJourDeMort() {
		return nbJourDeMort;
	}

	public boolean isPossedeNourriture() {
		return PossedeNourriture;
	}


	public void setPossedeNourriture(boolean possedeNourriture) {
		PossedeNourriture = possedeNourriture;
	}


	public void setNbJourDeMort(int nbJourDeMort) {
		this.nbJourDeMort = nbJourDeMort;
	}


	public void setNbJourDeVie(int nbJourDeVie) {
		this.nbJourDeVie = nbJourDeVie;
	}


	public Fourmi(int naissance, int posx, int posy, Fourmiliere fourmiliere)
	{
		this.vivante = true;
		this.nbJourDeMort = 0;
		this.nbJourEnOeuf = 1;
		this.nbJourEnLarve = 1;
		this.nbJourEnNymphe = 1;
		this.nbJourDeVie = 0;
		this.fourmiliere = fourmiliere;
		this.PossedeNourriture = false;
		this.creationChemin = false;
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
		this.roleAdulte = null;
	}
	
	
	public boolean isVivante() {
		return vivante;
	}


	public void setVivante(boolean vivante) {
		this.vivante = vivante;
	}


	public Fourmiliere getFourmiliere() {
		return fourmiliere;
	}


	public void setFourmiliere(Fourmiliere fourmiliere) {
		this.fourmiliere = fourmiliere;
	}


	public RoleFourmi getRoleAdulte() {
		return roleAdulte;
	}


	public void setRoleAdulte(RoleFourmi roleAdulte) {
		this.roleAdulte = roleAdulte;
	}
	
	


	public boolean isCreationChemin() {
		return creationChemin;
	}


	public void setCreationChemin(boolean creationChemin) {
		this.creationChemin = creationChemin;
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
		res = res+" posX = "+this.posX+" posY = "+this.posY+" Poids : "+this.getEtat().getPoid()+" Etat : "+this.getEtat().toString()+" Role Adulte : "+this.getRoleAdulte()+" Nb jour de vie : "+this.nbJourDeVie+" Date de cécès en jours : "+this.nbJourDeMort+" Nombre de jour restant : "+(this.nbJourDeMort-this.nbJourDeVie);
		return res;
	}


	
	public void action(Monde3 monMonde) {
		this.getEtat().action(this, monMonde);
	}


	/*public int StackProche(Monde3 m) {
		
		double JeCalcul = 1000 ;
		double intermed = 0 ;		
		int QuelStack = -1 ;
		for(int i = 0; i < fourmiliere.getListeStack().size(); i++)
		{
			Point p = m.getMatrice().DeCaseaPos(fourmiliere.getListeStack().get(i).Casex, fourmiliere.getListeStack().get(i).Casey);
			
			intermed = Math.sqrt(((this.posX - p.x) * (this.posX - p.x) )+ ((this.posY - p.y) * (this.posY - p.y))) ;
			 if ( intermed < JeCalcul ) 
			 {
				 JeCalcul = intermed;
				 QuelStack= i;
			 }
			
		}
		return QuelStack;
	}*/
	
	public int StackProche(Monde3 m) {
		
		return 0;
	}
	
	
	public Point getStackproche(Monde3 m)
	{
		return new Point(fourmiliere.getListeStack().get(this.StackProche(m)).Casex,fourmiliere.getListeStack().get(this.StackProche(m)).Casey);
	}
	
	public void retourMaison(Monde3 m)
	{
		int i = StackProche(m);
		Point Posfourmi = m.getMatrice().DePosACase(this.posX, this.posY);
		if( fourmiliere.getListeStack().get(i).Casex > Posfourmi.getX() )
		{
			this.posX = this.posX+10;
		}
		if( fourmiliere.getListeStack().get(i).Casex < Posfourmi.getX() )
		{
			this.posX = this.posX-10;
		}
		
		if( fourmiliere.getListeStack().get(i).Casey > Posfourmi.getY() )
		{
			this.posY = this.posY+10;
		}
		if( fourmiliere.getListeStack().get(i).Casey < Posfourmi.getY() )
		{
			this.posY = this.posY-10;
		}
		
		
		
		
		
	}
	
	

}

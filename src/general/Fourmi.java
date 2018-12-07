package general;
import java.util.Random;

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


	
	public void action() {
		this.getEtat().action(this);
		//this.nbJourDeVie++;
	}

	
	

}

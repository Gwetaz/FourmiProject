package IHM;

import java.awt.Color;
import java.awt.Dimension;

import general.FacadeMonde;
import general.Fourmiliere;

public class Demo1 {

	public static final int nombreOeufs = 10;
	
	public static void main(String[] args) {
		Monde jc = FacadeMonde.genererMonde(nombreOeufs);
		
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(1600,800));
		GUIHelper.showOnFrame(jc,"test");
		
		//Fourmiliere fourmiliere = new Fourmiliere();
	}
	
}

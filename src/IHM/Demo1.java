package IHM;

import java.awt.Color;
import java.awt.Dimension;

import general.Fourmiliere;

public class Demo1 {

	public final int nombreOeufs = 50;
	
	public static void main(String[] args) {
		Monde jc = new Monde();
		jc.setBackground(Color.WHITE);
		jc.setPreferredSize(new Dimension(1600,800));
		GUIHelper.showOnFrame(jc,"test");
		
		//Fourmiliere fourmiliere = new Fourmiliere();
	}
	
}

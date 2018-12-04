package general;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class RectangleForme extends Morph{
	
	
	public RectangleForme(Color color, Point pos, Dimension dim) {
		super(color, pos, dim);
		
	} 

	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(color);
		//g.fillOval(bounds.x,bounds.y,bounds.height,bounds.width);
		//System.out.println("depart x : "+bounds.x+" depart y : "+bounds.y+" taille x : "+bounds.height+" taille y : "+bounds.width);

		g.fillRect(Constantes.departFourmiliereX,Constantes.departFourmiliereY, Constantes.tailleFourmiliereX, Constantes.tailleFourmiliereY);
		g.setColor(c);
	}
}

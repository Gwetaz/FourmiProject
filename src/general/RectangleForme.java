package general;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class RectangleForme extends Morph{
	
	Point p;
	Dimension dim;
	
	public RectangleForme(Color color, Point pos, Dimension dim) {
		super(color, pos, dim);
		this.p = pos;
		this.dim = dim;
	} 

	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(color);
		g.fillRect((int) p.getX(),(int) p.getY(), (int) dim.getHeight(), (int) dim.getWidth());
		g.setColor(c);
	}
}

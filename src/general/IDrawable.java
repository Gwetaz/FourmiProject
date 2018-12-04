package general;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * @author duj
 *
 * 
 */
public interface IDrawable {
	/**
	 * @pre: g!=null
	 * @post: configuration de g inchang�e
	 */
	public abstract void draw(Graphics g);

	/**
	 * @pre:
	 * @return le rectangle  qui contient compl�tement this.
	 */
	public abstract Rectangle getBounds();
}
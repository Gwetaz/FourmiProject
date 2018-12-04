package IHM;

import general.Cercle;
import general.Constantes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Demo2 {

	public static void main(String[] args) {
		Random x = new Random();
		Monde2 jc = new Monde2("Un essai de Morphs");
		jc.setBackground(Constantes.couleurSol);
		jc.setPreferredSize(new Dimension(Constantes.tailleJframeX, Constantes.tailleJframeY));
		Dimension dim = new Dimension(10, 10);
		Cercle o;
		for (int i=0;i<10;i++)
		{
			jc.add(new Cercle(Constantes.couleurOuvriere, new Point(50, 50), dim));
			//jc.add(new Cercle(new Color((int) (Math.random() * 0x1000000)), new Point(0, 0), dim));
		}
		/*for (int i = 0; i < 20000; i++) {
			dim = new Dimension(x.nextInt(20), x.nextInt(20));
			jc.add(new Oval(new Color((int) (Math.random() * 0x1000000)), new Point(0, 0), dim));
		}*/
		jc.open();
		while (true) {
			//List<IMovableDrawable> drawables = jc.contents();
			/*for (Iterator<IMovableDrawable> iter = drawables.iterator(); iter.hasNext();) {
				iter.next().setPosition(new Point(x.nextInt(800), x.nextInt(600)));
			}*/
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jc.repaint();
		}
	}
}

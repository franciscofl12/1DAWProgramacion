package cap4.ejercicioSobreHerencia.ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class Figura extends Canvas{
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawRect(20, 20, 100, 60);
		g.setColor(Color.red);
		g.fillRect(20, 20, 100, 60);
		g.setColor(Color.green);
		g.drawOval(200, 100, 50, 50);
		g.setColor(Color.green);
		g.fillOval(200, 100, 50, 50);
		g.setColor(Color.blue);
		g.drawPolygon(new int[] {400, 420, 440}, new int[] {100, 20, 100}, 3);
		g.setColor(Color.blue);
		g.fillPolygon(new int[] {400, 420, 440}, new int[] {100, 20, 100}, 3);
	}
}

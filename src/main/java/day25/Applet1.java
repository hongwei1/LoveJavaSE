package day25;

import java.applet.Applet;
import java.awt.Graphics;

public class Applet1 extends Applet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g)
	{
		g.drawString("hello", 10, 10);
	}
}

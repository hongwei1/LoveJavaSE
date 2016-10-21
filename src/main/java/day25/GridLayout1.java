package day25;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

public class GridLayout1 extends Applet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void init()
	{
		setLayout(new GridLayout());
		// setLayout(new FlowLayout());
		for (int i = 1; i <= 20; i++)
		{
			add(new Button("Button" + i));
		}
	}
}

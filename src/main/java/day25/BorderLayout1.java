package day25;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;

public class BorderLayout1 extends Applet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void init()
	{
		setLayout(new BorderLayout());
		add("North", new Button("North"));
		add("South", new Button("South"));
		add("East", new Button("East"));
		add("West", new Button("West"));
		add("Center", new Button("Center"));
	}
}

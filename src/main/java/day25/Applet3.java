package day25;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class Applet3 extends Applet
{
	private static final long serialVersionUID = 1L;
	Button button1 = new Button("Butten1");
	Button button2 = new Button("Butten2");
	TextField textField = new TextField("Starting Text", 30);
	String s = new String();

	@Override
	public void init()
	{
		add(button1);
		add(button2);
		add(textField);
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean action(Event evt, Object what)
	{
		if (evt.target.equals(button1))
		{
			getAppletContext().showStatus(textField.getText());
			s = textField.getSelectedText();
			if (s.length() == 0)
			{
				s = textField.getText();
			}
			textField.setEditable(true);
		}
		else if (evt.target.equals(button2))
		{
			textField.setText("Insert by Button2: " + s);
			textField.setEditable(false);
		}
		else
		{
			return super.action(evt, what);
		}
		return true;

	}
}

package day25.swing.demo;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class NewJFrame extends javax.swing.JFrame
{

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public NewJFrame()
	{
		super();
		this.initGUI();
	}

	private void initGUI()
	{
		try
		{
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.pack();
			this.setSize(400, 300);
		}
		catch (Exception e)
		{
			// add your error handling code here
			e.printStackTrace();
		}
	}

}

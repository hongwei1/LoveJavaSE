package day25.swing.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose whatever) then you should purchase a license for each developer using Jigloo. Please
 * visit www.cloudgarden.com for details. Use of Jigloo implies acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR THIS
 * MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class MySwing extends javax.swing.JFrame
{
	private JButton jButton1;

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
				MySwing inst = new MySwing();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MySwing()
	{
		super();
		this.initGUI();
	}

	private void initGUI()
	{
		try
		{
			this.getContentPane().setLayout(null);
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				this.jButton1 = new JButton();
				this.getContentPane().add(this.jButton1);
				this.jButton1.setText("\u9000\u51fa");
				this.jButton1.setBounds(142, 26, 103, 48);
				this.jButton1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent evt)
					{
						MySwing.this.jButton1ActionPerformed(evt);
					}
				});
			}
			this.pack();
			this.setSize(400, 300);
		}
		catch (Exception e)
		{
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void jButton1ActionPerformed(ActionEvent evt)
	{
		// System.out.println("jButton1.actionPerformed, event="+evt);
		// TODO add your code for jButton1.actionPerformed

		System.exit(0);
	}

}

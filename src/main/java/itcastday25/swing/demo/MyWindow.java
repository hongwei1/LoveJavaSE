package itcastday25.swing.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose whatever) then you should purchase a license for each developer using Jigloo. Please
 * visit www.cloudgarden.com for details. Use of Jigloo implies acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR THIS
 * MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class MyWindow extends javax.swing.JFrame
{
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private JTextField jTextField1;
	private JButton jButton1;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;

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
				MyWindow inst = new MyWindow();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MyWindow()
	{
		super();
		this.initGUI();
	}

	private void initGUI()
	{
		try
		{
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.getContentPane().setLayout(null);
			{
				this.jTextField1 = new JTextField();
				this.getContentPane().add(this.jTextField1, "Center");
				this.jTextField1.setBounds(12, 41, 368, 34);
				this.jTextField1.addKeyListener(new KeyAdapter()
				{
					@Override
					public void keyPressed(KeyEvent evt)
					{
						MyWindow.this.jTextField1KeyPressed(evt);
					}
				});
			}
			{
				this.jButton1 = new JButton();
				this.getContentPane().add(this.jButton1);
				this.jButton1.setText("\u8f6c\u5230");
				this.jButton1.setBounds(397, 41, 99, 34);
				this.jButton1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent evt)
					{
						MyWindow.this.jButton1ActionPerformed(evt);
					}
				});
			}
			{
				this.jScrollPane1 = new JScrollPane();
				this.getContentPane().add(this.jScrollPane1);
				this.jScrollPane1.setBounds(12, 87, 484, 356);
				{
					this.jTextArea1 = new JTextArea();
					this.jScrollPane1.setViewportView(this.jTextArea1);
				}
			}
			this.pack();
			this.setSize(523, 482);
		}
		catch (Exception e)
		{
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void jButton1ActionPerformed(ActionEvent evt)
	{

		this.showDir();
	}

	/**
	 *
	 */
	public void showDir()
	{
		/*
		 * 通过点击按钮获取文本框中目录， 将目录中的内容显示在文本区域中。
		 */

		String dir_str = this.jTextField1.getText();
		File dir = new File(dir_str);

		if (dir.exists() && dir.isDirectory())
		{
			this.jTextArea1.setText("");
			String[] names = dir.list();

			for (String name : names)
			{
				this.jTextArea1.append(name + MyWindow.LINE_SEPARATOR);
			}
		}
	}

	private void jTextField1KeyPressed(KeyEvent evt)
	{

		if (evt.getKeyCode() == KeyEvent.VK_ENTER)
		{
			this.showDir();
		}
	}

}

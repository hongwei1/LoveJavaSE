package itcastday25.swing.demo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose whatever) then you should purchase a license for each developer using Jigloo. Please
 * visit www.cloudgarden.com for details. Use of Jigloo implies acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR THIS
 * MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class MyMenu extends javax.swing.JFrame
{
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private JMenuBar jMenuBar1;
	private JScrollPane jScrollPane1;
	private JMenuItem jMenuItem2;
	private JTextArea jTextArea1;
	private JMenuItem jMenuItem1;
	private JMenu jMenu1;
	private JFileChooser chooser;
	private JDialog dialog;

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
				MyMenu inst = new MyMenu();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public MyMenu()
	{
		super();
		this.initGUI();
	}

	private void initGUI()
	{
		try
		{
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			{
				this.jScrollPane1 = new JScrollPane();
				this.getContentPane().add(this.jScrollPane1, BorderLayout.CENTER);
				{
					this.jTextArea1 = new JTextArea();
					this.jScrollPane1.setViewportView(this.jTextArea1);
				}
			}
			{
				this.jMenuBar1 = new JMenuBar();
				this.setJMenuBar(this.jMenuBar1);
				{
					this.jMenu1 = new JMenu();
					this.jMenuBar1.add(this.jMenu1);
					this.jMenu1.setText("\u6587\u4ef6");
					{
						this.jMenuItem1 = new JMenuItem();
						this.jMenu1.add(this.jMenuItem1);
						this.jMenuItem1.setText("\u6253\u5f00");
						this.jMenuItem1.addActionListener(new ActionListener()
						{
							@Override
							public void actionPerformed(ActionEvent evt)
							{
								try
								{
									MyMenu.this.jMenuItem1ActionPerformed(evt);
								}
								catch (IOException e)
								{

									e.printStackTrace();
								}
							}
						});
					}
					{
						this.jMenuItem2 = new JMenuItem();
						this.jMenu1.add(this.jMenuItem2);
						this.jMenuItem2.setText("\u4fdd\u5b58");
						this.jMenuItem2.addActionListener(new ActionListener()
						{
							@Override
							public void actionPerformed(ActionEvent evt)
							{
								try
								{
									MyMenu.this.jMenuItem2ActionPerformed(evt);
								}
								catch (IOException e)
								{

									e.printStackTrace();
								}
							}
						});
					}
				}
			}
			this.pack();
			this.setSize(610, 402);
		}
		catch (Exception e)
		{
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void jMenuItem1ActionPerformed(ActionEvent evt) throws IOException
	{

		this.chooser = new JFileChooser();

		// FileNameExtensionFilter filter = new FileNameExtensionFilter(
		// "JPG & GIF Images", "jpg", "gif");
		// chooser.setFileFilter(filter);

		int returnVal = this.chooser.showOpenDialog(this);
		if (returnVal == JFileChooser.CANCEL_OPTION)
		{
			System.out.println("没有选取文件，取消了");
			return;
		}

		File file = this.chooser.getSelectedFile();

		BufferedReader bufr = new BufferedReader(new FileReader(file));

		String line = null;
		while ((line = bufr.readLine()) != null)
		{
			this.jTextArea1.append(line + MyMenu.LINE_SEPARATOR);
		}

		bufr.close();

	}

	private void jMenuItem2ActionPerformed(ActionEvent evt) throws IOException
	{

		this.chooser = new JFileChooser();
		int returnVal = this.chooser.showSaveDialog(this);
		if (returnVal == JFileChooser.CANCEL_OPTION)
		{
			System.out.println("没有指定文件，取消了");
			return;
		}

		File file = this.chooser.getSelectedFile();

		String text = this.jTextArea1.getText();

		BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
		bufw.write(text);
		bufw.close();

	}

}

package day25.gui.p1.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyDemo
{
	private Frame frame;
	private TextField testField;
	private Button button;

	public MouseAndKeyDemo()
	{
		this.init();
	}

	private void init()
	{
		this.frame = new Frame("演示鼠标和键盘监听");
		this.frame.setBounds(400, 200, 500, 400);
		this.frame.setLayout(new FlowLayout());

		this.button = new Button("一个按钮");
		this.testField = new TextField(40);

		this.frame.add(this.button);
		this.frame.add(this.testField);

		this.myEvent();
		this.frame.setVisible(true);

	}

	private void myEvent()
	{

		// 给文本框添加键盘监听。
		this.testField.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				System.out.println("key run..." + KeyEvent.getKeyText(e.getKeyCode()) + "::::" + e.getKeyCode());
				int code = e.getKeyCode();
				if (!(code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9))
				{
					System.out.println("必须是数字");
					// e.consume();
				}

				// if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER)
				// {
				// System.out.println("enter run ...");
				// }

				if (e.getKeyCode() == 8)
				{
					MouseAndKeyDemo.this.testField.setText("");
				}
			}

		});

		this.frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}

		});

		this.button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("action run.....");
			}
		});

		// 在按钮上添加一个鼠标监听.
		this.button.addMouseListener(new MouseAdapter()
		{

			private int count = 1;

			@Override
			public void mouseEntered(MouseEvent e)
			{

				// System.out.println("mouse enter..."+count++);

				// tf.setText("mouse enter..."+count++);

			}

			@Override
			public void mouseClicked(MouseEvent e)
			{

				if (e.getClickCount() == 2)
				{
					MouseAndKeyDemo.this.testField.setText("mouse double click..." + this.count++);
				}
			}

		});
	}

	public static void main(String[] args)
	{

		new MouseAndKeyDemo();
	}

}

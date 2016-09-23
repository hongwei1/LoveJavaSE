package day25.gui.p1.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("my frame");
		// f.setSize(500, 400);
		// f.setLocation(400, 200);
		frame.setBounds(400, 200, 500, 400);
		frame.setLayout(new FlowLayout());// 设置流式布局

		Button aButton = new Button("一个按钮");
		frame.add(aButton);// 将按钮添加到窗体中。

		// 在窗口上加上一个监听。
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				// System.out.println("closing......." + e);
				System.exit(0);
			}

		});

		// 在按钮上加上一个监听。
		aButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("button run .....");
				// System.exit(0);
			}
		});

		frame.setVisible(true);
		System.out.println("over");
	}

}

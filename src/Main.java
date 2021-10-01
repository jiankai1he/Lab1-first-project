import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
name:JIANKAI HE
ID:215628779
course:EECS3311
section:B
LAB 01
**/
//the entry of the program
public class Main extends JFrame implements ActionListener
{
	//the interface manager
	private ShapeManager shapeManager=null;
	private JButton btn1, btn2;

	//constructor, create the interface
	public Main()
	{
		setTitle("Display shapes");
		setSize(600, 600);
		setLayout(null);
		//create two buttons
		btn1=new JButton("Load shapes");
		btn1.setBounds(100, 10, 190, 30);
		btn1.addActionListener(this);
		add(btn1);
		//
		btn2=new JButton("Sort shapes");
		btn2.setBounds(300, 10, 190, 30);
		btn2.addActionListener(this);
		add(btn2);

		setVisible(true);
	}

	//draw the frame
	public void paint(Graphics g)
	{
		super.paint(g);
		if(shapeManager==null) return;
		//draw each shape
		for(int i=0;i<shapeManager.getShapes().size();i++)
		{
			Shape shape=shapeManager.getShapes().get(i);
			//set the top-left location
			int x=60*(i+1);
			int y=60*(i+2);
			shape.setTopLeft(x, y);
			shape.paint(g);
		}
	}

	//respond to button click
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//button 1
		if(e.getSource()==btn1)
		{
			//create new shapes
			shapeManager=new ShapeManager();
			//paint them
			repaint();
		}
		//button 2
		else if(e.getSource()==btn2)
		{
			//sort
			if(shapeManager==null) return;
			shapeManager.sort();
			//paint them
			repaint();
		}
	}

	public static void main(String[] args)
	{
		new Main();
	}
}

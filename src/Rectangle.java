import java.awt.*;

/**
name:JIANKAI HE
ID:215628779
course:EECS3311
section:B
LAB 01
**/
//the rectangle class
public class Rectangle extends Shape
{
	//the width and length of rectangle
	private int width;
	private int height;

	//constructor
	public Rectangle(Color color, int width, int height)
	{
		super(color);
		this.width=width;
		this.height=height;
	}

	@Override
	public double area()
	{
		return width*height;
	}

	@Override
	public void paint(Graphics g)
	{
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}

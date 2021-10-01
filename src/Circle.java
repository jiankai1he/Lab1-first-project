import java.awt.*;


/**
name:JIANKAI HE
ID:215628779
course:EECS3311
section:B
LAB 01
**/
//the circle class
public class Circle extends Shape
{
	//the radius of the circle
	private int radius;

	//constructor
	public Circle(Color color, int radius)
	{
		super(color);
		this.radius=radius;
	}

	@Override
	public double area()
	{
		return Math.PI*radius*radius;
	}

	@Override
	public void paint(Graphics g)
	{
		g.setColor(color);
		g.fillArc(x, y, radius*2, radius*2, 0, 360);
	}
}

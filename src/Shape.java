import java.awt.*;


/**
name:JIANKAI HE
ID:215628779
course:EECS3311
section:B
LAB 01
**/
//the base class for shapes
public abstract class Shape implements Comparable<Shape>
{
	//the top-left location
	protected int x;
	protected int y;
	//the color of the shape
	protected Color color;

	//constructor
	public Shape(Color color)
	{
		this.x=0;
		this.y=0;
		this.color=color;
	}

	//set the top-left location
	public void setTopLeft(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	//calculate the area
	public abstract double area();

	//draw the shape
	public abstract void paint(Graphics g);

	public int compareTo(Shape b)
	{
		if(area()<b.area()) return -1;
		else if(area()>b.area()) return 1;
		else return 0;
	}
}

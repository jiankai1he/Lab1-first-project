import java.awt.*;
import java.util.Random;

/**
name:JIANKAI HE
ID:215628779
course:EECS3311
section:B
LAB 01
**/
//shape factory, creates shapes
public class ShapeFactory
{
	//create one random shape
	public static Shape createShape()
	{
		Random ran=new Random();
		//random color
		Color color=new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256));
		//random shape type
		int type=ran.nextInt(3);
		int width=25;
		if(type==0) return new Circle(color, 10+ran.nextInt(width-10));
		else if(type==1) return new Rectangle(color, width+ran.nextInt(width), width+ran.nextInt(width));
		else return new Square(color, width+ran.nextInt(width));
	}
}

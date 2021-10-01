import java.util.ArrayList;

/**
name:JIANKAI HE
ID:215628779
course:EECS3311
section:B
LAB 01
**/
//manage all the shapes for painting
public class ShapeManager implements Observer
{
	//all shapes
	private ArrayList<Shape> shapes;

	//constructor, initialize shapes
	public ShapeManager()
	{
		shapes=new ArrayList<>();
		for(int i=0;i<6;i++)
		{
			Shape shape=ShapeFactory.createShape();
			shapes.add(shape);
		}
	}

	//get shapes
	public ArrayList<Shape> getShapes()
	{
		return shapes;
	}

	@Override
	public void sort()
	{
		//bubble sort
		for(int i=0;i<shapes.size()-1;i++)
		{
			for(int j=0;j<shapes.size()-1-i;j++)
			{
				if(shapes.get(j).compareTo(shapes.get(j+1))>0)
				{
					//swap
					Shape s=shapes.get(j);
					shapes.set(j, shapes.get(j+1));
					shapes.set(j+1, s);
				}
			}
		}
	}
}

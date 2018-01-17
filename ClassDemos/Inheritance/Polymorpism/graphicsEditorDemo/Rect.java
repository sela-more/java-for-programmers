package Polymorpism.graphicsEditorDemo;
class Rect extends Shape
{
	public Rect(Point p1, Point p2)
	{
		super(p1, p2);
	}

	public Rect(int x1, int y1, int x2, int y2)
	{
		super(new Point(x1, y1), new Point(x2, y2));
	}


	public void draw()
	{
		System.out.print("this is a rectangle ");
		super.draw();
	}
};
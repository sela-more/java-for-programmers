package Polymorpism.graphicsEditorDemo;
class Oval extends Shape
{
	public Oval(Point p1, Point p2)
	{
		super(p1, p2);
	}

	public Oval(int x, int y, int radius)
	{
		super(new Point(x - radius, y - radius), new Point(x + radius, y + radius));
	}

	public void draw()
	{
		System.out.print("this is an oval ");
		super.draw();
	}
};
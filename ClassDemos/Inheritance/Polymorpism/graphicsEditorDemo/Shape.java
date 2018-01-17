package Polymorpism.graphicsEditorDemo;
class Shape
{
	Point m_p1, m_p2;

	public Shape(Point p1, Point p2) {
		m_p1 = p1;
		m_p2 = p2;
	}
	public void move(Point newPoint) {
		m_p1.move (newPoint.getX(), newPoint.getY());
	}

	public void draw()
	{
		System.out.print("this is a Shape ");
		System.out.print(m_p1 + " " + m_p2);
		
	}
}
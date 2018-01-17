package Polymorpism.graphicsEditorDemo;
class Picture // implements Drawable
{
	private Shape m_Arr[] = new Shape[100];
	private int m_nNumOfShapes;

	

	public void move(int x, int y)
	{
		for (int i = 0 ; i < m_nNumOfShapes ; ++i )
			m_Arr[i].move(new Point(x,y));
	}

	public void addShape(Shape NewShape)
	{
		m_Arr[m_nNumOfShapes++] = NewShape;
	}

	public void draw()
	{
		for (int i = 0 ; i < m_nNumOfShapes ;  ++i)
		{
			m_Arr[i].draw();
		}
	}

	public static void main(String args[]) 
	{
		Picture pic = new Picture();
		pic.addShape(new Rect(10, 10, 20, 20));
		pic.addShape(new Rect(new Point(10, 10), new Point(20, 20)));
		pic.addShape(new Oval(10, 10, 10));
		pic.draw();
		
		/* later: make them all drawables!
		Picture bigPicture = new Picture();
		bigPicture.addShape(new Rect(10, 10, 20, 20));
		bigPicture.addShape(pic);
		*/

		
	}
};
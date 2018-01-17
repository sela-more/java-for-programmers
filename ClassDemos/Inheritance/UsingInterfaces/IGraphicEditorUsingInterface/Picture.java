package UsingInterfaces.IGraphicEditorUsingInterface;
class Picture implements Drawable
{
	private Drawable m_Arr[] = new Drawable[100];
	private int m_nNumOfShapes;

	

	public void move(Point p)
	{
		for (int i = 0 ; i < m_nNumOfShapes ; ++i )
			m_Arr[i].move(p);
	}

	public void addShape(Drawable NewShape)
	{
		m_Arr[m_nNumOfShapes++] = NewShape;
	}

	public void draw()
	{
		System.out.println("This is a picture");
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
		
		// now: all shapes and picture are drawalbes, so we 
		// can add a picture to its own array!
		Picture bigPicture = new Picture();
		bigPicture.addShape(new Rect(10, 10, 20, 20));
		bigPicture.addShape(pic);

		bigPicture.draw();
		

		
	}
};
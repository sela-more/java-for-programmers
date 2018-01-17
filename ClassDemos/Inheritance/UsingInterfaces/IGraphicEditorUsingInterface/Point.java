package UsingInterfaces.IGraphicEditorUsingInterface;
public class Point 
{
	private int m_x, m_y;
	public Point(int x, int y)
	{
		m_x = x; m_y = y;
	}

	
	public boolean equals(Object o)
	{
		if (o.getClass() != this.getClass()) //Point.class
			return false;

		Point pOther = (Point)o;
		return ((pOther.m_x == m_x) && (pOther.m_y == m_y));
	}

	public int hashCode()
	{
		return m_x * 3 + m_y * 7;
	}

	public int getX()
	{
		return m_x;
	}
	public int getY()
	{
		return m_y;
	}

	public String toString()
	{
		return "(" + m_x + ", " + m_y + ")";
	}

	public boolean set(int x, int y)
	{
		if ((x < 0) || (y < 0))
			return false;
		m_x = x;
		m_y = y;
		return true;
	}

	public boolean move(int xBy, int yBy)
	{
		return set(m_x + xBy, m_y + yBy);
	}
};
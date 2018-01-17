package ShapeEx;

public class Point {
	private int _x;
	private int _y;
	
	public Point(int x, int y) {
		_x = x;
		_y = y;
		
	}
	public int getX() {return _x;}
	public int getY() {return _y;}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		return _x*3 + _y * 5;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() != this.getClass())
			return false;
		Point other = (Point) obj;
		return (_x == other._x && _y == other._y);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ("X: " + _x + " Y: " + _y);
	}

}

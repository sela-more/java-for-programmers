package ShapeEx;

public class Edge {
	
	private Point _p1;
	private Point _p2;
	
	public Edge (Point p1, Point p2) {
		_p1 = p1;
		_p2 = p2;
	}
	
	public void  setEdge(Point p1, Point p2) {
		_p1 = p1;
		_p2 = p2; 
	}

	public double getLength() {
		// length = sqrt ((y2-y1)(y2-y1) + (x2-x1)(x2-x1))
		return Math.sqrt(Math.pow((_p2.getY() - _p1.getY()), 2) + Math.pow((_p2.getX() - _p1.getX()), 2));
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return _p1.hashCode() * 3 + _p2.hashCode() * 5;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() != this.getClass())
			return false;
		Edge other = (Edge) obj;
		return (this._p1.equals(other._p1) && this._p2.equals(other._p2));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "P1: " + _p1.toString() + " P2: " + _p2.toString();
	}

}

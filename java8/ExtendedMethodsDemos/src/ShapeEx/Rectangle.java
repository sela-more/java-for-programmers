package ShapeEx;

public class Rectangle implements IShape {
	
	
	private Point _pmin; 
	int _height;
	int _width;
	
	
	public Rectangle(int x, int y, int width, int height) {
		
		_pmin = new Point(x,y);
		_width = width;
		_height = height;
		
		
	}

	@Override
	public Edge[] getEdges() {
		
		Edge[] _list = new Edge[4];
		
		Edge e1 = new Edge (_pmin, new Point((_pmin.getX() + _width), _pmin.getY()));
		Edge e2 = new Edge(_pmin, new Point (_pmin.getX(),(_pmin.getY()+_height)));
		Edge e3 = new Edge(new Point(_pmin.getX(), _pmin.getY() + _height), new Point (_pmin.getX() + _width, _pmin.getY() + _height));
		Edge e4 = new Edge(new Point(_pmin.getX() + _width, _pmin.getY() + _height), new Point(_pmin.getX() + _width, _pmin.getY()));
		_list[0] = e1;
		_list[1] = e2;
		_list[2] = e3;
		_list[4] = e4;
		return _list;
	}

	@Override
	public double getArea() {
		return _width * _height;
	}

}

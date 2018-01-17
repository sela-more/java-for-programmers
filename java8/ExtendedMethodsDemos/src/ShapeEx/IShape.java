package ShapeEx;

public interface IShape extends IEdgeCollection {
	
	//Edge[] getEdges();
	
	double getArea() ;
	
	default double getPerimiter() {
		Edge[] _list = getEdges();
		
		double result = 0.0;
		
		for (int i=0; i < _list.length; i++) {
			result = result + _list[i].getLength();
		}
		
		return result;
	}
	default Edge getTheLongestEdge(){
		
		Edge[] _list = getEdges();
		
		double result = 0.0;
		Edge theEdge = new Edge(new Point(0,0), new Point(0,0));
		
		double len=0.0;
		for (int i=0; i < _list.length; i++) {
			len = _list[i].getLength();
			if (result < len) {
				result = len;
				theEdge = _list[i];
			}
		}
		
		return theEdge;
		
	}
	default void printEdges() {
		
		Edge[] _list = getEdges();
		
		for (int i=0; i < _list.length; i++) {
			System.out.println(_list[i].toString());
		}
		
		
		
	}

}

package AbstractClassExampleInJava;
//public abstract class Shape {
public  class Shape {
	private int m_x;
	private int m_y;
	public Shape (int x, int y) {
		m_x = x;
		m_y = y;
	}
	public void move (int byx, int byy) {
		this.m_x = byx;
		this.m_y = byy;
	}
	public String toString() {
		return "Coordinates: x: " + m_x + " y: " + m_y;
	
	}
	
	//public int calcAres()
	//{
	//	return 0;
	//}
	
    //	abstract public int calcAres();
}

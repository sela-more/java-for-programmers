package AbstractClassExampleInJava;
public class Rectangle extends Shape {
 private int m_width;
 private int m_height;
 public Rectangle(int x, int y, int w, int h) {
 		super(x,y);
 		m_width = w;
 		m_height = h;
 }
 public String toString() {
 	return super.toString() + " I am a rectangle";
 }
 
 //public int calcAres() {
	//	 return m_width * m_height;
	 //}
}


public class Pyramid {
	
	private int m_height;
	private char m_symbol;
	
	public Pyramid(int height, char symbol)
	{
		m_height = height;
		m_symbol = symbol;
	}
	private void drawLine(int width) {
		for (int i = 1; i <= width; i++)
			System.out.print(m_symbol + " ");
		System.out.println();
	}
	public void draw() {
		for (int i = 1; i <= m_height; i++)
			drawLine(i);
		for (int j = m_height-1; j >=1; j--)
			drawLine(j);
	}
	public static void main(String[] args) {

        if (args == null || args.length < 2) {
        	System.out.println("Program should have height and symbol parameters");
        	return;
        }
		int height = Integer.parseInt(args[0]);
		char sym = args[1].charAt(0);
		Pyramid p = new Pyramid(height, sym);
		p.draw();

	}

}

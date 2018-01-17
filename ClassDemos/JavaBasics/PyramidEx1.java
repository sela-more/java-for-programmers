
public class PyramidEx1 {

	public static void print(String character , int height){
		for (int i=0;i < height; i++)
			printLine(character, i);
		for (int i=height;i >0; i--)
			printLine(character, i);
	}
	public static void printLine(String character, int width) {
		for (int i=0; i< width; i++) {
			System.out.print(character);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		print("x",5);
	}

}

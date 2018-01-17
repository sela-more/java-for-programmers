package clock;
class MainClock 
{
	public static void main(String args[])
	{
		Clock c = new Clock();
		Viewer v = new Viewer(c, "###");
		v = new Viewer(c, "@@@");
	}
};
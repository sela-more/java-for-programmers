package Abstract.abstractPackage;
class Main {
	public static void main (String args[]) {
		// try and create an instance of an abstract class
		// see compilation error.

		Base b = new Base(1000);

		// create an instance of the derived.
		Derive d = new Derive(1000);
		d.describeTheValue();
	}
}
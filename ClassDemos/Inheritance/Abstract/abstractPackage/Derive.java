package Abstract.abstractPackage;
class Derive extends Base
{
	public Derive(int val) {
		super(val);
	}
	public void describeTheValue() {
		System.out.println("In this derivation, value means money");
	}
}
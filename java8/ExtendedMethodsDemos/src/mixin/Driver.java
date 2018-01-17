package mixin;

public class Driver {

	public static void main(String[] args) {
		Device d = new Device(new RoutingImpl());
		d.setActive(true);
		

	}

}

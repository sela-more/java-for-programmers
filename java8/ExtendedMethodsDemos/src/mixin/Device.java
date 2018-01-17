package mixin;

public class Device implements Router {

	private Routing _r;


	public Device(Routing r) {
		super();
		this._r = r;
	}


	@Override
	public Routing getRouter() {
		return _r;
	}

}

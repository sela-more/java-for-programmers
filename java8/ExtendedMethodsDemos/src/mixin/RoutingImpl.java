package mixin;

public class RoutingImpl implements Routing {

	private boolean _active;
	@Override
	public boolean isActive() {
		return _active;
	}

	@Override
	public void setActive(boolean active) {
		this._active = active;

	}

	
}

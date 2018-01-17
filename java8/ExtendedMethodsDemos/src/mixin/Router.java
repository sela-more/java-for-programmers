package mixin;

public interface Router extends Routing {
	Routing getRouter();
	 
	default boolean isActive() {
	 return getRouter().isActive(); 
	}
	default void setActive(boolean active) {
		getRouter().setActive(active); 
	}

}

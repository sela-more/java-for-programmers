package BasicExample;


@FunctionalInterface
public interface FilterEmployee {
	public boolean accept(Employee e, int high, int low);

}

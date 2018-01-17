package Set;

import java.util.Comparator;

public class BookByIsbnComp implements Comparator<BookInSetExample> {

	@Override
	public int compare(BookInSetExample first, BookInSetExample second) {
		return (first.m_ISBN.compareTo(second.m_ISBN));
	}

}

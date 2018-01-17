package ArrayEx;

import java.lang.reflect.Array;

public class ArrayFilter<T> {
	
	private T[] _arr ;
	private int _counter;
	private Class<T> _cl;
	
	public ArrayFilter(Class<T> c,int num) {
		_arr =(T[]) Array.newInstance(c,num);
		_cl = c;
	}
	
	
	public void add(T element) {
		if (_counter < _arr.length) {
			_arr[_counter] = element;
			_counter++;
		}
	}
	
	public ArrayFilter<T> createFilteredCopy(FilterInterface<T> filter) {
		ArrayFilter<T> newArr = new ArrayFilter<T>(_cl,_arr.length);
		
		for (T elem : _arr) {
			if (filter.accept(elem))
				newArr.add(elem);
			
		}
		
		return newArr;
	}
	
	public void printAll() {
		
		for (T elem : _arr) {
			if (elem != null)
			System.out.println(elem);
			
		}
		
	}

	public static void main(String[] args) {
		
		ArrayFilter<Person> firstArr = new ArrayFilter<Person>(Person.class, 3);
		firstArr.add(new Person("Michal",21, 2000));
		firstArr.add(new Person("AAA",30, 1000));
		firstArr.add(new Person("ZZZ",40, 5000));
		
		ArrayFilter<Person> result = firstArr.createFilteredCopy((per)->(per.getAge()>29 && per.getSalary() > 900));
		

		result.printAll();
	}

}

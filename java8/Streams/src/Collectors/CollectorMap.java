package Collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorMap {

	public static void main(String[] args) {
		Employee moshe = new Employee("moshe", Gender.Male, 5, 10000);
		Employee david = new Employee("david", Gender.Male, 3, 5000);
		Employee rina = new Employee("rina", Gender.Female, 3, 5000);
		Employee[] emp = new Employee[]{moshe, david, rina};

		Stream<Employee> stream = Stream.of(emp);
		Map<Boolean, List<Employee>> sallary = 
			stream.collect(Collectors.partitioningBy(
			e->e.getSallary() > 5000));
		Stream<Employee> stream2 = Stream.of(emp);
		Map<Gender, List<Employee>> gender = 
				stream2.collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(sallary);
		System.out.println(gender);

	}

}

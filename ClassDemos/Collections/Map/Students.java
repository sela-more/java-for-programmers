package Map;
import java.util.*;

class Students
{
  public static void main(String args[])
  {
    Map<String,Grades> map = new HashMap<String,Grades>();
    map.put("Ted Lee",new Grades(100,52,87));
    map.put("Karli Wugofski",new Grades(99,52,77));
    map.put("Leo Street",new Grades(100,84,87));
    map.put("Patrick Levi",new Grades(67,59,81));
    
    System.out.println("list of students and averages:");
    System.out.println("********************************");  
    print(map);
    System.out.println("List of keys only");
    System.out.println("********************************");  
    printNames(map);
    System.out.println("List of grades only");
    System.out.println("********************************");  
    printGrades(map);
    TreeMap<String,Grades> sortedmap = new TreeMap<String,Grades>(map);
    System.out.println("same list, this time sorted:");
    System.out.println("********************************");  
    print(sortedmap);    
  }

  public static void print(Map<String,Grades> map)
  {
     Set<Map.Entry<String,Grades>> set = map.entrySet(); 
     Iterator<Map.Entry<String,Grades>> it = set.iterator();
     while(it.hasNext())
     {
       Map.Entry<String,Grades> entry = (Map.Entry<String,Grades>)it.next();
       System.out.println(entry.getKey()+ " average is: " +(entry.getValue()).getAverage());
     }
  } 

  public static void printNames(Map<String,Grades> map)
  {
	//show all keys.
	Set<String> keySet = map.keySet();
	Iterator<String> iter = keySet.iterator();
	while(iter.hasNext())
     	{
		String name = (String) iter.next();
		System.out.println(name);
	}
  }
  public static void printGrades(Map<String,Grades> map)
  {
	//Show all values
	Collection<Grades> col = map.values();
	Iterator<Grades> iter = col.iterator();
	while(iter.hasNext())
     	{
		Grades grade = (Grades)iter.next();
		System.out.println(grade);
	}
  }

}
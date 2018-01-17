package list;
import java.util.*;

class MyList
{
  public static void main(String args[])
  {
    List<Book> list = new ArrayList();
    for (int i=0;i<5;i++)
        list.add(new Book(i));
    for (int i=0;i<5;i++)
        list.add(new Book(i));
    System.out.println("Second book on the list: " + ((Book)list.get(1)).getISBN());
    System.out.println("Sixth book on the list: " + ((Book)list.get(6)).getISBN());
    Iterator it = list.iterator();
    while(it.hasNext())
      System.out.println("All books: "+ ((Book)it.next()).getISBN());
    
    // show new iteration format:
    for (Book b : list) {
    	System.out.println(b.getISBN());
    }
  }
}
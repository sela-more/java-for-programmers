package list;
import java.util.*;

class MyStack
{
   LinkedList stack;

   public MyStack()
   {
     stack = new LinkedList();
   }
   public void push(Object o)
   {
     stack.addFirst(o);
   }
   public void pop()
   {
     stack.removeFirst();
   }
  
   public void printAll()
   {
     Iterator it = stack.iterator();
     while(it.hasNext())
       System.out.println("All books: "+ ((Book)it.next()).getISBN());
   }
}
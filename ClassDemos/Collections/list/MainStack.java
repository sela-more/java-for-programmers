package list;
class MainStack
{
  public static void main(String args[])
  {
    MyStack stack = new MyStack();
    for (int i=0;i<10;i++)
      stack.push(new Book(i));
    stack.printAll();
    System.out.println("removing 2 books");
    stack.pop();
    stack.pop();
    stack.printAll();
  }
}
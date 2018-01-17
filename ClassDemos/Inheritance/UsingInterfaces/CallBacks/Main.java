package UsingInterfaces.CallBacks;
class Main
{
  public static void main(String args[])
  {
    Person person = new Person();
    Donkey donkey = new Donkey();
    TaskList task = new TaskList();
    
    task.add(person);
    task.add(donkey);
    
    task.getToWork();
  }

}
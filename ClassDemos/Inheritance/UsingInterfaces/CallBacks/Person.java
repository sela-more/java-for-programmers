package UsingInterfaces.CallBacks;
class Person implements ISleep, IWork
{
  public Person()
  {
 
  }
  public void sleep()
  {
    System.out.println("I'm sleeping 12 hours a day");
  }    
  public void work()
  {
    System.out.println("I'm working 4 hours a day");
  }
}
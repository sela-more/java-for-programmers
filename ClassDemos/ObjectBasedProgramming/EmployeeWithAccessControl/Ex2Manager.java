class Ex2Manager
{
  public static void main(String args[])
   {

	Ex1Worker w1 = new Ex1Worker();
	w1.setSalary(500);
	w1.setAge(50);

	System.out.println("Worker age is: " + w1.getAge());
     // Worker w = new Worker(25,5435);
   }
}
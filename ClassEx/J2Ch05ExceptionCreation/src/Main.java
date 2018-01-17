import java.util.Random;
class Main
{
  public static void main(String args[])
  {
    Main m = new Main();
  }

  public Main()
  {
    Random rand = new Random();
    int myArray[] = {7,3,5,7,5,88,76,90};
    MathStuff math = new MathStuff();
    try
    {
		int randIndex = rand.nextInt(20);
		System.out.println("Going to text this index: " + randIndex);

		System.out.println("Sum = " + math.sumArrayElememnts(myArray,randIndex));
    }
    catch(IllegalArrayIndexException e)
    {
      e.printStackTrace();
    }
  }


}
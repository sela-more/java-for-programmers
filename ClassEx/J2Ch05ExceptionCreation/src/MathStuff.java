class MathStuff
{
  public int sumArrayElememnts(int arr[],int index) throws IllegalArrayIndexException
  {
    try
    {
      int sum=0;
      for (int i=0;i<index;i++)
        sum += arr[i];
      return sum;
    }
    catch(IndexOutOfBoundsException I)
    {
       throw new IllegalArrayIndexException("This index has exceeded the array's bounds --> " +index);
    }
  }
}
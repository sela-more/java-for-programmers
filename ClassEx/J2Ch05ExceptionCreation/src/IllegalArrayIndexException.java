class IllegalArrayIndexException extends Exception
{
  private int m_nIndex;
  public IllegalArrayIndexException() {}


  public IllegalArrayIndexException(String msg)
  {
    super(msg);
  }


  public IllegalArrayIndexException(String msg, int index)
  {
    m_nIndex = index;
  }


  public int getIndex()
  {
    return m_nIndex;
  }

}
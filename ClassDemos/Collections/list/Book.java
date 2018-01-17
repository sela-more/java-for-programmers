package list;

import java.util.HashSet;

class Book //implements Comparable

{
  int m_nISBN;
  public Book(int isbn)
  {
    m_nISBN = isbn;
  }
  
  public int getISBN()
  {
    return m_nISBN;
  }
/*
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Book))
     return false;
    Book b = (Book)obj;
    return b.m_nISBN == m_nISBN;
  }

  public int hashCode()
  {
    return m_nISBN * 31;
  }
  
  public int compareTo(Object o)
  {
    Book b = (Book)o;
    int retValue =0;
    if (b.m_nISBN == m_nISBN)
     retValue = 0;
    else if (m_nISBN < b.m_nISBN)
     retValue = -1;
    else if (m_nISBN > b.m_nISBN)
     retValue = 1;
    return retValue;
  }


*/  
  
  
  
	

}
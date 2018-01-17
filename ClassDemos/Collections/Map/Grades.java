package Map;
class Grades 
{ 
   int m_nYear1, m_nYear2, m_nYear3, m_nTotalYears = 3, m_nTotalSum;

   public Grades(int year1,int year2,int year3) 
   {
     m_nYear1 = year1;
     m_nYear2 = year2;
     m_nYear3 = year3;
   }
   public int getAverage()
   {
     int m_nTotalSum =  m_nYear1 + m_nYear2 + m_nYear3;
     return m_nTotalSum/m_nTotalYears;
   }
   public String toString()
   {
	return("Year1: " + m_nYear1 + " Year2: " + m_nYear2 + " Year3: " + m_nYear3);
   }


}
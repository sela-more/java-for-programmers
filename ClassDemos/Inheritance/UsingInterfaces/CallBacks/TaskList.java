package UsingInterfaces.CallBacks;
class TaskList
{
   IWork m_work[] = new IWork[3];
   int m_last = 0;
   
   public void add(IWork work)
   {
   	if (m_last < m_work.length)
     m_work[m_last++] = work;
        
   }
   public void getToWork() {
   	for (int i=0; i< m_last; i++)
   		m_work[i].work();   
   	
   }


}

package OptionalTimer;
import java.util.Timer;

public class Memo
{
    Timer m_timer;

    public Memo(int seconds) 
    {
        m_timer = new Timer();
        m_timer.schedule(new MemoTask(), seconds*500,seconds*500);
    }    

    public static void main(String args[])
    {     

        new Memo(5);        
    }
}


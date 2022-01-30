package src;

class MyThreadd extends Thread
{
 public void run()
 {
	 for(int i=0;i<10;i++)
		{System.out.println("Child "); 
       }
	 try
	 {
		 Thread.sleep(3000);
	 }
	 catch(InterruptedException e)
	 {}
	 
}}
public class TryCatchFinally {

	public static void main(String[] args) {
		MyThreadd m=new MyThreadd();
		m.start();
	//	m.join();
		
		 for(int i=0;i<10;i++)
			{System.out.println("Main"); 
	       }

	}

}

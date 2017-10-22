package assignment10.prob6;

public class MultiThreadSynchTest {
	public static void main(String[] args)
	{
		MultiThreadSynchTest mt = new MultiThreadSynchTest();
		for(int i=0; i <10; i++)
		{
			mt.multicalls();
			System.out.println("Generating the Thread " + mt.q.countElements());
		}
	}
	final QueueSynch q = new QueueSynch();
	Runnable r =() ->
	{
		//if (Thread.State.RUNNABLE != null)
		//	System.out.println("Checking the Thread is RUNNABLE or being on wait");
		q.add(0);q.add(0);
		q.remove();
		
	};
	
	public void multicalls()
	{
		
		for(int i = 0; i < 10; ++i) {
			new Thread(r).start();
			
		}
	}
}

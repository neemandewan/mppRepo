package assignment10.prob6;

public class MultiThreadTest {

	public static void main(String[] args)
	{
		MultiThreadTest mt = new MultiThreadTest();
		for(int i=0; i <10; i++)
		{
			mt.multicalls();
			System.out.println("Generating the Thread ");
		}
	}
	
	public static void multicalls()
	{
		final Queue q = new Queue();
		Runnable r =() ->
		{
			
			if (Thread.State.RUNNABLE != null)
				System.out.println("Checking the Thread is RUNNABLE or being on wait");
			q.add(0);q.add(1);
			q.remove();
			
		};
		for(int i = 0; i < 10; ++i) {
			new Thread(r).start();
			
		}
	}
	
	
}

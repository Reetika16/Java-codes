class Mythread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;++i)
		{

			System.out.println("child Thread");
		}
	}
}
class runthread
{
	public static void main(String[] args) 
	{
		//Mythread m=new Mythread();
		Thread t=new Thread(new Mythread());
		t.start();
		for(int i=1;i<=10;++i)
		{
			System.out.println("Main Thread");
		}
	}
}
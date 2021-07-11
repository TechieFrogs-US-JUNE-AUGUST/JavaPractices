
interface Moveable
{
 	int AVG = 40;
 	void move();
}

class SampleInterface implements Moveable
{
 	public void move()
 	{
  		System.out.println("Average speed is"+AVG);
 	}
 	public static void main (String[] arg)
 	{
        SampleInterface vc = new SampleInterface();
  		vc.move();
 	}
}
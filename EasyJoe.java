import java.util.LinkedList;
import java.util.Queue;

public class EasyJoe
{
  public static Queue<Integer> queue;
  
  public static void main(String[] args)
  {
    int soldiers = Integer.parseInt(args[0]);
	
	queue = new LinkedList<Integer>();
	for(int i = 0; i < soldiers; i++)
	{
		queue.add(i);
	}
	System.out.println(survivor(soldiers));
  }
  
  public static int survivor(int s)
  {
  	if (s == 1)
  		return 1;
  	else
  	{
		return (survivor(s - 1) + 1) % s + 1;
	}
  }
}

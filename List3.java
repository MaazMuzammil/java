import java.util.*;

public class List3 
{
	public static void main(String[] args) 
	{
	    LinkedList l = new LinkedList();
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the Number of element : ");
	    int num = scan.nextInt();
	    scan.nextLine();
	    do
	    {
	        l.add(scan.nextLine());
	        num--;
	    } 
	    while (num > 0);
	    System.out.println(l);
  
	    System.out.println("Enter Duplicate data to remove:");
	    Object obj=scan.nextLine();
	    while(true)
		{
			if(l.contains(obj)==true)
			{
				l.remove(obj);
			}
			else
			{
				break;
			}
		}
	    System.out.println(l);
	}
}

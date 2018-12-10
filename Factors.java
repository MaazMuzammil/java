import java.util.*;

public class Factors {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.print("Factors of " + num + " are: ");
		System.out.println();
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i+ " ");
			}
		}
	}
}

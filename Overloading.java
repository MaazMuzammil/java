
public class Overloading 
{
	public void compare(int a, int b)
	{
		int max=Math.max(a, b);
		System.out.println(max);
	}
	
	public void compare(char a, char b)
	{
		char max=(char) Math.max(a, b);
		System.out.println(max);
	}
	
	public void compare(String a, String b)
	{
		if(a.length() > b.length())
		{
			System.out.println(a);
		}
		else if(a.length() < b.length())
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
		}
	}
}

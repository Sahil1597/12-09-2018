import java.util.*;


class pallindrome
{
	
	String str1 = "";
	String temp;
	
	int i,j,len;
	
	void input(String str)
	{
		len = str.length();
		temp = str;
		
		for(i=len-1;i>=0;i--)
		{
		str1 = str1 + str.charAt(i);	
		}
	}

	boolean output()
	{
		if(str1.equals(temp))
		return true;
		else
		return false;
	}
}

public class Q1
{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();

	pallindrome obj = new pallindrome();
	obj.input(s);
	System.out.println(obj.output());	
	}
}
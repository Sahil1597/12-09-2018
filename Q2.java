import java.util.*;
class toggle
{
	int i,j,len;
	String str1,str2 = "";
	char ch;
	
	void input(String str)
	{
		len = str.length();
		
		for(i=0;i<len;i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{	
			j = (int)str.charAt(i);
			str2 = str2 + (char)(j-32);	
			}
			
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
			j = (int)str.charAt(i);	
			str2 = str2 + (char)(j+32);	
			}
			
			else
			{
			str2 = str2 + str.charAt(i);	
			}
		}
	}
	
	public String output()
	{
	return str2;	
	}
}

public class Q2
{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string ");
	String s = sc.nextLine();
	
	toggle obj = new toggle();
	obj.input(s);
	System.out.println("String after toggling is : "+obj.output());
	}
}
import java.util.Scanner;

class frequency
{
	 char MaxFreq(String str)
	{
		int i=0,pos = 0,len=str.length();
		char ch = str.charAt(i);
		int freq[] = new int[26];
		while(i<len)
		{
			ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				freq[(ch-65)]++;
			else if(ch >= 'a' && ch <= 'z')
				freq[(ch-97)]++;
			i++;
		}
		int max = freq[0];
		for(i=0;i<26;i++)
		{
			if(max < freq[i])
			{
				max = freq[i];
				ch = (char)(i+65);
			}
		}
		return ch;
	}
}
	
class Q3
{
	public static void main(String[] args)
	{
		frequency obj = new frequency();
		
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("String : " + str);
		char a = obj.MaxFreq(str);
		System.out.println("Character with max frequency : '" +a+ "'");
		System.out.println();
	}
}

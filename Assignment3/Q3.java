//3) How to program to print first non repeated character from String?
import java.util.*;

class Q3
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);	
		System.out.println("\nEnter the String::");
		String str=sc.nextLine();			
		
		int flag=0;
		System.out.println("Unique Characters are:: ");
		
		StringBuffer s=new StringBuffer(str);
		for(int i=0;i<s.length();i++)
		{
			flag=0;
			for(int j=i+1;j<s.length();j++)
			{	
				
				if(s.charAt(i)==s.charAt(j))
				{
					flag=1;
					s.deleteCharAt(j);
					j--;	
					break;
				}
				
				
			}
			if(flag==0)
			{
				System.out.println(s.charAt(i));
			}
		}
	}				
			
}
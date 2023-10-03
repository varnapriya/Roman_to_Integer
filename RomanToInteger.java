import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
	
		RomanToInteger ri=new RomanToInteger();
		System.out.println("Enter the Roman Value:");
		 @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		 String r=scan.next();
		 System.out.println("String length:"+r.length());
		//String r="III";
		 
		 System.out.println(" Equalent Integer is:" +ri.romanToInt(r));

	}

	 Long romanToInt(String rr) {
		int total=0;
		RomanToInteger ri=new RomanToInteger();
		for(int i=0;i<rr.length();i++)
		{
			System.out.println(rr.charAt(i));	
			int s1=ri.romanChar(rr.charAt(i));
			if((i+1)<rr.length())
			{
			int s2=ri.romanChar(rr.charAt(i+1));	
		if(s1>=s2)
		{	
			 total=total+s1;
					
		}
		else
		{	
			 total=total-s1;
					
		}
			}
			else
			{
				total=total+s1;
			}
	}
		return (long) total;
	}	
	 int romanChar(char c )
	 {
		if(c=='I')
		{
		  return 1;	
		}
		else if(c=='V')
		{
			return 5;
		}
		else if(c=='X')
		{
			return 10;
		}
		else if(c=='L')
		{
			return 50;
		}
		else if(c=='C')
		{
			return 100;
		}
		else if(c=='D')
		{
			return 500;
		}
		else if(c=='M')
		{
			return 1000;
		}
		else
		return -1;
	 }

}

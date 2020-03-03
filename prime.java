import java.io.*;
import java.util.*;
class prime
{
	public static void main(String args[])
	{
		if(args.length==1)
		{
			int n=Integer.parseInt(args[0]);
			System.out.println("Prime numbers are :");
			for(int i=0;i<=n;i++)
			{
				int f=0;
				for(int j=1;j<=n;j++)
				{
					if(i%j==0)
						f++;
				}
				if(f==2)
					System.out.println(i);
			}
		}
		else
			System.out.println("Enter only one argument");
	}
}
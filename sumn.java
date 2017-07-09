/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum = 0;
		int x;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		for(int i = 1;i <= x;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+x+" Numbers are:" + sum);
	}
}
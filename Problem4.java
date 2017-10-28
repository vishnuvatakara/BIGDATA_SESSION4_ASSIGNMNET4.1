package probles;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the the numbers");
		//reading two numbers
		Scanner ss = new Scanner(System.in); 
		int x=ss.nextInt();
		int y=ss.nextInt(); 
		//processing even and odd checking
		if(x<y)
		{
			for(int i=x;i<=y;++i)
			{
				if(i%2==0)
				{
					System.out.println(i+" even");
				}
				else
					System.out.println(i+" odd");
			}
		}
		else
		{
			for(int i=y;i<=x;++i)
			{
				if(i%2==0)
				{
					System.out.println(i+" even");
				}
				else
					System.out.println(i+" odd");
			}
		}

	}

}

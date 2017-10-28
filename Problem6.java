package probles;

public class Problem6 {
	
		void add(int a, int b)//method overloading
		{
		            System.out.println("Sum of two="+(a+b));
		}

		void add(int a, int b,int c)//method overloading
		{
		            System.out.println("Sum of three="+(a+b+c));
		}
		
	     public static void main(String args[])
		      {
		            Problem6 s=new Problem6();
		            s.add(10,15);
		            s.add(10,20,30); 
		   }
		 }


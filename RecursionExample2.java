import java.util.Scanner;
class RecursionExample2
{
	static int n1=0,n2=1,n3=0;
	static void fibonaci(int count){
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			fibonaci(count-1);
		}
	}
	public static void main(String[] args)
	{
		int count=10;
		System.out.println(n1+" "+n2);
		fibonaci(count-2);
	}
}
			
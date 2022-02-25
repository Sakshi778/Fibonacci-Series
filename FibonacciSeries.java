package fibonacciSeries;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// fibonacci series
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int i;
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1+" "+n2);
		for (i=2;i<n;i++)
		{
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}

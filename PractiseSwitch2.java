//Menu Driven for Arithmetic Operation
import java.lang.*;
import java.util.*;
class PractiseSwitch2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("======");
		System.out.println("Add");
		System.out.println("Sub");
		System.out.println("Mul");
		System.out.println("Div");
		System.out.println("======");
		System.out.println("Enter 2 Numbers: ");

		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Option in Words: ");
		String option=sc.nextLine();
		option=option.toUpperCase();
		
		switch(option)
		{
			case "ADD" :System.out.println("Addition is "+(x+y));
					break;
			case "SUB" :System.out.println("Substraction is "+(x-y));
					break;
			case "MUL" :System.out.println("Multiplication is "+(x*y));
						break;
			case "DIV" :System.out.println("Division is "+(x/y));
					break;
			default: System.out.println("Invalid");

					break;
		}
	}
}
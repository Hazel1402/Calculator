import java.util.Scanner;
// Program to Calculate different Operations
public class Main 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Operations result = new Operations(); 
		int operator;
		float num1=0, num2=0;
		
		while(true)
		{
		System.out.println("!.......Calculator.........!");
		System.out.println(" 1. Addition + ");
		System.out.println(" 2. Subtraction - ");
		System.out.println(" 3. Multiplication * ");
		System.out.println(" 4. Divsion / ");
		System.out.println(" 5. Exit");
		System.out.print(" Please enter the number Coresponding to the operation to Perform : ");
		operator = input.nextInt();
		System.out.println();


		switch(operator)
		{
			case 1: System.out.println("..........Addition..........!");
					System.out.print(" Enter the first number : ");
					num1 = input.nextInt();
					System.out.print(" Enter the Second number : ");
					num2 = input.nextInt();
					System.out.println(" Result : " +Operations.addition(num1,num2)+"\n\n\n");
					break;
					
			case 2: System.out.println("..........Subtraction..........!");
					System.out.print(" Enter the first number : ");
					num1 = input.nextInt();
					System.out.print(" Enter the Second number : ");
					num2 = input.nextInt();
					System.out.println(" Result : " +Operations.subtraction(num1,num2)+"\n\n\n");
					break;
					
			case 3: System.out.println("..........Multiplication..........!");
					System.out.print(" Enter the first number : ");
					num1 = input.nextInt();
					System.out.print(" Enter the Second number : ");
					num2 = input.nextInt();
					System.out.println(" Result : " +Operations.multiplication(num1,num2)+"\n\n\n");
					break;
					
			case 4: System.out.println("..........Division..........!");
					System.out.print(" Enter the first number : ");
					num1 = input.nextInt();
					System.out.print(" Enter the Second number : ");
					num2 = input.nextInt();
					System.out.println(" Result : " +Operations.division(num1,num2)+"\n\n\n");
					break;
					
			case 5 : System.exit(0);
		}
		}
	}
}

import java.util.*;
public class Calculator {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
// user inputs and values
	System.out.print("Enter first num: ");
	int x = input.nextInt();
	System.out.print("Select operator +, -, *, /: ");
//charAt gets specific char of a string,picked 0 charAt(0) because it means 1st char, 2nd char use 1, charAt(1) 
	char op = input.next().charAt(0);
	System.out.print("Enter 2nd num: ");
	int y = input.nextInt();
// switch statements
	switch (op) {
	case '+':
		System.out.println(x + y);
		break;
	case '-':
		System.out.println(x - y);
		break;
	case '*':
		System.out.println(x * y);
	case '/':
		System.out.println(x / y);
	default:
		System.out.println("Invalid operator/number");
		}
	
	}
}
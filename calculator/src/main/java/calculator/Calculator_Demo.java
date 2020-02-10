package calculator;
import java.util.*;
public class Calculator_Demo {
public static void main(String args[]) {
	int a,b,c,choice;
	char op;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	a=sc.nextInt();
	System.out.println("Enter second number:");
	b=sc.nextInt();
	/*System.out.println("Enter an arithmetic operator:");
	op=sc.next().charAt(0);*/
	System.out.println("1.Add\n2.Subtract\n3.Multiplication\n4.Division\n5.Modulus\n");
	System.out.println("Enter the choice:");
	choice=sc.next().charAt(0);
	switch(choice)
	{
	case '1':
	{
		c=a+b;
	 	System.out.println("Addition of "+a+" "+b+"is"+c);
	 	break;
	}
	case '2':
	{
		if(a>b)
		{
			c=a-b;
			System.out.println("Subtraction of "+a+" "+b+" is:"+c);
		}
		else
		{
			c=b-a;
	 	System.out.println("Subtraction of "+b+" "+a+" is:"+c);
		}
	 	break;
	}
	case '3':
	{
		c=a*b;
	 	System.out.println("Multiplication of "+a+" "+b+"is"+c);
	 	break;
	}
	case '4':
	{
		c=a/b;
	 	System.out.println("Division of "+a+" "+b+"is"+c);
	 	break;
	}
	case '5':
	{
		c=a%b;
	 	System.out.println("Modulus of "+a+" "+b+"is"+c);
	 	break;
	}
	default:
		System.out.println("You entered a wrong choice:");
	    return;
	}
}
}

package btgt.btc4;

import java.util.Scanner;

public class bai1 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("a= ");
	int a = sc.nextInt();
	
	System.out.println("b=");
	int b = sc.nextInt();
	
	
	try {
		System.out.println("a / b =" + a /b);
		
	}
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException" +e.getMessage());
	}
}
}

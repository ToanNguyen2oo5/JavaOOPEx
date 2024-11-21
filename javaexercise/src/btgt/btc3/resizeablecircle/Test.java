package btgt.btc3.resizeablecircle;

import java.util.Scanner;

public class Test {public static void main(String[] args) {
	

try (Scanner sc = new Scanner(System.in)) {
	System.out.println("nhap ban kinh r");
	
	double n = sc.nextDouble();
	
	ResizeableCircle r1 =new ResizeableCircle(n);
	System.out.println("Dien tich:" +r1.getArea());
	System.out.println("Chu vi: " + r1.getPerimeter());
	
	System.out.println("thay doi ban kinh r= ");
	int m = sc.nextInt();
	r1.resize(m);
	
	System.out.println("Dien tich hinh tron sau khi thay doi kich co la: " + r1.getArea());
	
	System.out.println("Chu vi hinh tron sau khi thay doi kich co la:"  + r1.getPerimeter());
}
}
}

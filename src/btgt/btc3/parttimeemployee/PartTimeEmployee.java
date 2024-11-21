package btgt.btc3.parttimeemployee;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
private int hourPerWeek;

public PartTimeEmployee() {
	
}
 public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hourPerWeek) {
	super(name, age, gender, employerName, dateHired);
	this.hourPerWeek = hourPerWeek;
}
public int getHourPerWeek() {
	return hourPerWeek;
}
public void setHourPerWeek(int hourPerWeek) {
	this.hourPerWeek = hourPerWeek;
}


public void NhapTT() {
	super.NhapTT();
	Scanner sc= new Scanner(System.in);
	System.out.println("gio lam moi tuan ");
	this.hourPerWeek=sc.nextInt();
	
	
}
}

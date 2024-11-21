package btgt.btc3.parttimeemployee;

import java.util.Scanner;

public class Employee extends Person {
	protected String employerName;
	protected String dateHired;
	
	public Employee() {
		
	}

	public Employee(String name, int age, char gender, String employerName, String dateHired) {
		super(name, age, gender);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public void NhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap TT Nvien");
		System.out.println("employerName ");
		this.employerName= sc.next();
		System.out.println("date hired ");
		this.dateHired=sc.next();
		
		
	
	}
	
	@Override
	public String toString() {
		return "Employee [employerName=" + employerName + ", dateHired=" + dateHired + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
	
}

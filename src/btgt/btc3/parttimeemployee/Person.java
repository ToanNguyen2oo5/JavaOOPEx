package btgt.btc3.parttimeemployee;

import java.util.Scanner;

public class Person {
	protected String name;
	protected int age;
	protected char gender;
	
	public Person() {
		
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void NhapTT() {
		Scanner sc=new Scanner(System.in);
		System.out.println("name ");
		this.name =sc.next();
		System.out.println("age ");
		this.age= sc.nextInt();
		System.out.println("gender");
		this.gender= sc.next().charAt(0);
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}

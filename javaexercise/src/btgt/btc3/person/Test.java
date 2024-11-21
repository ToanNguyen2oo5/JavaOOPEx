package btgt.btc3.person;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		
		//kiem tra setter()
		p.setName("A");
		p.setDob("01/01/2001");
		p.setPob("VN");
		p.setGender('M');
		p.setEmail("abc@gmail.com");
		p.setPhone("0123456789");
		
		//kiem tra cac setter()
		System.out.println("name:" + p.getName());
		System.out.println("day of birth: " + p.getDob());
		System.out.println("place of birth: " + p.getPob());
		System.out.println("gender: " + p.getGender());
		System.out.println("email: "+ p.getEmail());
		System.out.println("phone: " + p.getPhone());
		
		//kiem tra toString()
		System.out.println(p.toString());
	}

}

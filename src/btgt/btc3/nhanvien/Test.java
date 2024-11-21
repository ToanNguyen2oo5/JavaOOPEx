package btgt.btc3.nhanvien;

public class Test {
	public static void main(String[] args) {
		DiaChi dc1 = new DiaChi("abc","xyz","camgiang","hai duong");
		NhanVien nv1 = new NhanVien("sha",dc1,"5/5/2005",'M');
		System.out.println(nv1.toString());
	}
}

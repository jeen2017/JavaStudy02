import bit.data.AutoData;

public class J09 {
	public static void main(String[] args) {
		// Q) [����/�Ǽ�/����]�� ������ ������ �����Ͻÿ�.
		AutoData a;
		a=new AutoData();
		a.d1=10;
		a.d2=45.6f;
		a.d3='A';
		a.d4=true;
		
		System.out.println(a.d1);
		System.out.println(a.d2);
		System.out.println(a.d3);
		System.out.println(a.d4);
	}
}

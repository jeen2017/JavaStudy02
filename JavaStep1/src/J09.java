import bit.data.AutoData;

public class J09 {
	public static void main(String[] args) {
		// Q) [정수/실수/문자]를 저장할 변수를 선언하시오.
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

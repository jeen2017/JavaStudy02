import bit.data.AutoData;
import bit.data.BookDTO;

public class J10 {
	public static void main(String[] args) {
		// 정수 1개를 저장할 [변수를 선언] 하시오.
		int a;
		a=10;
		// 책 1권을 저장할 변수를 선언 하시오.
		BookDTO b=new BookDTO(); // 객체생성(★★★★★★★)
		b.title="자바";
		b.price=20000;
		b.name="박자바";
		b.page=700;
		
		System.out.println(b.title+"\t"+b.price+"\t"+b.name+"\t"+b.page);
		// Q) 정수/실수/문자 를 저장할 변수를 선언 하시오.
		// AutoData c;
	}

}

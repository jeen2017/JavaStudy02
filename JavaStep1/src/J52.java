import bit.edu.BookVO;

public class J52 {
	public static void main(String[] args) {
	// 정수        실수     문자      부울         : 기본자료
	// int, float, char, boolean : 기본자료형
	// int[], float[], char[], boolean[] : 배열자료형
	
//		Q) 정수 1개를 저장할 변수를 선언 하시오.
		int a;
		a=10;
		
//		Q) 책 1권을 저장할 변수를 선언 하시오.
		BookVO b;
		b=new BookVO(); // BookVO() → 객체를 생성하는 메서드(생성자메서드)
		b.setTitle("자바");
		b.setPrice(20000);
		b.setCompany("이지스퍼블리싱");
		b.setPage(600);
		
//		System.out.println(b.getTitle()+"\t"+b.getPrice()+"\t"+b.getCompany()+"\t"+b.getPage()+"\t");
		System.out.println(b); // b는 b.toString() 과 동일
	}
}

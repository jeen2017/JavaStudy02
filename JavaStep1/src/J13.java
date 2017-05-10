public class J13 {
	public static void main(String[] args) {
		// 연산자: 단항연산자, 이항연산자, 삼항연산자, 대입연산자, 복합연산자
		// 단항연산자 : ++(1증가), --(1감소)
		int a=10;
		a=a+1;
		a++;
		++a;
		System.out.println(a);
		
		int x=1;
		System.out.println(++x); // 2
		System.out.println(++x); // 3
		System.out.println(x++); // 3
		System.out.println(x);   // 4
		
		int y=2;
		System.out.println(--y); // 1
		System.out.println(y--); // 1
		System.out.println(y--); // 0
		System.out.println(--y); // -2
				
	}

}

/* 
 1.변수
 2.DataType
 3.할당(=)
 4.변수선언
 5.배열(Arrary)
 6.클라스(Class)
 7.객체생성(인스턴스)
 8.new 연산자
 9.생성자메서드
 10.패키지(package)
 */
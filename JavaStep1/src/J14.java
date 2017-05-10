public class J14 {
	public static void main(String[] args) {
		// 이항연산자 - 산술연산자(+, -, *, /(몫), %(나머지))
		int a=10;
		System.out.println(a/3); // 3
		System.out.println(a%3); // 1
		
		int v=a+10*10/2;
		System.out.println(v); // 60
		
		// 관계(대소)연산자(>, <, <=, >=, ==, !=ㅣ) : true 또는 false
		int x=20;
		System.out.println(x/3>2); // true
		System.out.println(x/10==2); // true
		System.out.println(x/10!=2); // false
		System.out.println(x/3<=6); // true
		System.out.println('A'<'a'); // true
		
		// 논리(진리)연산자(&&, ||, !)
		// !(논리부정연산자) → 단항연산자
		// Q)어떤 문자가 대문자인지 판단 해보자
		char c='a';
		System.out.println(c>='A' && c<='Z'); // 대문자 A일때 true  // &&: 동시만족
		System.out.println(c>='A' || c<='Z'); // 소문자 a일때 true  // ||: 또는
		System.out.println(!(c>='A')); // 소문자 a일때 false
	}

}

public class J30 {
	public static void main(String[] args) {
		// 2개의 정수를 더하여 출력 하시오.
		int a=10;
		int b=20;
		// intHap 이라는 메서드를 호출 해보자
		// intHap아 정수값 10, 20을 넘겨줄게 합을 구해서 출력 해주라.
		intHap(a,b); // Method Call → 파라메터 전달(parameter passing)
		System.out.println("종료");
	}
	// Method 생성
	// Q) 매개변수로 정수 2개를 받아서 총합을 구하여 출력하는 매서드를 정의하시오(intHap)
	public static void intHap(int x, int y){
		int sum=x+y;
		System.out.println(sum);
	}
	
}
/*
메서드(Method) : 행위,동작,기능,함수(function)
  [형식](머리(프로토타입,원형,정의부 + 몸(구현부))
    접근제어자 [한정자(static,final)] 리턴타입 메서드이름(매개변수리스트){
 	
 	// 동작을 구현 → 일을 한다 → 결과를 만들어 낸다 → 결과를 돌려주는것(return)
 	return 10;
 	 
 }
  
*/
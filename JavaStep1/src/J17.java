public class J17 {

	public static void main(String[] args) {
		int a=7;
		// Q) a가 홀수인지 짝수 인지 출력(판단)? -> 삼항연산자( ? : )
		String s=(a%2==0) ? "짝수" : "홀수";
		System.out.println(s);
		// Q) a가 홀수인지 짝수 인지 출력?(vkseks) -> 블럭if
		if (a%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");

		}
		
		// Q) 어떤수가 3의 배수이면서 5의 배수인지 판단하여 출력 하시오. (YES, NO)
		int x=15;
		if (x%3==0 && x%5==0) {
			System.out.println("YES");
		} else {
			System.out.println("No");
		}
		
		// Q) 어떤 문자가 소문자인지 판단 하시오.(UPPER, LOWER, NOT)
		char c='g';
		if (c >= 'A' && c<='Z') {
			System.out.println("UPPER");
		} else if(c>='a' && c<='z'){
			System.out.println("LOWER");
		} else{
			System.out.println("대문자도 소문자도 아니다.");
		}
		
		/* Q) 학점 구하기
		 90~100 : A학점
		 80~89  : B학점
		 70~79  : C학점
		 69학점이하 : D학점
		*/
		int jum=85;
		if (jum >= 90 && jum <= 100) {
			System.out.println("A학점");
		} else if(jum >=80 && jum <=89) {
			System.out.println("B학점");
		} else if(jum >=70 && jum <=79) {
			System.out.println("C학점");
		} else if(jum >=0 && jum<70) {
			System.out.println("D학점");
		} else{
			System.out.println("점수는 0~100사이가 유효한 점수 입니다.");
		}
		//-----------------------------------------------------
		int java=76;
		if (java>=0 && java<=100){    // 중첩if문
			if(java>=90){			  // 중첩if문
				System.out.println("A학점");
			}else if(java>=80){
				System.out.println("B학점");
			}else if(java>=70){
				System.out.println("C학점");
			}
		}else{
			System.out.println("점수는 0~100사이가 유효한 점수 입니다.");
		}
	}

}

/* 
조건문(if)
- 형식 (블럭if문)   ------> 다중if문의 형태 --------> 중첩if문의 형태
if(조건식){
 조건이 참인 경우만 실행..
 }else{
 조건이 거짓인 경우만 실행..
 }

선택문(switch-case)
반복문(for, while)
제어문(break, continue)

배열
메소드
*/


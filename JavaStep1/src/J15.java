public class J15 {
	public static void main(String[] args) {
		// 삼항연산자 ①(조건)? ②(참) : ③(거짓)
		
		int a=5;
		char c=(a%2==0) ? 'T' : 'F';
		System.out.println(c); // F(홀수)
		
		int x=15;
		//Q) 어떤수 x값이 3의배수 이면서 5의 배수 이면 Y, 아니면 N(삼항연산자)을 출력
		char z=(x%3==0 && x%5==0) ? 'Y' : 'F';  // && : 동시에 만족
		System.out.println(z);
		
	}

}

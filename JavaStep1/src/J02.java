public class J02 {
	public static void main(String[] args) {
		// 변수, DataType(자료형), 할당
		int a,b;
		a=10;
		b=20;
		int c=a+b;
		System.out.println(c);
		
		long x,y;
		x=10000000000000L;
		y=200;
		
		// Q)실수 2개를 저장할 변수를 만드시오.
		// 실수 : 소수점이있는수 -> 정밀도를 표현
		float f1,f2;
		f1=34.666f;
		System.out.println(f1);
		// 실수 VS 정수의 연관관계
		float x1=35.7f;
		// int x2=x1의 실수값에서 소수점 부분을 날려서 --> 정수로 바꿔라
		int x2=(int)x1; // 형변환(casting) - 다운케스팅(down casting)
		System.out.println(x2);
		
		int y1=37;
		//float y2=y1의 정수값을 ---> 실수로 바꿔라.
		float y2=(float)y1; // 자동 형변환 - 업케스팅(up casting)
		System.out.println(y2);
		// 실수+정수=>실수
	}

}

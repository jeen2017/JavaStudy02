public class J37 {
//			static:한정자(프로그램이 시작하기전에 딱 한번 고정된 위치에 메모리가 할당하도록 만든것)
	public static void main(String[] args) {
		
		float x=36.8f;
		float y=56.7f;
		// x+y=?
		float v=floatHap(x,y);
		System.out.println(v);
	}

	//Q) 실수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 매소드를 정의(floatHap)
	public static float floatHap(float a, float b){
		float c=a+b;
		return c;
	}
}

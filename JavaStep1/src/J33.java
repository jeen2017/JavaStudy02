public class J33 {
	public static void main(String[] args) {
//		메서드호출시 → 매개변수전달기법
//		Call By Value(값) < Call By Reference(번지)
		int a=10;
		int b=20;
		int v=calc(a,b);  // Call By Value 
		System.out.println(v);
		
		float x=34.5f;
		float y=56.7f;
		//x+y=?
		float f=calc(x,y);
		System.out.println(f);
	}
	// Method Overloading (중복정의) : 속도와 무관 하다.
	// 정적바인딩(컴파일 시점에서 호출될 메서드가 결정되는 바인딩(연결))
	// Method Override(재정의) → 속도가 늦어지는 원인이 된다.
	// 동적바인딩(실행시점에서 호출될 메서드가 결정되는 바인딩(연결))
	private static float calc(float x, float y) {
		return (x+y);
	}

	private static int calc(int a, int b) {
		return (a+b);
	}

}

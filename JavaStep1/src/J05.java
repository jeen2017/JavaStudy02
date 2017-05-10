public class J05 {
	public static void main(String[] args) {
		// 변수 : 데이터를 한개만 형태만 저장 가능 (여러개는 저장불가) 
		// 변수는 변할수 있는 수(변수), 고정되어있는 수(상수)
		// 한정자 : final, static
		final int MAX=10;
		// a=15; 수정불가 
		System.out.println(MAX);
		
		//[변수 -> 배열 -> 클래스]
		int a;
		a=10;
		a=20;
		a=30;
		System.out.println(a);
		// Q)정수 여러개를 저장할 변수를 선언하시오.
		int[] b;
		// b에 정수 3개를 저장할 공간을 만들어서 넣으시오.
		b=new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		int sum=b[0]+b[1]+b[2];
		System.out.println(sum); //60
	}

}

public class J07 {
	public static void main(String[] args) {
		int b=10;
		// 정수4개를 저장할 [배열을 생성] 하시오.
		int[] a=new  int[4];  // 선언과 동시에 배열을 생성
		System.out.println(a.length);
		// 모든원소에 10을 저장 하시오.
		a[0]=a[1]=a[2]=a[3]=10;
		// index가 2인 원소를 출력 하시오
		//System.out.println(a[4]); // 예외이름 : ArrayIndexOutOfBoundsException
		//System.out.println(5/0); // ArithmeticException
		System.out.println(a[1]+a[2]);
		//배열은 동일한 여러개의 데이터를 담는,묶는다 바구니
			float f1=34.56f;
			float f2=31.56f;
			float f3=37.56f;
			
			float[] f4=new float[3];
			f4[0]=f1;
			f4[1]=f2;
			f4[2]=f3;
			
			System.out.println(f4.length); //3
			System.out.println(f4);
	}

}

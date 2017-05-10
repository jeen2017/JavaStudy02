public class J49 {
	public static void main(String[] args) {
		// 이동 → 1)한클래스 안에서 다른 메서드로 이동. 2)다른 클래스의 메서드로 이동.
		int a=10;
		int b=20;
		int c=30;
	/*  int[] buf=new int[3];
		buf[0]=a;
		buf[1]=b;
		buf[2]=c;  */
		int[] buf={a,b,c};
		add(buf); // Call By Reference(번지이동)
	}

	private static void add(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		System.out.println(sum);
		
	}
	

}

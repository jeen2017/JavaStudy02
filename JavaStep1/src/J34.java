public class J34 {
	public static void main(String[] args) {
		// Call By Reference(번지)
		int[] a=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		// 모든원소를 더하여 출력
		int v=arrHap(a); // Call By Reference(번지)
		System.out.println(v);
	}
	// Q)매개변수로 정수 여러개를 받아서 총합을 구하여 리턴하는 메서드를 정의(arrHap)
	public static int arrHap(int[] a){
		int sum=0;
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		return sum;
	}
}

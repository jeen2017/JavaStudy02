public class J34 {
	public static void main(String[] args) {
		// Call By Reference(����)
		int[] a=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		// �����Ҹ� ���Ͽ� ���
		int v=arrHap(a); // Call By Reference(����)
		System.out.println(v);
	}
	// Q)�Ű������� ���� �������� �޾Ƽ� ������ ���Ͽ� �����ϴ� �޼��带 ����(arrHap)
	public static int arrHap(int[] a){
		int sum=0;
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		return sum;
	}
}

public class J05 {
	public static void main(String[] args) {
		// ���� : �����͸� �Ѱ��� ���¸� ���� ���� (�������� ����Ұ�) 
		// ������ ���Ҽ� �ִ� ��(����), �����Ǿ��ִ� ��(���)
		// ������ : final, static
		final int MAX=10;
		// a=15; �����Ұ� 
		System.out.println(MAX);
		
		//[���� -> �迭 -> Ŭ����]
		int a;
		a=10;
		a=20;
		a=30;
		System.out.println(a);
		// Q)���� �������� ������ ������ �����Ͻÿ�.
		int[] b;
		// b�� ���� 3���� ������ ������ ���� �����ÿ�.
		b=new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		int sum=b[0]+b[1]+b[2];
		System.out.println(sum); //60
	}

}

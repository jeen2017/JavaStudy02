public class J07 {
	public static void main(String[] args) {
		int b=10;
		// ����4���� ������ [�迭�� ����] �Ͻÿ�.
		int[] a=new  int[4];  // ����� ���ÿ� �迭�� ����
		System.out.println(a.length);
		// �����ҿ� 10�� ���� �Ͻÿ�.
		a[0]=a[1]=a[2]=a[3]=10;
		// index�� 2�� ���Ҹ� ��� �Ͻÿ�
		//System.out.println(a[4]); // �����̸� : ArrayIndexOutOfBoundsException
		//System.out.println(5/0); // ArithmeticException
		System.out.println(a[1]+a[2]);
		//�迭�� ������ �������� �����͸� ���,���´� �ٱ���
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

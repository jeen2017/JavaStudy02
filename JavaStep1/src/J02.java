public class J02 {
	public static void main(String[] args) {
		// ����, DataType(�ڷ���), �Ҵ�
		int a,b;
		a=10;
		b=20;
		int c=a+b;
		System.out.println(c);
		
		long x,y;
		x=10000000000000L;
		y=200;
		
		// Q)�Ǽ� 2���� ������ ������ ����ÿ�.
		// �Ǽ� : �Ҽ������ִ¼� -> ���е��� ǥ��
		float f1,f2;
		f1=34.666f;
		System.out.println(f1);
		// �Ǽ� VS ������ ��������
		float x1=35.7f;
		// int x2=x1�� �Ǽ������� �Ҽ��� �κ��� ������ --> ������ �ٲ��
		int x2=(int)x1; // ����ȯ(casting) - �ٿ��ɽ���(down casting)
		System.out.println(x2);
		
		int y1=37;
		//float y2=y1�� �������� ---> �Ǽ��� �ٲ��.
		float y2=(float)y1; // �ڵ� ����ȯ - ���ɽ���(up casting)
		System.out.println(y2);
		// �Ǽ�+����=>�Ǽ�
	}

}

public class J33 {
	public static void main(String[] args) {
//		�޼���ȣ��� �� �Ű��������ޱ��
//		Call By Value(��) < Call By Reference(����)
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
	// Method Overloading (�ߺ�����) : �ӵ��� ���� �ϴ�.
	// �������ε�(������ �������� ȣ��� �޼��尡 �����Ǵ� ���ε�(����))
	// Method Override(������) �� �ӵ��� �ʾ����� ������ �ȴ�.
	// �������ε�(����������� ȣ��� �޼��尡 �����Ǵ� ���ε�(����))
	private static float calc(float x, float y) {
		return (x+y);
	}

	private static int calc(int a, int b) {
		return (a+b);
	}

}

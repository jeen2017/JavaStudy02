public class J15 {
	public static void main(String[] args) {
		// ���׿����� ��(����)? ��(��) : ��(����)
		
		int a=5;
		char c=(a%2==0) ? 'T' : 'F';
		System.out.println(c); // F(Ȧ��)
		
		int x=15;
		//Q) ��� x���� 3�ǹ�� �̸鼭 5�� ��� �̸� Y, �ƴϸ� N(���׿�����)�� ���
		char z=(x%3==0 && x%5==0) ? 'Y' : 'F';  // && : ���ÿ� ����
		System.out.println(z);
		
	}

}

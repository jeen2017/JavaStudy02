public class J03 {

	public static void main(String[] args) {
		// ����(char) - ���Ϲ��� (����<--|-->�ѱ�, �߱���, �Ϻ���)
		// ����ǥ�� --> 'A'(Char) --> "A"(String)
		// ���ڵ����ʹ� ��ǻ�� ���ο��� ��ġ�� ���� �ȴ�.
		// ��ǻ�ʹ� 0,1 ������ ü�踦 �����Ѵ�.
		// A(��ȣ)--->(65)/(1000001) : ���ڵ����ʹ� ��ġ�ڷ� �̴�.
		// +32����
		// a(��ȣ) ---> (97)
		char c='A'+1;
		System.out.println(c);

		char lower='A'+32; //97(a)
		System.out.println(lower);
		
		char upper='a'-32;
		System.out.println(upper);
		
		// '1'+'1'=2
		int one='1';
		System.out.println(one); //49
		int v=('1'-'0')+('1'-48);
		System.out.println(v); //2
		
	}
}

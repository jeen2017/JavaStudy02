public class J14 {
	public static void main(String[] args) {
		// ���׿����� - ���������(+, -, *, /(��), %(������))
		int a=10;
		System.out.println(a/3); // 3
		System.out.println(a%3); // 1
		
		int v=a+10*10/2;
		System.out.println(v); // 60
		
		// ����(���)������(>, <, <=, >=, ==, !=��) : true �Ǵ� false
		int x=20;
		System.out.println(x/3>2); // true
		System.out.println(x/10==2); // true
		System.out.println(x/10!=2); // false
		System.out.println(x/3<=6); // true
		System.out.println('A'<'a'); // true
		
		// ��(����)������(&&, ||, !)
		// !(������������) �� ���׿�����
		// Q)� ���ڰ� �빮������ �Ǵ� �غ���
		char c='a';
		System.out.println(c>='A' && c<='Z'); // �빮�� A�϶� true  // &&: ���ø���
		System.out.println(c>='A' || c<='Z'); // �ҹ��� a�϶� true  // ||: �Ǵ�
		System.out.println(!(c>='A')); // �ҹ��� a�϶� false
	}

}

public class J16 {
	public static void main(String[] args) {
		// ���Կ����� : L-Value = R-Value;
		// ���մ��Կ����� : ���������+���Կ����ڸ� ����
		// 				+=, -=, *=, /=, %=
		int a=10;
		a+=20; // a=a+20; �� ����
		System.out.println(a); // 30
		
		int x=1;
		//Q) x�� 1�� ������Ű�� ��� ����� ���ÿ�
		++x;
		x=x+1;
		x++;
		x+=1;
		System.out.println(x);	
	}
}

/*
 L-Value = R-Value;
	����	 = ����;	  a=b;
	����	 = ����;   a=b+c;
	����	 =  ��;	  a=20;
	����	 = �޼���ȣ�⹮;	a=sum(10,20);
# ����ǥ���(�������� ��ġ�� ���� ǥ���) �� ����ϴ� ���(stack=����=LIFO)
��inFix : a+b �� �ΰ��߽�
��preFix : +ab �� ��ǻ���߽�
��postFix : ab+
*/
public class J04 {
	public static void main(String[] args) {
		int han='��';
		System.out.println((char)han);  // (char)48149 -> �� 
		
		char name='��';
		System.out.println((int)name);
		//String name="���浿";
		
		boolean t=true;  // true -> 0�̿��� ��(1)
		boolean f=false; // false -> 0
		// boolean�ڷ�� ������ �Ұ���
		// !true --> false
		System.out.println(!f); // !(NOT)
		
		boolean x=true && false; // &&(AND-���ÿ�,�̰�)
		System.out.println(x);
		
		boolean y=true || false; // ||�� OR-�Ǵ� 
		System.out.println(y);
		
	}
}

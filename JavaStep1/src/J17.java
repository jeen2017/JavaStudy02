public class J17 {

	public static void main(String[] args) {
		int a=7;
		// Q) a�� Ȧ������ ¦�� ���� ���(�Ǵ�)? -> ���׿�����( ? : )
		String s=(a%2==0) ? "¦��" : "Ȧ��";
		System.out.println(s);
		// Q) a�� Ȧ������ ¦�� ���� ���?(vkseks) -> ��if
		if (a%2==0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");

		}
		
		// Q) ����� 3�� ����̸鼭 5�� ������� �Ǵ��Ͽ� ��� �Ͻÿ�. (YES, NO)
		int x=15;
		if (x%3==0 && x%5==0) {
			System.out.println("YES");
		} else {
			System.out.println("No");
		}
		
		// Q) � ���ڰ� �ҹ������� �Ǵ� �Ͻÿ�.(UPPER, LOWER, NOT)
		char c='g';
		if (c >= 'A' && c<='Z') {
			System.out.println("UPPER");
		} else if(c>='a' && c<='z'){
			System.out.println("LOWER");
		} else{
			System.out.println("�빮�ڵ� �ҹ��ڵ� �ƴϴ�.");
		}
		
		/* Q) ���� ���ϱ�
		 90~100 : A����
		 80~89  : B����
		 70~79  : C����
		 69�������� : D����
		*/
		int jum=85;
		if (jum >= 90 && jum <= 100) {
			System.out.println("A����");
		} else if(jum >=80 && jum <=89) {
			System.out.println("B����");
		} else if(jum >=70 && jum <=79) {
			System.out.println("C����");
		} else if(jum >=0 && jum<70) {
			System.out.println("D����");
		} else{
			System.out.println("������ 0~100���̰� ��ȿ�� ���� �Դϴ�.");
		}
		//-----------------------------------------------------
		int java=76;
		if (java>=0 && java<=100){    // ��øif��
			if(java>=90){			  // ��øif��
				System.out.println("A����");
			}else if(java>=80){
				System.out.println("B����");
			}else if(java>=70){
				System.out.println("C����");
			}
		}else{
			System.out.println("������ 0~100���̰� ��ȿ�� ���� �Դϴ�.");
		}
	}

}

/* 
���ǹ�(if)
- ���� (��if��)   ------> ����if���� ���� --------> ��øif���� ����
if(���ǽ�){
 ������ ���� ��츸 ����..
 }else{
 ������ ������ ��츸 ����..
 }

���ù�(switch-case)
�ݺ���(for, while)
���(break, continue)

�迭
�޼ҵ�
*/


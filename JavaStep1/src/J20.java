public class J20 {
	public static void main(String[] args) {
		// Q) 1~10������ ���� ¦���� ��� �Ͻÿ�.
		// for --> i:1~10 / if : i%2==0
		for(int i=2; i<=10; i++){
			if(i%2!=0){
			System.out.println(i);
			}
		}
		System.out.println("===========================");
		// Q) 1~30������ ���� 3�� ����̰� 5�� ����� ���� ��� �Ͻÿ�.
		// for : �ݺ�Ƚ���� ���� ���� �Ҷ�...
		for(int i=1; i<=30; i++){
			if(i%3==0 && i%5==0){
				System.out.println(i);
			}
		}
		// Q) while���� �̿��Ͽ� 1~50���� 5�� ����� ��� �Ͻÿ�.
		// �ݺ�Ƚ���� ���� �ϱⰡ ����ﶧ...
		int i=1;
		while(i<=50) {
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
		}
		// Q) ���� A~Z ���
		char alpa='A';
		do{
			System.out.println(alpa);
			alpa++;
		}while(alpa<='Z');
	}
}

/* �ݺ���(while)
 -����(������ ��ó��)
	�ʱⰪ
	while(����) {
		������ ���ΰ�쿡 ����
		������
}
 -����(��ó�� ������)
  do{
 
  }while(����);
 
*/





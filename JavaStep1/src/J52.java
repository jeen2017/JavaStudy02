import bit.edu.BookVO;

public class J52 {
	public static void main(String[] args) {
	// ����        �Ǽ�     ����      �ο�         : �⺻�ڷ�
	// int, float, char, boolean : �⺻�ڷ���
	// int[], float[], char[], boolean[] : �迭�ڷ���
	
//		Q) ���� 1���� ������ ������ ���� �Ͻÿ�.
		int a;
		a=10;
		
//		Q) å 1���� ������ ������ ���� �Ͻÿ�.
		BookVO b;
		b=new BookVO(); // BookVO() �� ��ü�� �����ϴ� �޼���(�����ڸ޼���)
		b.setTitle("�ڹ�");
		b.setPrice(20000);
		b.setCompany("�������ۺ�����");
		b.setPage(600);
		
//		System.out.println(b.getTitle()+"\t"+b.getPrice()+"\t"+b.getCompany()+"\t"+b.getPage()+"\t");
		System.out.println(b); // b�� b.toString() �� ����
	}
}
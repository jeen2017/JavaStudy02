import bit.data.AutoData;
import bit.data.BookDTO;

public class J10 {
	public static void main(String[] args) {
		// ���� 1���� ������ [������ ����] �Ͻÿ�.
		int a;
		a=10;
		// å 1���� ������ ������ ���� �Ͻÿ�.
		BookDTO b=new BookDTO(); // ��ü����(�ڡڡڡڡڡڡ�)
		b.title="�ڹ�";
		b.price=20000;
		b.name="���ڹ�";
		b.page=700;
		
		System.out.println(b.title+"\t"+b.price+"\t"+b.name+"\t"+b.page);
		// Q) ����/�Ǽ�/���� �� ������ ������ ���� �Ͻÿ�.
		// AutoData c;
	}

}

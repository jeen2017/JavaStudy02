import bit.data.MovieVO;

public class J11 {
	public static void main(String[] args) {
		// ��ȭ(�ڷ�:��ü) 1���� ������ [������ ����] �Ͻÿ�
		MovieVO m;
		m=new MovieVO(); // ��ȭ��ü�� ����
		m.title="��";
		m.major="�ֹν�";
		m.price=10000;
		m.step=12;
		
		System.out.print(m.title+"\t");
		System.out.print(m.major+"\t");
		System.out.print(m.price+"\t");
		System.out.print(m.step);
	}

}

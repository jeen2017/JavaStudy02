import bit.data.MovieVO;

public class J35 {
	public static void main(String[] args) {
		
		MovieVO vo=new MovieVO();
		vo.title="��";
		vo.major="�ֹν�";
		vo.price=100000;
		vo.step=10;
		
		ptrMov(vo); // Call By Reference(����)
	}
	// �Ű������� ��ȭ1���� �޾Ƽ� ��ȭ ������ ����ϴ� �޼��带 ���� �Ͻÿ�.(ptrMov)
	public static void ptrMov(MovieVO m){
		System.out.println(m.title+"\t"+m.major+"\t"+m.price+"\t"+m.step);
	}
}

import bit.edu.MovieVO;

public class J54 { // Ŭ���� �� ��ü �� �ν��Ͻ�(���)
	public static void main(String[] args) {
		// Q)��ȭ(Data) 1���� ������ [������ ����] �Ͻÿ�.
		MovieVO v;  // ��ü����
		v=new MovieVO();  // v �� �ν��Ͻ�����, �����ڸ޼��� ȣ��          // ��ü����: new, �����ڸ޼���: MovieVO()
		v.setTitle("���� ���̺�");
		v.setPrice(15000);
		v.setMajor("����");
		v.setLevel(12);
		System.out.println(v);
	}

}
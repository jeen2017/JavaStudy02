import bit.edu.MovieVO;

public class J55 {
	public static void main(String[] args) {
		// ��ȭ 1���� �����ϱ� ���� ��ü���� = �ν��Ͻ�����
		MovieVO v=new MovieVO("���� ���̺�", 15000, "����", 12); // �ʱ�ȭ�� ��������
		System.out.println(v);
		
		MovieVO v1=new MovieVO("��",12000,"�ֹν�",15);
		System.out.println(v1);
		
		MovieVO v2=new MovieVO();
		v2.setTitle("��Ʈ");
		v2.setPrice(10000);
		v2.setMajor("��Ʈ");
		v2.setLevel(10);
		
		System.out.println(v2);
	}

}

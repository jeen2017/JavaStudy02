import bit.data.MovieVO;

public class J26 {
	public static void main(String[] args) {
		// 1. �޸� ��ȯ ���(swap)
		int x=10;
		int y=20;
		// x�� y�� ���� ��ȯ�Ͽ� ��� �Ͻÿ�
		int tmp=x;
		x=y;
		y=tmp;
		System.out.println("x="+x); // 20
		System.out.println("y="+y); // 10
		
		MovieVO m1=new MovieVO();
		m1.title="��";
		MovieVO m2=new MovieVO();
		m2.title="��Ƴ�";
		// m1�� m2�� ���� ��ȯ�Ͽ� ����Ͻÿ�.
		MovieVO imsi=m1;
		m1=m2;
		m2=imsi;
		
		System.out.println(m1.title); //��
		System.out.println(m2.title); //���ϳ�
		
	}

}

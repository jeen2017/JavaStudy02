import bit.data.MovieVO;

public class J12 {
	public static void main(String[] args) {
		MovieVO m1=new MovieVO();  // m1 : (�ν��Ͻ�) ����
		m1.title="��";
		m1.major="�ֹν�";
		m1.price=10000;
		m1.step=12;
		
		MovieVO m2=new MovieVO();  // m2 : (�ν��Ͻ�) ����
		m1.title="���ϳ�";
		m1.major="�׶���";
		m1.price=12000;
		m1.step=10;
		
		System.out.println(m1.title+"\t"+m1.major+"\t"+m1.price+"\t"+m1.step);
		System.out.println(m2.title+"\t"+m2.major+"\t"+m2.price+"\t"+m2.step);
	}
}

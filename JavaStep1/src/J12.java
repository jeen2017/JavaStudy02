import bit.data.MovieVO;

public class J12 {
	public static void main(String[] args) {
		MovieVO m1=new MovieVO();  // m1 : (인스턴스) 변수
		m1.title="명량";
		m1.major="최민식";
		m1.price=10000;
		m1.step=12;
		
		MovieVO m2=new MovieVO();  // m2 : (인스턴스) 변수
		m1.title="모하나";
		m1.major="뚱땡이";
		m1.price=12000;
		m1.step=10;
		
		System.out.println(m1.title+"\t"+m1.major+"\t"+m1.price+"\t"+m1.step);
		System.out.println(m2.title+"\t"+m2.major+"\t"+m2.price+"\t"+m2.step);
	}
}

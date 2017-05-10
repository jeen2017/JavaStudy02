import bit.data.MovieVO;

public class J11 {
	public static void main(String[] args) {
		// 영화(자료:객체) 1편을 저장할 [변수를 선언] 하시오
		MovieVO m;
		m=new MovieVO(); // 영화객체를 생성
		m.title="명량";
		m.major="최민식";
		m.price=10000;
		m.step=12;
		
		System.out.print(m.title+"\t");
		System.out.print(m.major+"\t");
		System.out.print(m.price+"\t");
		System.out.print(m.step);
	}

}

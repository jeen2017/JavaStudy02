import bit.data.MovieVO;

public class J26 {
	public static void main(String[] args) {
		// 1. 메모리 교환 방법(swap)
		int x=10;
		int y=20;
		// x와 y의 값의 교환하여 출력 하시오
		int tmp=x;
		x=y;
		y=tmp;
		System.out.println("x="+x); // 20
		System.out.println("y="+y); // 10
		
		MovieVO m1=new MovieVO();
		m1.title="명량";
		MovieVO m2=new MovieVO();
		m2.title="모아나";
		// m1과 m2의 값을 교환하여 출력하시오.
		MovieVO imsi=m1;
		m1=m2;
		m2=imsi;
		
		System.out.println(m1.title); //명량
		System.out.println(m2.title); //모하나
		
	}

}

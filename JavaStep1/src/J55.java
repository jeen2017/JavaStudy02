import bit.edu.MovieVO;

public class J55 {
	public static void main(String[] args) {
		// 영화 1편을 저장하기 위한 객체생성 = 인스턴스생성
		MovieVO v=new MovieVO("보스 베이비", 15000, "보스", 12); // 초기화는 마음데로
		System.out.println(v);
		
		MovieVO v1=new MovieVO("명량",12000,"최민식",15);
		System.out.println(v1);
		
		MovieVO v2=new MovieVO();
		v2.setTitle("비트");
		v2.setPrice(10000);
		v2.setMajor("비트");
		v2.setLevel(10);
		
		System.out.println(v2);
	}

}

import bit.data.MovieVO;

public class J35 {
	public static void main(String[] args) {
		
		MovieVO vo=new MovieVO();
		vo.title="명량";
		vo.major="최민식";
		vo.price=100000;
		vo.step=10;
		
		ptrMov(vo); // Call By Reference(번지)
	}
	// 매개변수로 영화1편을 받아서 영화 정보를 출력하는 메서드를 정의 하시오.(ptrMov)
	public static void ptrMov(MovieVO m){
		System.out.println(m.title+"\t"+m.major+"\t"+m.price+"\t"+m.step);
	}
}

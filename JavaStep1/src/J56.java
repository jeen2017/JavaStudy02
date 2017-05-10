import bit.edu.MovieVO;

public class J56 {
	public static void main(String[] args) {
		// 영화3편을 저장한 변수를 선언 하시오
		MovieVO[] v=new MovieVO[3]; // 객체배열
		v[0]=new MovieVO("보스", 12000, "보스", 12);
		v[1]=new MovieVO("명량", 12000, "명량", 10);
		v[2]=new MovieVO("비트", 12000, "비트", 15);
		//for~
		for(int i=0; i<v.length; i++){
			System.out.println(v[i].toString());
		}
		
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		// for~
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

}

import bit.edu.MovieVO;

public class J57 {
	public static void main(String[]){
		MovieVO[] v=new MovieVO[3]; // 객체배열
		v[0]=new MovieVO("보스", 12000, "보스", 12);
		v[1]=new MovieVO("명량", 12000, "명량", 10);
		v[2]=new MovieVO("비트", 12000, "비트", 15);
		// 레벨을 기준으로 오름차순 정렬하여 출력 하시오(10,12,15)
		
		int[] a={4,3,1,2,5}; // 1 2 3 4 5
		// 선택정렬(selection sort)
		int tmp;
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+"\t");
		}
}

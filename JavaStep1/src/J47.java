public class J47 {
	public static void main(String[] args) {
		// 빈도수 구해서 출력(범위:1~5)
		int[] a={5,1,3,5,1,1,2,3,3,4};
		int[] c=new int[5];
		for(int i=0; i<a.length; i++){
			c[a[i]-1]++;
		}
		for(int i=0; i<c.length; i++){
			System.out.println((i+1)+":" + c[i]);
		}
	}

}

/*
1:3
2:1
3:3
4:1
5:2
*/
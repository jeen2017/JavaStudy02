public class J48 {
	public static void main(String[] args) {
		int[] a={1,2,5,2,4,3,1,2,2,5,4,3,1,5};
		int[] c=new int[5];
		for(int i=0; i<a.length; i++){
			c[a[i]-1]++;
		}
		for(int i=0; i<a.length; i++){
			System.out.print((i+1)+":" + c[i]+"(");
			for(int j=0; j<c[i]; j++){
				System.out.print("*");
			}
			System.out.println(")");
		}
	}
}
/*
1�� ���� : 3(***)
2�� ���� : 5(*****)
3�� ���� : 2(**)
4�� ���� : 2(**)
5�� ���� : 3(***)
*/

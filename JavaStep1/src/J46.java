public class J46 {
	public static void main(String[] args) {
		
		// 빈도수 구하기 (범위:1~5)
		int[] a={5,1,3,5,1,1,2,3,3,4};
		int a1, a2, a3, a4, a5;
		a1=a2=a3=a4=a5=0;
		for(int i=0; i<a.length; i++){
			switch (a[i]) {
			case 1:
				a1++;
				break;
			case 2:
				a2++;
				break;
			case 3:
				a3++;
				break;
			case 4:
				a4++;
				break;
			case 5:
				a5++;
				break;
		    default:
			break;
		}
		
	}
		System.out.println(1+":" );
	}

}

/*
1 : 3번
2 : 1번
3 : 3번
4 : 1번
5 : 2번
*/
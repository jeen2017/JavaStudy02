public class J46 {
	public static void main(String[] args) {
		
		// �󵵼� ���ϱ� (����:1~5)
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
1 : 3��
2 : 1��
3 : 3��
4 : 1��
5 : 2��
*/
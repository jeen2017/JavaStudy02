public class J41 {
	public static void main(String[] args) {
		// 5. 검색(데이터가 사전에 오름차순정렬 되어있다)
		// → 데이터의 중앙에 있는 중앙값고 비교하는 방법이 가장 좋다.
		// → 이진검색(binary search)
		// 		  0  1  2  3  4  5  6  7  8   9  → index(position)
		// 순차검색(데이터량이 소량인 경우)
		int[] a={10,20,30,40,50,60,70,80,90,100};
		int sd=70; // index=6
		int index=-1;
		for(int i=0; i<a.length; i++){
			if(sd==a[i]){
//				System.out.println(i); //6
				index=i;
				break;
			}
		}
		if(index!=-1){
			System.out.println(index);
		}else{
			System.out.println("실패");
		}
	}

}

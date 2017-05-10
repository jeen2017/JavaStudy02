public class J50 {
	public static void main(String[] args) {

		int[] a={108,32,12,56,43,67,99,81,20,78};
		int sd=43;
		int index = 0;
		boolean flag = false;
		// Q) 43은 몇번째 index에 존재하는지 검색하여 출력하시오.(단 이진검색을 이용)
		// 힌트: 사전에 데이터를 오름차순 정렬(선택정렬) 후 이진검색을 하면 된다.
		// selection sort
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
					
					}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+"\t");
		}
		int low=0;
		int high=a.length-1;
		int middle;
//		int index=-1;
		while(low<=high){
			middle=(low+high)/2;
			if(sd==a[middle]){
				index=middle;
				break;
			}else if(sd > a[middle]){
				low=middle-1;
			}
		} //while
		if(index!=-1){
			System.out.println(sd+" 는 index "+index);
			
		}
	}
}
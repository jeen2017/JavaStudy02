public class J50_test {
	public static void main(String[] args) {

		int[] a={108,32,12,56,43,67,99,81,20,78};
		int sd=43;
		int index = 0;
		boolean flag = false;
		// Q) 43은 몇번째 index에 존재하는지 검색하여 출력하시오.(단 이진검색을 이용)
		// 힌트: 사전에 데이터를 오름차순 정렬(선택정렬) 후 이진검색을 하면 된다.
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
					if(a[i] == sd){
						flag=true;
						index=i;
					}
				}
				if(flag){
					System.out.println(sd+"를 "+(index)+"번째 위치에서 찾았습니다.");
				}else{
					System.out.println("찾지 못했습니다.");
				}
			}		
		}
	}
}
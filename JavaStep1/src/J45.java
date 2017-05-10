public class J45 {
	public static void main(String[] args) {

		char[] a={'C','H','R','O','M','E'}; // CEHMOR
		// 알파벳을 오름차순 정렬하여 출력 하시오.
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					char tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"\t");
		}
	}
}


//C E H M O R


public class J44 {
	public static void main(String[] args) {

		// ����(sorting) : ��������, ��������
		int[] a={4,3,1,2,5};
		// ��������(selection sort) : quick sort
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] < a[j]){
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+"\t");
		}
	}
}

//5	
//4	
//3	
//2
//1
public class J40 {
	public static void main(String[] args) {
		// 4. �ִ밪, �ּҰ�
		int[] a={4,3,1,2,5};
		
		int max=a[0]; //Integer.MIN_VALUE; // �ִ밪(5)
		int min=a[0]; //Integer.MAX_VALUE; // �ּҰ�(1)
		
		for(int i=0; i<a.length; i++){
			if(max<a[i]) max=a[i];
			if(min>a[i]) min=a[i];
		}
		
		System.out.println("MAX:"+max);
		System.out.println("MIN:"+min);
	}

}

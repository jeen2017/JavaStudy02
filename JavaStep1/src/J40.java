public class J40 {
	public static void main(String[] args) {
		// 4. 최대값, 최소값
		int[] a={4,3,1,2,5};
		
		int max=a[0]; //Integer.MIN_VALUE; // 최대값(5)
		int min=a[0]; //Integer.MAX_VALUE; // 최소값(1)
		
		for(int i=0; i<a.length; i++){
			if(max<a[i]) max=a[i];
			if(min>a[i]) min=a[i];
		}
		
		System.out.println("MAX:"+max);
		System.out.println("MIN:"+min);
	}

}

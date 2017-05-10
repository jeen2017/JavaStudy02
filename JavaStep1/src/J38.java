public class J38 {
	public static void main(String[] args) {

		float x=36.8f;
		float y=56.7f;
		
		J38 obj=new J38();
		float v=obj.floatHap(x, y);
		System.out.println(v);
	}

	public float floatHap(float a, float b){
		float c=a+b;
		return c;
	}
}

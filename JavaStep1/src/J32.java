public class J32 {
	public static void main(String[] args) {
		int start=50;
		int end=150;		   // 시그니처(signature)
		int v=sum(start, end); // 메서드 호출조건 → (개수,타입)
		System.out.println(v);
	}
	// 매개변수로 2개의 정수를 받아서 / 두수사이의 총합을 구하여 리턴하는 메서드를 정의.(sum)
	public static int sum(int s, int e){
		int hap=0;
		for(int i=s; i<=e; i++){
			hap+=i;
		}
		return hap;
	}
}

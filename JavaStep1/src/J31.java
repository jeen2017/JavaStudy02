public class J31 {
	public static void main(String[] args) {
			int v=twoHap(1,2);
			System.out.println(v);
	}
	// Q)매개변수로 정수 2개를 받아서 / 총합을 구하여/ 리턴하는 / 메서드를 정의(twoHap)
	public static int twoHap(int a, int b){
		int sum=a+b;
		return sum; // return은  결과값을 메서드이름(변수역할)에 담아서 리턴한다.
	}
}

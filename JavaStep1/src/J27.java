public class J27 {
	public static void main(String[] args) {
		// 2. 누적하는 방법
		// 1~10까지 총합을 구하여 출력 하시오.
		int sum=0;
		for(int i=1; i<=100; i++){
			//sum=sum+i;
			sum+=i;
		}
		System.out.println(sum);
		
		// Q) 1~10까지의 수중 짝수의 합과 홀수의 합을 각각 구하여 출력 하시오.
		int even=0; // 짝수의합
		int odd=0;  // 홀수의합
		for(int i=1; i<=10; i++){
			if(i%2==0) {
				even+=i;
			}else{
				odd+=i;
			}
		}
		System.out.println("even="+even);
		System.out.println("odd="+odd);
	}

}


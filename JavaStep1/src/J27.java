public class J27 {
	public static void main(String[] args) {
		// 2. �����ϴ� ���
		// 1~10���� ������ ���Ͽ� ��� �Ͻÿ�.
		int sum=0;
		for(int i=1; i<=100; i++){
			//sum=sum+i;
			sum+=i;
		}
		System.out.println(sum);
		
		// Q) 1~10������ ���� ¦���� �հ� Ȧ���� ���� ���� ���Ͽ� ��� �Ͻÿ�.
		int even=0; // ¦������
		int odd=0;  // Ȧ������
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


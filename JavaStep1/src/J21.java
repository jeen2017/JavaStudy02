public class J21 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2==0) continue;  // continue �Ʒ� ������ ���� ���� �ʰ� �ٽ� �ݺ� ù�Ӹ��� �帧�� �����°�
			System.out.println(i); // 1,3,5,7,9
		}

		for(int i=1; i<=100; i++){
			if(i==50) break;
			System.out.println(i);
		}
	}

}

/* 
	��� : break(Ż��), continue(���)
	+ �ݺ����� �帧�� �����Ѵ�.
	
*/
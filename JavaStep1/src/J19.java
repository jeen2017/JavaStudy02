public class J19 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		// i�� 1���� �����ؼ� i�� 5�� �ɶ����� 5������, �ѹ� �����Ҷ����� i�� 1�� ����
		for(int i=1; i<=5; i++)
			System.out.println(i);
		
		// Q) 10->9->8->7->6->5->4->3->2->1
		for(int i=10; i>0; i--){
			if(i!=1){
				System.out.println(i+"->");
			}else{
				System.out.println(i);
			}
		}
	}

}
// Q) 10->9->8>-7......1 

/*

�ݺ���(for, while, do~while)
-> ��Ģ�� ã�ƾ� �ȴ�.

*/
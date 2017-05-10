public class J19 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		// i를 1부터 시작해서 i가 5가 될때까지 5번실행, 한번 실행할때마다 i를 1씩 증가
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

반복문(for, while, do~while)
-> 규칙을 찾아야 된다.

*/
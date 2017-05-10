public class J21 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2==0) continue;  // continue 아래 문장은 실행 하지 않고 다시 반복 첫머리로 흐름을 돌리는것
			System.out.println(i); // 1,3,5,7,9
		}

		for(int i=1; i<=100; i++){
			if(i==50) break;
			System.out.println(i);
		}
	}

}

/* 
	제어문 : break(탈출), continue(계속)
	+ 반복문의 흐름을 제어한다.
	
*/
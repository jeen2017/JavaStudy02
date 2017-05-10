public class J20 {
	public static void main(String[] args) {
		// Q) 1~10까지의 수중 짝수만 출력 하시오.
		// for --> i:1~10 / if : i%2==0
		for(int i=2; i<=10; i++){
			if(i%2!=0){
			System.out.println(i);
			}
		}
		System.out.println("===========================");
		// Q) 1~30까지의 수중 3의 배수이고 5의 배수인 수만 출력 하시오.
		// for : 반복횟수를 예측 가능 할때...
		for(int i=1; i<=30; i++){
			if(i%3==0 && i%5==0){
				System.out.println(i);
			}
		}
		// Q) while문을 이용하여 1~50까지 5의 배수만 출력 하시오.
		// 반복횟수를 예측 하기가 어려울때...
		int i=1;
		while(i<=50) {
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
		}
		// Q) 문자 A~Z 출력
		char alpa='A';
		do{
			System.out.println(alpa);
			alpa++;
		}while(alpa<='Z');
	}
}

/* 반복문(while)
 -형식(선조건 후처리)
	초기값
	while(조건) {
		조건이 참인경우에 실행
		증감식
}
 -형식(선처리 후조건)
  do{
 
  }while(조건);
 
*/





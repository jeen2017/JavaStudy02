public class J28 {
	public static void main(String[] args) {
		// 3. 카운트 방법(1씩 누적)
		// Q) 1~10까자 수중 홀수의 개수와 짝수의 개수는 얼마 인가?
		int ecnt=0; //짝수의 개수
		int ocnt=0; //홀수의 개수
		
		int i=1;
		while(i<=10){
			if(i%2==0){
				ecnt++;
			}else{
				ocnt++;
			}
			i++;
		}
		System.out.println("ecnt="+ecnt); //5
		System.out.println("ocnt="+ocnt); //5
	}

}

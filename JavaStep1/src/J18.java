public class J18 {
	public static void main(String[] args) {
		int a=8;
		// a가 홀수인지 짝수인지 판단 하시오 (switch-case)
		switch (a%2) {
		case 0:
			System.out.println("짝수");
			break;
		default:
			System.out.println("홀수");
			break;
		}
		
		/* Q) 학점 구하기
		 100   : A학점 / 10  --> case 10
		 90~99 : A학점 / 10  --> case  9
		 80~89  : B학점 / 10 --> System.out.println("A학점");
		 					    break;
		 70~79  : C학점 / 10 --> case  8
		 69학점이하 : D학점 / ---- default
		*/
		int jum=882;
		if(jum>=0 && jum<=100){
			switch (jum/10) {
				case 10:
				case  9:
					System.out.println("A학점");
					break;
				case 8:
					System.out.println("B학점");
					break;
				case 7:
					System.out.println("C학점");
					break;
				default:
					System.out.println("D학점");
					break;
				}
			}else{
			System.out.println("잘못된 점수 입니다.");
		}
	}
}

/*
선택문(switch ~ case)  // 메뉴만들기
- 형식
switch( 값2 ){
	case 값1:
	
	break;
	case 값2:
	
	break;
	case 값3:
	
	break;
	default:
}

*/
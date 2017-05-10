public class J16 {
	public static void main(String[] args) {
		// 대입연산자 : L-Value = R-Value;
		// 복합대입연산자 : 산술연산자+대입연산자를 결합
		// 				+=, -=, *=, /=, %=
		int a=10;
		a+=20; // a=a+20; 와 동일
		System.out.println(a); // 30
		
		int x=1;
		//Q) x에 1을 증가시키는 모든 방법을 쓰시오
		++x;
		x=x+1;
		x++;
		x+=1;
		System.out.println(x);	
	}
}

/*
 L-Value = R-Value;
	변수	 = 변수;	  a=b;
	변수	 = 수식;   a=b+c;
	변수	 =  값;	  a=20;
	변수	 = 메서드호출문;	a=sum(10,20);
# 수식표기법(연산자의 위치에 따른 표기법) → 계산하는 방법(stack=스텍=LIFO)
①inFix : a+b → 인간중심
②preFix : +ab → 컴퓨터중심
③postFix : ab+
*/
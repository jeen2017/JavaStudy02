public class J03 {

	public static void main(String[] args) {
		// 문자(char) - 단일문자 (영문<--|-->한글, 중국어, 일본어)
		// 문자표현 --> 'A'(Char) --> "A"(String)
		// 문자데이터는 컴퓨터 내부에서 수치로 저장 된다.
		// 컴퓨터는 0,1 이진수 체계를 이해한다.
		// A(기호)--->(65)/(1000001) : 문자데이터는 수치자료 이다.
		// +32차이
		// a(기호) ---> (97)
		char c='A'+1;
		System.out.println(c);

		char lower='A'+32; //97(a)
		System.out.println(lower);
		
		char upper='a'-32;
		System.out.println(upper);
		
		// '1'+'1'=2
		int one='1';
		System.out.println(one); //49
		int v=('1'-'0')+('1'-48);
		System.out.println(v); //2
		
	}
}

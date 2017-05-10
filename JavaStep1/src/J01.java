import javax.swing.JFrame;

// JavaSE 기본골격
public class J01 {
	public static void main(String[] args) {
		// 프로그램의 3대 요소
		// ①변수(Variable), ②자료형(DataType) ③할당(=)
		// ② + ① 변수선언 : int a;
		// 모든프로그램의 연산(계싼)은 메모리(기억공간)에서 이루어진다.
		// ①변수(Variable) : 그룻, 데이터를 담는저장소, 기억공간을 대표하는이름(Symboul)
		// 크기는 4byte 이고 정수만 넣어야 된다. 
		int a; //변수선언 -> 타입기반의 언어 (C, Java) -> 메모리에 기억공간이 만들어 진다. --> 기본자료형 // Persion a;  --> 사용자정의 자료형
		a=10;  // =(대입,할당연산자)
		// a에 10을 곱하시오.
		a=a*10;
		System.out.println(a);
		
		JFrame f=new JFrame("출력");
		f.setSize(200,200);
		f.setLocation(600, 600);
		f.setVisible(true);
	}

}

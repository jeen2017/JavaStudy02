import bit.data.AutoData;

public class J08 {
	public static void main(String[] args) {
		// 배열의 단점 : 길이가 고정(배열을 생성할때 크기를 지정)
		// 동일한 자료형만 저장가능(이질적인 자료형은 저장 불가)
		// -> 객체를 저장할 구조로는 부적합하다.
		// -> 삽입/삭제동작을 구현하기 어렵다. --> 연결리스트(LinkedList)
		
		int a=100;
		float b=234.5f;
		char c='A';
		// a,b,c를 담을수 있는 배열이 있나요?
		//Q) AutoData 라는 객체를 메모리에 생성하시오.
		AutoData d=new AutoData();
		d.d1=a;
		d.d2=b;
		d.d3=c;
		
		System.out.println(d.d1);
		System.out.println(d.d2);
		System.out.println(d.d3);
	}

}

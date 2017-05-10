public class J04 {
	public static void main(String[] args) {
		int han='박';
		System.out.println((char)han);  // (char)48149 -> 박 
		
		char name='나';
		System.out.println((int)name);
		//String name="나길동";
		
		boolean t=true;  // true -> 0이외의 값(1)
		boolean f=false; // false -> 0
		// boolean자료는 연산이 불가능
		// !true --> false
		System.out.println(!f); // !(NOT)
		
		boolean x=true && false; // &&(AND-동시에,이고)
		System.out.println(x);
		
		boolean y=true || false; // ||는 OR-또는 
		System.out.println(y);
		
	}
}

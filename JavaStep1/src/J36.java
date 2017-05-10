public class J36 {
	public static void main(String[] args) {
		char[] c=new char[5];
		c[0]='A';
		c[1]='P';
		c[2]='P';
		c[3]='L';
		c[4]='E';
		
		lowChar(c);
	}
	// 매개변수로 문자 여러개를 받아서 모든 문자를 소문자로 변경하여 출력하는 메서드를 정의(lowChar)
	public static void lowChar(char[] c){
		for(int i=0; i<c.length; i++){
			System.out.println((char)(c[i]+32));
		}
	}
}

/*
a
p
p
l
e
*/

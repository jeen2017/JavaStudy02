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
	// �Ű������� ���� �������� �޾Ƽ� ��� ���ڸ� �ҹ��ڷ� �����Ͽ� ����ϴ� �޼��带 ����(lowChar)
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

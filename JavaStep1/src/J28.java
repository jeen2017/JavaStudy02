public class J28 {
	public static void main(String[] args) {
		// 3. ī��Ʈ ���(1�� ����)
		// Q) 1~10���� ���� Ȧ���� ������ ¦���� ������ �� �ΰ�?
		int ecnt=0; //¦���� ����
		int ocnt=0; //Ȧ���� ����
		
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

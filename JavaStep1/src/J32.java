public class J32 {
	public static void main(String[] args) {
		int start=50;
		int end=150;		   // �ñ״�ó(signature)
		int v=sum(start, end); // �޼��� ȣ������ �� (����,Ÿ��)
		System.out.println(v);
	}
	// �Ű������� 2���� ������ �޾Ƽ� / �μ������� ������ ���Ͽ� �����ϴ� �޼��带 ����.(sum)
	public static int sum(int s, int e){
		int hap=0;
		for(int i=s; i<=e; i++){
			hap+=i;
		}
		return hap;
	}
}

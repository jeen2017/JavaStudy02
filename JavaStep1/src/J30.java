public class J30 {
	public static void main(String[] args) {
		// 2���� ������ ���Ͽ� ��� �Ͻÿ�.
		int a=10;
		int b=20;
		// intHap �̶�� �޼��带 ȣ�� �غ���
		// intHap�� ������ 10, 20�� �Ѱ��ٰ� ���� ���ؼ� ��� ���ֶ�.
		intHap(a,b); // Method Call �� �Ķ���� ����(parameter passing)
		System.out.println("����");
	}
	// Method ����
	// Q) �Ű������� ���� 2���� �޾Ƽ� ������ ���Ͽ� ����ϴ� �ż��带 �����Ͻÿ�(intHap)
	public static void intHap(int x, int y){
		int sum=x+y;
		System.out.println(sum);
	}
	
}
/*
�޼���(Method) : ����,����,���,�Լ�(function)
  [����](�Ӹ�(������Ÿ��,����,���Ǻ� + ��(������))
    ���������� [������(static,final)] ����Ÿ�� �޼����̸�(�Ű���������Ʈ){
 	
 	// ������ ���� �� ���� �Ѵ� �� ����� ����� ���� �� ����� �����ִ°�(return)
 	return 10;
 	 
 }
  
*/
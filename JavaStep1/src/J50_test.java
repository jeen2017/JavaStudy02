public class J50_test {
	public static void main(String[] args) {

		int[] a={108,32,12,56,43,67,99,81,20,78};
		int sd=43;
		int index = 0;
		boolean flag = false;
		// Q) 43�� ���° index�� �����ϴ��� �˻��Ͽ� ����Ͻÿ�.(�� �����˻��� �̿�)
		// ��Ʈ: ������ �����͸� �������� ����(��������) �� �����˻��� �ϸ� �ȴ�.
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
					if(a[i] == sd){
						flag=true;
						index=i;
					}
				}
				if(flag){
					System.out.println(sd+"�� "+(index)+"��° ��ġ���� ã�ҽ��ϴ�.");
				}else{
					System.out.println("ã�� ���߽��ϴ�.");
				}
			}		
		}
	}
}
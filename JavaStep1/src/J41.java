public class J41 {
	public static void main(String[] args) {
		// 5. �˻�(�����Ͱ� ������ ������������ �Ǿ��ִ�)
		// �� �������� �߾ӿ� �ִ� �߾Ӱ��� ���ϴ� ����� ���� ����.
		// �� �����˻�(binary search)
		// 		  0  1  2  3  4  5  6  7  8   9  �� index(position)
		// �����˻�(�����ͷ��� �ҷ��� ���)
		int[] a={10,20,30,40,50,60,70,80,90,100};
		int sd=70; // index=6
		int index=-1;
		for(int i=0; i<a.length; i++){
			if(sd==a[i]){
//				System.out.println(i); //6
				index=i;
				break;
			}
		}
		if(index!=-1){
			System.out.println(index);
		}else{
			System.out.println("����");
		}
	}

}

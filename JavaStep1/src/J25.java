public class J25 {
	public static void main(String[] args) {
		
/*
��
�ڡ�
�ڡڡ�
�ڡڡڡ�
�ڡڡڡڡ�
*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j<(4-i)) {   // 4->3->2->1->0
					System.out.print(" ");
				} else {
					System.out.print("��"); // ����4+��1��=5��
				}
			}
			System.out.println();
		}
		
/*
            ��
         �ڡ�
      �ڡڡ�
   �ڡڡڡ�
�ڡڡڡڡ�
*/
		//----------------------------------------
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(j<=i){
					System.out.print(" ");
				}else{
					System.out.print("��");
				}
			}
			System.out.println();
		}
	}
}
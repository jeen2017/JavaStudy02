import bit.edu.MovieVO;

public class J56 {
	public static void main(String[] args) {
		// ��ȭ3���� ������ ������ ���� �Ͻÿ�
		MovieVO[] v=new MovieVO[3]; // ��ü�迭
		v[0]=new MovieVO("����", 12000, "����", 12);
		v[1]=new MovieVO("��", 12000, "��", 10);
		v[2]=new MovieVO("��Ʈ", 12000, "��Ʈ", 15);
		//for~
		for(int i=0; i<v.length; i++){
			System.out.println(v[i].toString());
		}
		
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		// for~
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}

}

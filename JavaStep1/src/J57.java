import bit.edu.MovieVO;

public class J57 {
	public static void main(String[]){
		MovieVO[] v=new MovieVO[3]; // ��ü�迭
		v[0]=new MovieVO("����", 12000, "����", 12);
		v[1]=new MovieVO("����", 12000, "����", 10);
		v[2]=new MovieVO("��Ʈ", 12000, "��Ʈ", 15);
		// ������ �������� �������� �����Ͽ� ��� �Ͻÿ�(10,12,15)
		
		int[] a={4,3,1,2,5}; // 1 2 3 4 5
		// ��������(selection sort)
		int tmp;
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+"\t");
		}
}
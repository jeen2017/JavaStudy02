import javax.swing.JFrame;

// JavaSE �⺻���
public class J01 {
	public static void main(String[] args) {
		// ���α׷��� 3�� ���
		// �纯��(Variable), ���ڷ���(DataType) ���Ҵ�(=)
		// �� + �� �������� : int a;
		// ������α׷��� ����(���)�� �޸�(������)���� �̷������.
		// �纯��(Variable) : �׷�, �����͸� ��������, �������� ��ǥ�ϴ��̸�(Symboul)
		// ũ��� 4byte �̰� ������ �־�� �ȴ�. 
		int a; //�������� -> Ÿ�Ա���� ��� (C, Java) -> �޸𸮿� �������� ����� ����. --> �⺻�ڷ��� // Persion a;  --> ��������� �ڷ���
		a=10;  // =(����,�Ҵ翬����)
		// a�� 10�� ���Ͻÿ�.
		a=a*10;
		System.out.println(a);
		
		JFrame f=new JFrame("���");
		f.setSize(200,200);
		f.setLocation(600, 600);
		f.setVisible(true);
	}

}

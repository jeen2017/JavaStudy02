public class J18 {
	public static void main(String[] args) {
		int a=8;
		// a�� Ȧ������ ¦������ �Ǵ� �Ͻÿ� (switch-case)
		switch (a%2) {
		case 0:
			System.out.println("¦��");
			break;
		default:
			System.out.println("Ȧ��");
			break;
		}
		
		/* Q) ���� ���ϱ�
		 100   : A���� / 10  --> case 10
		 90~99 : A���� / 10  --> case  9
		 80~89  : B���� / 10 --> System.out.println("A����");
		 					    break;
		 70~79  : C���� / 10 --> case  8
		 69�������� : D���� / ---- default
		*/
		int jum=882;
		if(jum>=0 && jum<=100){
			switch (jum/10) {
				case 10:
				case  9:
					System.out.println("A����");
					break;
				case 8:
					System.out.println("B����");
					break;
				case 7:
					System.out.println("C����");
					break;
				default:
					System.out.println("D����");
					break;
				}
			}else{
			System.out.println("�߸��� ���� �Դϴ�.");
		}
	}
}

/*
���ù�(switch ~ case)  // �޴������
- ����
switch( ��2 ){
	case ��1:
	
	break;
	case ��2:
	
	break;
	case ��3:
	
	break;
	default:
}

*/
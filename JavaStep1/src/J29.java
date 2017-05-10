// 2~9단까지 구구단 출력
public class J29 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"X"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
		
	}

}

/* 결과 :
2X1=2	3X1=3	4X1=4	5X1=5	6X1=6	7X1=7	8X1=8	9X1=9	
2X2=4	3X2=6	4X2=8	5X2=10	6X2=12	7X2=14	8X2=16	9X2=18	
2X3=6	3X3=9	4X3=12	5X3=15	6X3=18	7X3=21	8X3=24	9X3=27	
2X4=8	3X4=12	4X4=16	5X4=20	6X4=24	7X4=28	8X4=32	9X4=36	
2X5=10	3X5=15	4X5=20	5X5=25	6X5=30	7X5=35	8X5=40	9X5=45	
2X6=12	3X6=18	4X6=24	5X6=30	6X6=36	7X6=42	8X6=48	9X6=54	
2X7=14	3X7=21	4X7=28	5X7=35	6X7=42	7X7=49	8X7=56	9X7=63	
2X8=16	3X8=24	4X8=32	5X8=40	6X8=48	7X8=56	8X8=64	9X8=72	
2X9=18	3X9=27	4X9=36	5X9=45	6X9=54	7X9=63	8X9=72	9X9=81	
*/
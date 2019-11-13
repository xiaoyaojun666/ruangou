package p2;
public class T2 {
	static String s[][] = new String[50][3];
	static int a= (int) (101 * Math.random());
	static int b= (int) (101 * Math.random());
	public static void main(String[] args) {
		printHeader();
		generateEquations();
		printExcercise();
		printCalculation();
	}
	//��ӡ����
	public static  void printHeader() {  
		System.out.println("********************************************************");
		System.out.println("*********�������50��100���ڵļӼ�������*******************");
		System.out.println("******ÿ�����г�����Եõ�һ��50�����ϰ�⼰��*************");
		System.out.println("***********************************************************");
	}
	//������ʽ
	public static  void generateEquations() {
		for (int i = 0; i < 50; i++) {
			s[i][0] = String.valueOf((int) (101 * Math.random()));//����1~100�������
			s[i][1] = String.valueOf((int) (101 * Math.random()));//����1~100�������
			int o = (int) ((int) (2 * Math.random()));//���������1��2 
			if (o == 1) {
				s[i][2] = "+";
			} else {
				s[i][2] = "-";
			}
		}
	}
	//��ӡ��Ŀ
	public static void printExcercise() {
		for (int i = 0; i < 50; i++) {
			System.out.println("��" + (i+1)+ "��:" + s[i][0] + s[i][2] + s[i][1]+"=");
		}
	}
	//��ӡ��    
	public static void printCalculation() {
		for (int i = 0; i < 50; i++) {
			if(s[i][2].equals("+")) {
				int res= Integer.valueOf(s[i][0])+Integer.valueOf(s[i][1]);
				System.out.println("��" + (i+1) + "���:" + res);	
			}else {
				int res= Integer.valueOf(s[i][0])-Integer.valueOf(s[i][1]);
				System.out.println("��" + (i+1) + "���:" + res);	
			}
		}
	}
}
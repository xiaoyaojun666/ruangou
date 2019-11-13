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
	//打印标题
	public static  void printHeader() {  
		System.out.println("********************************************************");
		System.out.println("*********程序输出50道100以内的加减法运算*******************");
		System.out.println("******每次运行程序可以得到一套50道题的习题及答案*************");
		System.out.println("***********************************************************");
	}
	//产生算式
	public static  void generateEquations() {
		for (int i = 0; i < 50; i++) {
			s[i][0] = String.valueOf((int) (101 * Math.random()));//生成1~100的随机数
			s[i][1] = String.valueOf((int) (101 * Math.random()));//生成1~100的随机数
			int o = (int) ((int) (2 * Math.random()));//生成随机数1或2 
			if (o == 1) {
				s[i][2] = "+";
			} else {
				s[i][2] = "-";
			}
		}
	}
	//打印题目
	public static void printExcercise() {
		for (int i = 0; i < 50; i++) {
			System.out.println("第" + (i+1)+ "题:" + s[i][0] + s[i][2] + s[i][1]+"=");
		}
	}
	//打印答案    
	public static void printCalculation() {
		for (int i = 0; i < 50; i++) {
			if(s[i][2].equals("+")) {
				int res= Integer.valueOf(s[i][0])+Integer.valueOf(s[i][1]);
				System.out.println("第" + (i+1) + "题答案:" + res);	
			}else {
				int res= Integer.valueOf(s[i][0])-Integer.valueOf(s[i][1]);
				System.out.println("第" + (i+1) + "题答案:" + res);	
			}
		}
	}
}
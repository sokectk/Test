public class TestAutoConvert02 {
	public static void main(String[] args) {
		
		int n1 = 10;
		float d1 = n1 + 1.1F;
		//double d1 = n1 + 1.1;
		System.out.println(n1);
		System.out.println(d1);
		//byte,short 和char之间不会相互自动转换
		//当把数赋给byte时，1.先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;
		int n2 = 1;
		//byte b2 = n2;如果是变量赋值，判断类型
		//char c1 = b1;
		
		byte b2 = 1;
		short s1 = 1;
		//short s2 = b2 + s1; //b2 +b3 会先转换成int
		boolean pass = true;
		//int num100 = pass;// boolean 不参与类型的自动转换
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		double num500 = b4 + s3 + num200 + num300;
		
	}
}	
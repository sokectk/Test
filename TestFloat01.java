public class TestFloat01 {
	public static void main(String[] args) {
		float num2 = 1.1F;
		double num3 = 1.1;
		double num4 = 1.1F;
		double num5 = .123;
		System.out.println(num5);
		System.out.println(5.12e2);
		System.out.println(5.12e-2);
		double num9 = 2.12345678901;
		//float 超过范围会损失精度
		float num10 = 2.12345325552F;
		System.out.println(num9);
		System.out.println(num10);
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11);
		System.out.println(num12);
		//浮点数使用陷阱
		if(Math.abs(num11 - num12) < 0.000001 ) {
			System.out.println("差值非常小，到我的规定精度，认为相等");
		}
	}
}
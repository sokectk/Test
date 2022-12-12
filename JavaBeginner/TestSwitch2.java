public class TestSwitch2 {
	public static void main(String[] args) {
		int i = 2;
		//switch case条件选择内部需要加break，否则出bug
		switch(i) {
		case 0:
			System.out.println("0");			
		case 1:
			System.out.println("1");			
		case 2:
			System.out.println("2");			
		case 3:
			System.out.println("3");
		default:
			System.out.println("default");
		}
		System.out.println("等级是" + i);
	} 
}
import java.util.Scanner;
public class  TernaryOperatorP0078 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name = myScanner.next();
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水：");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下：");
		System.out.println("name =" + name + "\n" + "age =" + age + "\n" + "sal = " + sal);
		
	}
}
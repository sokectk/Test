//
import java.util.Scanner;
public class IfP0109 {
	public static void main(String[] args) {

		int x = 7;
		int y = 4;
		if(x > 5) {
			if(y > 5) {
				System.out.println(x + y);
			}
				System.out.println("JAVA ѧϰ");
		} else {
			System.out.println("x is" + x);
		}

		double d1 = 34.5;
		double d2 = 2.6;
		if(d1 > 10.0 && d2 < 20.0) {
			System.out.println("�������ĺ�=" + (d1 + d2));
		}
		//
		int num1 = 20;
		int num2 = 30;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 ==0) {
			System.out.println("�������ĺͿ��Ա�3���ܱ�5����");
		} else {
			System.out.println("�������ĺͲ����Ա�3���ܱ�5����");
		}
		//����
		System.out.println("��������ݣ�");
		Scanner myScanner = new Scanner(System.in);
		int year = myScanner.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "�� ����");
		} else {
			System.out.println(year + "���� ����");
		}

	}
}
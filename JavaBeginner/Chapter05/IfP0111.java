//
import java.util.Scanner;
public class IfP0111 {
	public static void main(String[] args) {

		
		System.out.println("���������÷֣�1-100����");
		Scanner myScanner = new Scanner(System.in);
		int score = myScanner.nextInt();
		if(score >=1 && score <= 100) {
			if(score == 100) {
				System.out.println("���ü��ã�");
			} else if(score >80 && score < 99) {
				System.out.println("�������㣡");
			} else if(score >=60 && score <=80) {
				System.out.println("����һ�㣡");
			} else {
				System.out.println("���ò�����");
			}
		} else {
			System.out.println("���÷���Ҫ��1-100�����������룺");
		}

	}
}
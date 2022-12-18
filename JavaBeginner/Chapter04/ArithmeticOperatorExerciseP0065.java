public class ArithmeticOperatorExerciseP0065 {
	public static void main(String[] args) {
		int i = 1;
		i = i++;
		System.out.println(i);
		int j = 1;
		j = ++j;
		System.out.println(j);
		
		int a1 = 10;
		int a2 = 20;
		int a = a1++;
		System.out.println("a=" + a);
		System.out.println("a2=" + a2);
		a  =  --a2;
		System.out.println("a=" + a);
		System.out.println("ia2="+a2);
	}
}
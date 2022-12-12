public class Magic02 {
	public static void main(String[] args) {
    int myNumber = 15;
    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;
    //We will refer to myNumber as the original number from now on
    System.out.println(magicNumber);
	}
}
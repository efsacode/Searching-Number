
public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 10, 20, 30, 40, 50 };
		int arananSayi = 60;

		boolean exist = false;

		for (int sayi : sayilar) {
			if (sayi == arananSayi) {
				exist = true;
			}
		}
		if (exist == true) {
			System.out.println("The number found in the array.");
		} else {
			System.out.println("The number is not in this array.");
		}
	}
}

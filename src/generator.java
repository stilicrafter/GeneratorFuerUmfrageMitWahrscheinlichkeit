import java.util.Random;

public class generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		for (int i = 0; i < 30; i++) {
			int a = rand.nextInt(100);

			if (a > 0 && a <= 30)
				System.out.print("Maingau");
			if (a > 31 && a <= 50)
				System.out.print("T-Online oder Deutsche Telekom");
			if (a > 51 && a <= 55)
				System.out.print("EWE");
			if (a > 56 && a <= 75)
					System.out.print("1&1 / GMX / WEB oder UnitedInternet");
			if (a > 76 && a <= 85)
					System.out.print("Vodafone (Per DSL)");
			if (a > 86 && a <= 90)
					System.out.print("Telefonica oder (O2/E-Plus)");
			if (a > 91 && a <= 97)
					System.out.print("EVM");
			if (a > 98 && a <= 101)
					System.out.print("Sonstige");
			//Trennzeichen
			System.out.print(";");
			
			
			// Teil 1

			System.out.println(";");
			//System.out.println(" ");

		}
	}

}

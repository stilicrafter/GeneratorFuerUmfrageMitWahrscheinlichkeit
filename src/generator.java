import java.util.Random;

public class generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int b = 0;

		for (int i = 0; i < 30; i++) {
			int a = rand.nextInt(100);

			if (a >= 0 && a <= 30)
				System.out.print("Maingau");
			if (a >= 31 && a <= 50)
				System.out.print("T-Online oder Deutsche Telekom");
			if (a >= 51 && a <= 55)
				System.out.print("EWE");
			if (a >= 56 && a <= 75)
				System.out.print("1&1 / GMX / WEB oder UnitedInternet");
			if (a >= 76 && a <= 85)
				System.out.print("Vodafone (Per DSL)");
			if (a >= 86 && a <= 90)
				System.out.print("Telefonica oder (O2/E-Plus)");
			if (a >= 91 && a <= 97)
				System.out.print("EVM");
			if (a >= 98 && a <= 101)
				System.out.print("Sonstige");
			// Trennzeichen
			System.out.print(";");

			// Teil 1

			b = rand.nextInt(100);
			if (b >= 0 && b <= 20)
				System.out.print("1");
			if (b >= 21 && b <= 56)
				System.out.print("2");
			if (b >= 57 && b <= 79)
				System.out.print("3");
			if (b >= 80 && b <= 88)
				System.out.print("4");
			if (b >= 89 && b <= 94)
				System.out.print("5");
			if (b >= 95 && b <= 101)
				System.out.print("3");
			//if (b <= 100)
			//	System.out.print("1");
			
			

			
			System.out.print(";");
			
			
	for (int j = 0; j < 16; j++) {
		
			
			int c = rand.nextInt(100);
			
			if (c >= 0 && c <= 20)
				System.out.print("Sehr oft");
			if (c >= 21 && c <= 56)
				System.out.print("Oft");
			if (c >= 57 && c <= 79)
				System.out.print("Manchmal");
			if (c >= 80 && c <= 88)
				System.out.print("Nie");
			if (c >= 89 && c <= 94)
				System.out.print("Sehr Oft");
			if (c >= 95 && c <= 101)
				System.out.print("Manchmal");
			
			System.out.print(";");
			
			}
			
			
			
			
			
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" ");
			//System.out.println(a +"   "  + b);
			// Teil 2

			//System.out.println(";");
			// System.out.println(" ");

		}
	}

}
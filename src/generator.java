import java.util.Random;

public class generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		for (int i = 0; i < 30; i++) {
			int a = rand.nextInt(50);

			if (a > 0 && a <= 10)
				System.out.print("a");
			if (a > 11 && a <= 50)
				System.out.print("b");
			
			// Teil 1

			System.out.println(";");
			//System.out.println(" ");

		}
	}

}

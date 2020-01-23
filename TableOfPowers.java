import java.util.Scanner;

public class TableOfPowers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
		String question = "";
		int userInput;
		int i;
		do {
			
			System.out.println("Please enter an integer number: ");
			userInput = scnr.nextInt();
			
			System.out.println("Number            Squared            Cubed     ");
			System.out.println("=======           =======            ====== ");
			
			for ( i = 1; i<= userInput; i++) {
				
				System.out.println(i + "\t\t  " + (i * i) + "\t\t     " + (i * i * i));
			}
			
			System.out.println();
			System.out.println("****************************************\n");
			for ( i = 1; i <= userInput; i++) {
				System.out.print("    " + i + "");
			}
			System.out.println();
			for ( i = 1; i <= userInput; i++) {
				System.out.print("    " + "=" + "");
			}
			System.out.println();
			for ( i = 1; i <= userInput; i++) {
				System.out.print(i + " |" + " ");

					for (int j = 1; j<= userInput; j++) {

						System.out.print((i * j)+ "    ");
					}
				System.out.println();

			}
			System.out.println();
			System.out.println("Do you want to continue? (y/n)");
			scnr.nextLine();
			question = scnr.nextLine();
			System.out.println();
			
		}	while (question.toLowerCase().startsWith("y"));
		
		
		
		System.out.println("Thank you, Goodbye.");
		scnr.close();
	}

}




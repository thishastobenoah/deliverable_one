import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		String userPass;
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter a Password:");
		userPass = input.nextLine();
		int length = userPass.length();
		boolean caseCheck = caseCheck(userPass);
		
		if (caseCheck == true) {
			if (length >= 7 && length <=12) {
				if (userPass.contains("!")) {
					System.out.println("Password valid and accepted");
					}else {
						System.out.println("Error");
				}
			}else {
				System.out.println("Error");
		}
		}else {
			System.out.println("Error");
	}
}
	
	public static boolean caseCheck (String userPass) {
			for (int i = 0; i < userPass.length();i++) {
			if (Character.isUpperCase(userPass.charAt(i))) {
				for (int n = 0; n < userPass.length();n++) {
					if (Character.isLowerCase(userPass.charAt(n))) {
						
								return true;
							}	
						} 	
					}
			}return false;
	}
}

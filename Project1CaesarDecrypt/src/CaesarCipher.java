//Rebecca Pina Partidas
// CIS3362

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// Variable initializations
		Scanner scanner = new Scanner(System.in);
		String encryptedCode = "";
		String decryptedCode = "";
		char decryptedLetter;
		int i;
		int j;
		
		// User input for encrypted code
		System.out.println("Please enter encrypted code:");
		encryptedCode = scanner.nextLine();
		
		System.out.println("Shift:");
		
		// Loops through each character of the encrypted text and shifts by 0-25 letters each time
		for (i = 0; i < 26; i++) {
			for (j = 0; j < encryptedCode.length(); j++) {
				decryptedLetter = (char)(((encryptedCode.charAt(j)- 'a') + i)%26 +'a'); 
				decryptedCode = decryptedCode + decryptedLetter;
			}
			
			// prints each trial for decryption
			System.out.println(decryptedCode);
			decryptedCode = "";
		}
		
		scanner.close();
	}

}


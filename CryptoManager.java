
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {

	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII
	 * codes according to the LOWER_RANGE and UPPER_RANGE characters
	 * 
	 * @param plainText a string to be encrypted, if it is within the allowable
	 *                  bounds
	 * @return true if all characters are within the allowable bounds, false if any
	 *         character is outside
	 */
	public static boolean isStringInBounds(String plainText) {

		// checks if characters are in range
		int i = 0;
		while (i < plainText.length()) {
			if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE) {
				return false;
			}
			i++;
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher. The integer key specifies
	 * an offset and each character in plainText is replaced by the character
	 * \"offset\" away from it
	 * 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key       an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		if (isStringInBounds(plainText)) {
		} else {
		    return "The selected string is not in bounds, Try again.";
		}

	    String encrypted = ""; 
	    int i = 0; 
	    while (i < plainText.length()) {
	        char a = plainText.charAt(i);
	        int CODE = (int) a + key;

	        if (CODE > UPPER_RANGE) {
	            CODE = (CODE - LOWER_RANGE) % RANGE + LOWER_RANGE;
	        }

	        encrypted += (char) CODE; // Concatenate the encrypted character
	        i++; // Increment index
	    }

	    return encrypted;
	}



	/**
	 * Encrypts a string according the Bellaso Cipher. Each character in plainText
	 * is offset according to the ASCII value of the corresponding character in
	 * bellasoStr, which is repeated to correspond to the length of plainText
	 * 
	 * @param plainText  an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character
	 *                   by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption(String plainText, String bellasoStr) {
		// Variables
		String encrypted = ""; // Encrypted string, needs to be built character by character

		// Loop index
		int i = 0;

		while (i < plainText.length()) {
		    
		    char d = plainText.charAt(i);
		    int CODE = (int) d + (int) bellasoStr.charAt(i % bellasoStr.length());

		    if (CODE > UPPER_RANGE) {
		        CODE = (CODE - RANGE * ((CODE - UPPER_RANGE) / RANGE + 1));
		    }

		    // Append to string
		    encrypted += (char) CODE;
		    i++; // Increment index
		}

		// Return
		return encrypted;
	}

	/**
	 * Decrypts a string according to the Caesar Cipher. The integer key specifies
	 * an offset and each character in encryptedText is replaced by the character
	 * \"offset\" characters before it. This is the inverse of the encryptCaesar
	 * method.
	 * 
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key           an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption(String encryptedText, int key) {
	    String decrypted = ""; 
	    int i = 0;
	    while (i < encryptedText.length()) {
	        char ch = encryptedText.charAt(i); // makes it equal to the character in encrypted text
	        int decryptedCode=0;

	        decryptedCode = ch-key;
	        // make sure its above the range 
	        while (decryptedCode < LOWER_RANGE) {
	            decryptedCode += RANGE;}

	        decrypted += (char) decryptedCode; // Appends the  character.
	        i++; // Move to the next character
	    }

	    return decrypted; 
	}




	/**
	 * Decrypts a string according the Bellaso Cipher. Each character in
	 * encryptedText is replaced by the character corresponding to the character in
	 * bellasoStr, which is repeated to correspond to the length of plainText. This
	 * is the inverse of the encryptBellaso method.
	 * 
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr    an uppercase string that specifies the offsets,
	 *                      character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
	    String decrypted = ""; // empty string
	    int i = 0; 

	    // Loop through each character in encryptedText
	    while (i < encryptedText.length()) {
	        char ch = encryptedText.charAt(i);
	        int decryptedCode = (int) ch - (int) bellasoStr.charAt(i % bellasoStr.length());

	        // checker if it goes below range
	        while (decryptedCode < LOWER_RANGE) {
	            decryptedCode += RANGE;
	        }

	        decrypted += (char) decryptedCode; // sends to decrypt 
	        i++; // Move to the next character
	    }

	    return decrypted; // Return the decrypted string
	}
}
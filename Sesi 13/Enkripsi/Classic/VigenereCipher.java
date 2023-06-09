package Classic;
import java.util.Scanner;

public class VigenereCipher {
    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        int keyLength = key.length();
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            char keyChar = key.charAt(i % keyLength);
            if (Character.isLetter(ch)) {
                char shifted = (char) (((ch - 'A') + (keyChar - 'A')) % 26 + 'A');
                ciphertext.append(shifted);
            } else {
                ciphertext.append(ch);
            }
        }
        return ciphertext.toString();
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Plain Text: ");
        String plaintext = scanner.nextLine();
        System.out.println("Masukkan Key: ");
        String key = scanner.nextLine();
        scanner.close();
        
        String encrypted = encrypt(plaintext, key);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Encrypted: " + encrypted);
    }
}

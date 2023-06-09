package Classic;
import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                char shifted = (char) (((ch - 'A') + shift) % 26 + 'A');
                ciphertext.append(shifted);
            } else {
                ciphertext.append(ch);
            }
        }
        return ciphertext.toString();
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai Plaintext:  ");
        String plaintext = scanner.nextLine();
        scanner.close();
        
        int shift = 6;
        
        String encrypted = encrypt(plaintext, shift);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Encrypted: " + encrypted);
    }
}

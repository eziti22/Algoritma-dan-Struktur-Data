import java.util.Scanner;

public class MembalikanString {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah string: ");
        String inputString = input.nextLine();
        
        System.out.println("Sebelum pembalikan: " + inputString);
        
        String reversedString = reverseString(inputString);
        
        System.out.println("Setelah pembalikan: " + reversedString);

        input.close();
    }
}

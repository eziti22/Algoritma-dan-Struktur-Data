import java.util.Scanner;

public class Faktorial {
    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int result = faktorial(n);
        
        System.out.println("Faktorial dari " + n + " adalah: " + result);
    }
}

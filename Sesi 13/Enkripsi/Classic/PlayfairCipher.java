package Classic;
public class PlayfairCipher {
    private static final char[][] KEY_MATRIX = {
            {'P', 'L', 'A', 'Y', 'F'},
            {'I', 'R', 'E', 'X', 'M'},
            {'B', 'C', 'D', 'G', 'H'},
            {'K', 'N', 'O', 'Q', 'S'},
            {'T', 'U', 'V', 'W', 'Z'}
    };
    
    public static String encrypt(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();
        
        plaintext = plaintext.replaceAll("[^A-Za-z]", "").toUpperCase();
        
        for (int i = 0; i < plaintext.length(); i += 2) {
            char ch1 = plaintext.charAt(i);
            char ch2;
            
            if (i == plaintext.length() - 1) {
                ch2 = 'X';
            } else {
                ch2 = plaintext.charAt(i + 1);
            }
            
            int[] ch1Pos = findPosition(ch1);
            int[] ch2Pos = findPosition(ch2);
            
            int row1 = ch1Pos[0];
            int col1 = ch1Pos[1];
            int row2 = ch2Pos[0];
            int col2 = ch2Pos[1];
            
            char encryptedCh1, encryptedCh2;
            
            if (row1 == row2) {
                encryptedCh1 = KEY_MATRIX[row1][(col1 + 1) % 5];
                encryptedCh2 = KEY_MATRIX[row2][(col2 + 1) % 5];
            } else if (col1 == col2) {
                encryptedCh1 = KEY_MATRIX[(row1 + 1) % 5][col1];
                encryptedCh2 = KEY_MATRIX[(row2 + 1) % 5][col2];
            } else {
                encryptedCh1 = KEY_MATRIX[row1][col2];
                encryptedCh2 = KEY_MATRIX[row2][col1];
            }
            
            ciphertext.append(encryptedCh1).append(encryptedCh2);
        }
        
        return ciphertext.toString();
    }
  
    private static int[] findPosition(char ch) {
        int[] position = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (KEY_MATRIX[i][j] == ch) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }
    
    public static void main(String[] args) {
        String plaintext = "Enkripsikan Text Ini";
        
        String encrypted = encrypt(plaintext);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Encrypted: " + encrypted);
    }
}

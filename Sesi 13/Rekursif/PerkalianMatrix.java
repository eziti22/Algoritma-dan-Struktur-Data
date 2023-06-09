public class PerkalianMatrix {
    public static int[][] perkalianMatrix(int[][] matrixA, int[][] matrixB) {
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int colB = matrixB[0].length;
        int[][] result = new int[rowA][colB];
        
        rekursifMatrix(matrixA, matrixB, result, 0, 0, 0, rowA, colA, colB);
        
        return result;
    }
    
    private static void rekursifMatrix(int[][] matrixA, int[][] matrixB, int[][] result, int row, int col, int k, int rowA, int colA, int colB) {
        if (row >= rowA) {
            return;
        }
        
        if (col >= colB) {
            rekursifMatrix(matrixA, matrixB, result, row + 1, 0, 0, rowA, colA, colB);
            return;
        }
        
        if (k >= colA) {
            rekursifMatrix(matrixA, matrixB, result, row, col + 1, 0, rowA, colA, colB);
            return;
        }
        
        result[row][col] += matrixA[row][k] * matrixB[k][col];
        
        rekursifMatrix(matrixA, matrixB, result, row, col, k + 1, rowA, colA, colB);
    }
    
    public static void main(String[] args) {
        int[][] matrixA = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrixB = { {7, 8}, {9, 10}, {11, 12} };

        System.out.println("Matriks A:");
        printMatrix(matrixA);
        System.out.println("Matriks B:");
        printMatrix(matrixB);
        
        int[][] result = perkalianMatrix(matrixA, matrixB);
        
        System.out.println("Hasil perkalian matriks:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
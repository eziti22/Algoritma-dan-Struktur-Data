public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Array Setelah diurutkan");
        printArray(arr);

        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr2, "asc");
        System.out.println("Array Setelah diurutkan");
        printArray(arr2);

        int[] arr3 = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr3, "asc");
        System.out.println("Array Setelah diurutkan");
        printArray(arr3);

    }

    private static void selectionSort(int[] arr, String param) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (param.equals("asc")) {
                    if (arr[j] < arr[pos]) {
                        pos = j;
                    }
                } else {
                    if (arr[j] > arr[pos]) {
                        pos = j;
                    }
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }

    }

    private static void insertionSort(int[] arr, String param) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            if (param.equals("asc")) {
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            } else {
                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

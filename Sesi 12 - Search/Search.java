import java.util.Arrays;


public class Search{
    
    /**
     * @param arr
     * @param n
     * @param x
     * @return
     */
    public static int linearSearch(int arr[], int n, int x)
    {
        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++){
            if(arr[i] == x){
                long endTime = System.nanoTime(); 
                long duration = endTime - startTime;
                System.out.println("Linear search runtime: " + duration + " nanoseconds");
                return i;
            }
        }
        long endTime = System.nanoTime(); 
        long duration = endTime - startTime;
        System.out.println("Linear search runtime: " + duration + " nanoseconds");
        return -1;
    }
    
    public static int binarySearch(int arr[], int x)
    {
        long startTime = System.nanoTime();

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x){
                long endTime = System.nanoTime(); 
                long duration = endTime - startTime;
                System.out.println("Binary search runtime: " + duration + " nanoseconds"); 
                return m;
            }
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        long endTime = System.nanoTime(); 
        long duration = endTime - startTime;
        System.out.println("Binary search runtime: " + duration + " nanoseconds");    
        return -1;
    }
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
    public static void main(String args[]) 
    {
        int arr[] = { 18, 13, 24, 22, 39, 10, 16, 20, 19, 35 };
        int x = 24;
        


        //linear search
        
        System.out.println("\nLinear search");
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Nilai yang di cari : " + x);
        int linear = linearSearch(arr, arr.length, x);
        if (linear == -1)
            System.out.println("Elemen Tidak Ada Dalam Array");
        else
            System.out.println("Elemen Ada di Index ke " + linear);
        System.out.println("====================");



        //binary search
        System.out.println("Binary Search");
        sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        System.out.println("Nilai yang di cari : " + x);

        int binary = binarySearch(arr, x);
        if (binary == -1)
            System.out.println("Elemen tidak ada dalam array");
        else
            System.out.println("Elemen ada di index ke " + binary);
    }
}
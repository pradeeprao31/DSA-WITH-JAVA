package pradeep;

public class arrayinevenorodd {

    public static void main(String[] args) {
        int arr[] = {5, 9, 8, 72, 9, 4, 6, 8};

        printEvenNumbers(arr);
        printOddNumbers(arr);
    }

    public static void printEvenNumbers(int[] arr) {
        System.out.println("even number present in given array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] arr) {
        System.out.println("odd number present in given array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
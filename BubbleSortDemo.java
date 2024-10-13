package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void bubbleSort(int [] arr){
        int length = arr.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = 0; j < length - i - 1; j++){
                if (arr[j] > arr [j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 5, 4, 9, 8, 6};
        bubbleSort(arr);
        System.out.println("Bubble sort to sort incremental arrays: " + Arrays.toString(arr));
    }
}

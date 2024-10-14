package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void selectionSort(int[] arr){
        int length = arr.length;
        for(int i = 0; i < length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 9, 8, 6};
        System.out.print("Orginal array: ");
        for(int num : arr){
            System.out.print(num + "\t");
        }

        selectionSort(arr);
        System.out.println("\nSelection sort to sort incremental array: " + Arrays.toString(arr));

    }
}

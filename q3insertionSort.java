import java.util.*;
import java.io.*;

public class q3insertionSort {

    public static void insertionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j=j-1;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {45, 56, 67, 33, 88, 38, 83};

        insertionSort(arr);
        System.out.println("The sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
    
}

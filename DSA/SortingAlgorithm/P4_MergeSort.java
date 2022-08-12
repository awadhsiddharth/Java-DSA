package SortingAlgorithm;

import java.util.ArrayList;

public class P4_MergeSort {

    static void merge(int arr[], int start, int end){
        int i = start;
        int mid = (start + end) / 2;
        int j = mid + 1;
        // Creating a temporary array
        ArrayList<Integer> tempArr = new ArrayList<>();
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                tempArr.add(arr[i++]);
                
            }
            else{
                tempArr.add(arr[j++]);
               
            }
        }
        while(i <= mid){
            tempArr.add(arr[i+1]);
        }
        while(j <= end){
            tempArr.add(arr[j+1]);
        }

        int k = 0;
        for(int index = start; index <= end; index++){
            arr[index] = tempArr.get(k++);
        }
    } 

    static void mergeSort(int arr[], int start, int end){
        // Base case
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end);

    }

    public static void main(String[] args) {
        int array[] = {15,9,16,3,8};
        int n = array.length;
        mergeSort(array, 0, n-1);
        for(int i = 0; i < n;i++){
            System.out.print(array[i] + ",");
        }
    }
    
}

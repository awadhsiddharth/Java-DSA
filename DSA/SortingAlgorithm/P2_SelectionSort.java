package SortingAlgorithm;

public class P2_SelectionSort {
    //In each iteration the min elem is picked from unsorted and moved to sorted subarr
    //Worst,Best,Average TC = O(n^2)

    static void selectionSort(int arr[], int n){
        for(int i = 0; i < n;i++){
            int min = i;
            //comparing elem which are unsorted and that is from j+1
            for(int j = i + 1;j < n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }

    public static void main(String[] args) {
        int array[] = {5,1,6,3};
        int n = array.length;
        selectionSort(array , n);
        for(int i = 0; i < n;i++){
            System.out.print(array[i] + ",");
        }

    }
    
}

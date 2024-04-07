package SortingAlgorithm;

class P1_BubbleSort{

    // Bubble Sort is comparison based SortingAlgorithm
    // It compares 2 consecutive elements

    static void bubbleSort(int arr[], int n){

        //TC = O(n^2) for worst case,average case complexity
        // Best case TC = O(1)

        boolean flag;
        for(int i = 0;i < n;i++){
            flag = false; //initialised
            // 2nd loop will run n-1 cus (arr[4] > arr[5])
            //j < n- i -1 means at every iteration the greatest elem will be at its position
            //which means we dont need to run j loop n times rather we need to run it in decreasing fashion 
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swapping to two number
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //meaning swapping perfromed
                    flag = true;       
                }
            }
            //if flag is false then break from ith loop
            if(flag == false){
                break;
            }

        }
    }
    public static void main(String[] args) {
        int array[] = {15,11,6,31,2,5,12};
        int n = array.length;
        bubbleSort(array, n);
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + ",");
        }
    }

}


public class InsertionSort {



    public void insertionSort(int[] arr){
        if(arr.length <= 1){
            return;
        }

        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int j = i;
                while((arr[j] > arr[j+1])){
                    swap(arr, j, j+1);
                    j--;
                    if(j < 0){
                        break;
                    }
                }

            }
        
        }
        


    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}


public class SelectionSort {


    public  void selectionSortAlgorithm(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min_indx = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[min_indx] > arr[j]){
                    min_indx = j;
                }


            }
            swap(arr, i,min_indx);
        }



    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

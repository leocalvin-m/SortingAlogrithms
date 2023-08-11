import java.util.Arrays;

class BubbleSort{
    
    public static void bubbleSortAlgorithm(int[] arr){
        boolean isSwapped = false;
        if(arr.length <= 1){
            return;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    isSwapped = true;
                }

            }
            if(isSwapped == false){
                return;
            }


        }

    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
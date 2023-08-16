

class QuickSort{


    public void quickSortLomuto(int[] arr, int l, int h){

        if(l < h){
            int p = lomutoPartation(arr, l, h);
            quickSortLomuto(arr, l, p-1);
            quickSortLomuto(arr, p+1, h);
        }

    }

    public void quickSortHoare(int[] arr, int l, int h){
        if(l < h){
            int p = hoarePartation(arr, l, h);
            quickSortHoare(arr, l, p);
            quickSortHoare(arr, p+1, h);

        }

    }

    

    public int lomutoPartation(int[] arr, int l, int h){
        int pivote = arr[h];
        int w = l-1;
        for(int i =l;i<h-1;i++){
            if(arr[i] <= pivote)
            {
                w++;
                swap(arr, w, i);
            }

        }
        swap(arr, h, w+1);

        return w+1;

    }


    public  int hoarePartation(int[] arr,int l, int h){

        int pivote = arr[l];
        int i = l-1;
        int j = h+1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivote);
            do{
                j--;
            }while(arr[j] > pivote);

            

            if(i >= j){
                return j;
            }
            swap(arr, i, j);
            
        }

    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
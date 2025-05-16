

   import java.util.Arrays;


class QuickSort {

    public  static  int partition(int [] arr,int low ,int high){
        int pivot = arr[high];
        int i = low-1;
        for ( int  j = low; j  < high ; j++ ){
            if (arr[j ] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void QuickSort(int[] arr, int low, int high){
        if(low<high){
            int partition = partition( arr, low, high);
            QuickSort(arr,low,partition-1);
            QuickSort(arr,partition+1,high);
        }

    }
    public static void main(String[] args)
    {
        int [] arr={13,35,12,4,76,89,43,24,16};
        int high = arr.length-1;
     
        QuickSort(arr,0,high);
        System.out.println(Arrays.toString(arr));
    }
}

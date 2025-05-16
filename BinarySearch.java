import java.util.Arrays;

public class BinarySearch {


    public  int myFun(int []arr,int num){

     int first=0;
     int last= arr.length-1;
     while(first<=last){
         int mid = (first + last )/ 2;
         if (num < arr[mid]){
             first = mid+1;
         } else if (num > arr[mid]) {
             last = mid-1;
         } else if (num == arr[mid]) {
             System.out.println(mid);
     }
return -1;
    }
        return -1;
    }
     public static void main(String[] args) {
        int [] arr={24,460,78,900,100,134};
        Arrays.sort(arr,0,arr.length);
         System.out.println(arr);
      BinarySearch binary=new BinarySearch();
      int value=binary.myFun(arr,78);
         System.out.println(value);
    }
}



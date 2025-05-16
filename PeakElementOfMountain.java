public class PeakElementOfMountain {

    public int peakAtIndex(int[] arr,int tar){
        int start=0;
        int end=arr.length-1;
        int i=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (tar<arr[mid]) {
            end=mid-1;
            } else if (tar>arr[mid]) {
                start=mid+1;

            }
            else if(tar==arr[mid]) {
                System.out.println(mid-1);
            }
            return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,5,7,8,23,45,67,69};
        PeakElementOfMountain mount =new PeakElementOfMountain();
      int value= mount.peakAtIndex(arr,45);
        System.out.println("The element is found at"+value);
    }
}

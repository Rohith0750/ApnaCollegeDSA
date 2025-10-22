public class binaryserch {

    public static void binser(int arr[], int key){
        int st=0;
        int end=arr.length-1;

        while (st <= end){
            int mid = (st + end)/2;
            if(arr[mid]==key){
                System.out.println("Found at index: " + mid);
                return;
            }
            else if(arr[mid]<key){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("Not found");

    }
    public static void main(String[]args){
      int nums[]= {2,4,6,8,10,12,14,16,18,20};
      int k = 10 ;
      binser(nums,k);

    }
}

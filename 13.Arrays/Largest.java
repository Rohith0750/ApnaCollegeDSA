public class Largest{

     public static void getlargest(int arr[]){
        int largest  = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest <arr[i]){
                largest=arr[i];
            }
          
        }
        System.out.println("Largest value is: "+largest);
        //System.out.println("Smallest value is: "+smallest);
        

    }
    public static void main(String[] args) {
        int arr []= {20,50,10,60,450,30};
        getlargest(arr);
    }}

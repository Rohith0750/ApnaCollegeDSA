public class Largest{

     public static void getlargest(int arr[]){
        int largest  = Integer.MIN_VALUE;
        int smallest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest <arr[i]){
                largest=arr[i];

            }
        if(smallest>arr[i]){
            smallest=arr[i];
        }
            

        }
     }

    public static void main(String[] args) {
        int arr []= {20,50,10,60,450,30};
    }}

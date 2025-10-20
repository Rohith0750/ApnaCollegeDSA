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
        

<<<<<<< HEAD:13.Arrays/Largest.java
=======
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
>>>>>>> b37e278036520d197afdc6a77b3956de879574fc:13 ARRAYS/Largest.java
     }

    public static void main(String[] args) {
        int arr []= {20,50,10,60,450,30};
        getlargest(arr);
    }}

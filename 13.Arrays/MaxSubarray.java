public class MaxSubarray {

    public static void maxsubarray(int num[]){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=num[k];
                }
                System.out.println("Currenrt Sum is: "+currentsum);

                if(currentsum>max){
                    max=currentsum;
                }
            }
        }
        System.out.println("Max Subarray Sum is: "+max);

    }

    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        maxsubarray(numbers);
    }
    
}

public class kadaene{

    public static void kadanealgo(int nums[]){
           int ms=Integer.MIN_VALUE;
           int cs=0;

           for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
        if(cs<0){
                cs=0;
            }

            System.out.println("Current Sum is: "+cs);
              if(cs>ms){
            ms=cs;
           }
        System.out.println("Max Subarray Sum is: "+ms);

           }

         
    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanealgo(numbers);
    }
}
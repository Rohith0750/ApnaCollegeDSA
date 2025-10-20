public class reverse {
     
    public static void reverse(int numbers[]){
   int f=0; 
   int l = numbers.length-1;
   while (f<l){
    int temp = numbers[l];
    numbers[l]=numbers[f];
    numbers[f]=temp;

    f++;
    l--;
   }
    }

    public static void main(String[]args){
        int num[]={10,20,30,40,50};
        reverse(num);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
       
    }
}

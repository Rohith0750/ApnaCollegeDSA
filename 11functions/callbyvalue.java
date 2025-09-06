public class callbyvalue {


      public static void swapping(int a  , int b){
        int temp = a;
        a =b;
        b=temp;
        System.out.println("Output in methoeds: "+a);
        System.out.println("Output in methoeds: "+b);
      }
    public static void main(String[]args){
        int a =5;
        int b = 10;
         swapping(a,b);
         System.out.println("Output in main: "+a);
        System.out.println("Output in main: "+b);
    }
    
}


/* 
 This topic is called call by value : When you call a methoed java passes a 
 copy of the variable value to the methoed so any changes inside the methoed 
 happen on the copy not on the original variable.
 */
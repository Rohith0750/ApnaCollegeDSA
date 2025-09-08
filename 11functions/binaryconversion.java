public class binaryconversion {


      public static void binarytodecimal(int n){
        int deci=0;
        int pow=0;

        while(n>0){
            int last_digit=n%10;
            deci=deci+(last_digit*(int)Math.pow(2, pow));
            
            pow++;
            n=n/10;
        }
        System.out.println(deci);

      }

public static void decitobin(int n){
  int bin = 0;
  int pow=0;

  while(n>0){
    int rem=n%2;
    bin = bin +(rem*(int)Math.pow(10, pow));
    pow++;
    n=n/2;
  }

  System.out.println(bin);
}

    public static void main(String[]a){
binarytodecimal(101);
decitobin(5);
    }
    
}

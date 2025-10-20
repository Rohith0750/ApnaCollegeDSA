public class functionsmethoed {
    
    //Write a Java method to compute the average of three numbers..
    
    public static int avgofthree(int a,int b , int c){
        return (a+b+c)/3;
    }

    /* 
       Write a Java program to check if a number is a palindrome in Java? ( 121 is a
        palindrome, 321 is not)
       A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
   palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
    palindrome because the reverse of 321 is 123, which is not equal to 321
     */

  public static void isPalindrome(int n) {
    int temp = n;
    int result = 0;

    while (n != 0) {
        int rem = n % 10;
        result = result * 10 + rem; // fix: shift previous digits left, then add remainder
        n = n / 10;
    }

    if (temp == result) {
        System.out.println("Yes, it's a palindrome");
    } else {
        System.out.println("No, not a palindrome");
    }
}


    //Write a method named isEven that accepts an int argument. The method
//should return true if the argument is even, or false otherwise. Also write a program to test your
//method.

        public static boolean iseven(int n){
          
           if(n%2==0){
            return true;
           }else{
            return false;
           }

        }

    public static void main(String[]args){
        System.out.println( avgofthree(10,110,30));
        System.out.println(iseven(21));
        isPalindrome(121);
    }
}




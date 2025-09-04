import java.util.*;
public class Main {
    

     public static void calculateSum(){
        int a = 10;
        int b=20;
        int c = a+b;
        System.out.println(c);
     }

     // This is a methoed/Functions Without parameter
     /* Syntax of a function
         returntype name(parameters){
         body
         return stmt
         }
      */

      public static  int Suminline(int a , int b){////while creating a function is called parameters/formal parameter
            return a+b;  // This methoed is parameter functions inta,intb are the parameter , return stmt is comuplsory beacuse int is the return type
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HelloWorld");
        calculateSum(); // Like this we should call functions 
     int a = sc.nextInt();
     int b = sc.nextInt();//THos is provide a input to the function in paramater i will provide a,b
       int summ = Suminline(a,b);  //This id how to call parameterized function ,, IF we give the inputs while calling the function is called arguments/actualparameter
       System.out.println(summ);
    }
}

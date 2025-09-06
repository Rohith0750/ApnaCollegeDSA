public class product {

    public static int prod(int a , int b){
        return a*b;
    }


    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;

        }
        return fact;
    }

    public static int binomialcoefiicent(int n , int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int bino_coff= fact_n/(fact_r*fact_nmr);

        return bino_coff;}

    public static boolean primeno(int n){
        boolean isprime=true;
      
        if(n==2){
        isprime=true;
        }
        
        for(int i =2;i<n-1;i++){
            if(n%i==0){
                return false;
                
            }
        }
        return true;
        }


        public static boolean optimizeprime(int n){
            boolean isprime=true;
            if(n==2){
                isprime=true;
            }

            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }

            return true;
        }

    

    public static void main(String[]args){
            
            System.out.println(prod(10,20));
             System.out.println(factorial(7));
             System.out.println(binomialcoefiicent(5,2));
             System.out.println(primeno(10));
             System.out.println(optimizeprime(10));

    }
}


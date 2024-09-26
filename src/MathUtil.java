public class MathUtil {
    static boolean isPrime(int n){
        if (n <= 1) {
           return(false);
        }
    
        if (n <= 3) {
            return(true); 
        }
    
        if (n % 2 == 0 || n % 3 == 0) {
            return(false);
        }
        for (int i = 5; i * i <= n; i += 6) {
    
            if (n % i == 0 || n % (i + 2) == 0) {
                return(false    );
            }
        }
        return(true); 
    }


    static int gcd (int a, int b){
        int result = Math.min(a, b); 
        while (result > 0) { 
            if (a % result == 0 && b % result == 0) { 
                break; 
            } 
            result--; 
        } 
       return(result);
    
    }

    static int lcm(int a, int b){
        
        return(a*b/gcd(a,b));
    }
    
    static int fibonacci(int n){
        int a = 0, b = 1, c, i; 
        if( n == 0) 
            return(a);  
        for(i = 2; i <= n; i++){ 
        c = a + b; 
        a = b; 
        b = c; 
        } 
        return(b);
    }    
    static int factorial(int n)
    {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

    public boolean isPerfectNumber(int n){
        int sum = 1;
 
    
        for (int i = 2; i * i <= n; i++){
            if (n % i==0){
                if(i * i != n) sum = sum + i + n / i;
                else sum = sum + i;
            }
        } 
    
        if (sum == n && n != 1)
            return true;
 
        return false;
    }

    public int sumOfdigits(int n){
        int result =0;
        while(n>0){
            result+=n%10;
            n/=10;
        }
        return(result);
    }

    public int reverseNumber(int n){
        int result = 0;
        while(n>0){
            result=(result*10)+(n%10);
            n/=10;
        }
        return(result);
    }
    
}

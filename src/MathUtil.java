public class MathUtil {
    /*
      Checks if a number is prime.
      A prime number is a number greater than 1 that has no divisors other than 1 and itself.
     */
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
                return(false);
            }
        }
        return(true); 
    }

     /*
      Finds the greatest common divisor (GCD) of two numbers.
      The GCD is the largest number that divides both numbers without leaving a remainder.
     */
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

    /*
     Finds the least common multiple (LCM) of two numbers.
     The LCM is the smallest number that is divisible by both numbers.
     */
    static int lcm(int a, int b){
        
        return(a*b/gcd(a,b));
    }
    
    /*
     * Finds the n-th Fibonacci number.
     * Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, ...
     */
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

    /**
      Finds the factorial of a number.
      The factorial of n is the product of all positive integers less than or equal to n.
     */
    static int factorial(int n)
    {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

     /*
     Checks if a number is a perfect number.
     A perfect number is a number that is equal to the sum of its divisors (excluding itself).
     */
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

    /*
     Calculates the sum of the digits of a number.
     
     */
    public int sumOfDigits(int n){
        int result =0;
        while(n>0){
            result+=n%10;
            n/=10;
        }
        return(result);
    }

       
     /* Reverses the digits of a number.
     
     */
    public int reverseNumber(int n){
        int result = 0;
        while(n>0){
            result=(result*10)+(n%10);
            n/=10;
        }
        return(result);
    }
    
     /**
     * Checks if a number is an Armstrong number.
     * An Armstrong number is a number that is equal to the sum of the cubes of its digits.
     */
    public boolean isArmstrongNumber(int n){

        int originalNum, digit, cubeSum = 0;
        
        originalNum = n;
        while (n!= 0)
        {
            digit = n % 10;
            cubeSum += Math.pow(digit, 3);
            n /= 10;
        }
        if(cubeSum == originalNum)
            return(true);
        else
            return(false);
    }

     /*Finds the next prime number greater than the given number.*/
     
    public int nextPrime(int n){
        int i=0;
        int nw=n+1;
        while (isPrime(nw+i)!=true) {
            i+=1;
        }
        return (nw+i);
    }
}

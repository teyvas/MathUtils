public class Main{
    public static void main(String[] args) {
        
        // Calling static methods directly
  
        System.out.println("isPrime(5): " + MathUtil.isPrime(5));  
        System.out.println("isPrime(15): " + MathUtil.isPrime(15));  
        System.out.println("isPrime(4): " + MathUtil.isPrime(4));    

        System.out.println("gcd(12, 15): " + MathUtil.gcd(12, 15));  
        System.out.println("gcd(100, 20): " + MathUtil.gcd(100, 20)); 
        System.out.println("gcd(17, 13): " + MathUtil.gcd(17, 13));  

        System.out.println("lcm(12, 15): " + MathUtil.lcm(12, 15));  
        System.out.println("lcm(5, 7): " + MathUtil.lcm(5, 7));      
        System.out.println("lcm(10, 20): " + MathUtil.lcm(10, 20)); 

        System.out.println("fibonacci(5): " + MathUtil.fibonacci(5));  
        System.out.println("fibonacci(7): " + MathUtil.fibonacci(7));  
        System.out.println("fibonacci(0): " + MathUtil.fibonacci(0)); 

        System.out.println("factorial(5): " + MathUtil.factorial(5));  
        System.out.println("factorial(7): " + MathUtil.factorial(7));  
        System.out.println("factorial(0): " + MathUtil.factorial(0));  

    
    // For calling non-static methods
        MathUtil calc = new MathUtil();

        System.out.println("isPerfectNumber(6): " + calc.isPerfectNumber(6));  
        System.out.println("isPerfectNumber(28): " + calc.isPerfectNumber(28));  
        System.out.println("isPerfectNumber(12): " + calc.isPerfectNumber(12));  

        System.out.println("sumOfDigits(123): " + calc.sumOfDigits(123));  
        System.out.println("sumOfDigits(999): " + calc.sumOfDigits(999));  
        System.out.println("sumOfDigits(5678): " + calc.sumOfDigits(5678)); 

        System.out.println("reverseNumber(123): " + calc.reverseNumber(123)); 
        System.out.println("reverseNumber(724): " + calc.reverseNumber(724));  
        System.out.println("reverseNumber(500): " + calc.reverseNumber(500));  

        System.out.println("isArmstrongNumber(6): " + calc.isArmstrongNumber(6));  
        System.out.println("isArmstrongNumber(370): " + calc.isArmstrongNumber(370));  
        System.out.println("isArmstrongNumber(153): " + calc.isArmstrongNumber(153));  

        System.out.println("nextPrime(11): " + calc.nextPrime(11));  
        System.out.println("nextPrime(4): " + calc.nextPrime(4));  
        System.out.println("nextPrime(2): " + calc.nextPrime(2));  
    }

}


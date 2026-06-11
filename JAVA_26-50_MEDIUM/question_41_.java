public class question_41_ {
    public static void main(String[] args) {
        int n = 100; // Define your upper limit here
        System.out.println("Prime numbers up to " + n + ":");
        
        // Loop from 2 since 0 and 1 are not prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper method to verify if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Check for factors up to the square root of the number
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it is not prime
            }
        }
        return true; // No factors found, it is prime
    }
}

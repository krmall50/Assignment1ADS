import java.util.List;

public class Problem {
    public int findMin(int[] arr, int n) {
        int min = arr[0]; // Set first element minimum number
        for (int i = 1; i <= n - 1; i++) { // Check other elements
            if (arr[i] < min) { // If other element less than minimum number
                min = arr[i]; // Set this element new minimum
            }
        }
        return min; // Return minimum
    }

    public double findAvg(int[] arr, int n) {
        double avg = 0; // Declare and initialize average
        for (int i = 0; i <= n - 1; i++) { // Go through every element
            avg += arr[i]; // Sum all elements
        }
        return avg / n; // Return average = sum / n
    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) { // Go through numbers [2, n-1]
            if (n % i == 0) { // If number divides N
                return false; // Then it is not Prime
            }
        }
        return true; // If no number in range [2, n-1], then it is Prime
    }

    public int factorial(int n) {
        if (n == 1) { // Base case, if n == 1, then return 1
            return n;
        }
        return n * factorial(n - 1); // recursively  multiply n with factorial (n - 1)
    }

    public int fib(int n) {
        if (n == 0 || n == 1) { // Base case, if n == 1 or 0, then return 1
            return n;
        }
        return fib(n - 1) + fib(n - 2); // recursively sum fib(n - 1) and fib(n - 2)
    }

    public int power(int n, int k) {
        if (k == 1) { // Base case, if k == 1, return n, if return k, result will be wrong (power will be one less)
            return n;
        }
        return n * power(n, k - 1); // recursively multiply b with  power(n, k - 1)
    }

    public int[] reverse(int start, int end, int[] arr) {
        if (start >= end) { // Base case, if all elements swapped, return reversed array
            return arr;
        }
        int temp = arr[start]; // Swap first and last elements
        arr[start] = arr[end-1];
        arr[end-1] = temp;

        return reverse(start+1, end-1, arr); // recursively swap elements until base case triggered
    }

    public boolean isAllDigit(String s){
        if (s.isEmpty()){
            return true;
        }
        return false;
    }

}

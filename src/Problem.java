public class Problem {
    public int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public double findAvg(int[] arr, int n) {
        double avg = 0;
        for (int i = 0; i <= n - 1; i++) {
            avg += arr[i];
        }
        return avg / n;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

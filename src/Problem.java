public class Problem {
    public int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i<=n-1; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}

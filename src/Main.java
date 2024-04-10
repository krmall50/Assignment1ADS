import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Problem problem = new Problem();
        System.out.println("Problem 1:");
        int[] arr = {3,2,4,1};
        int n = 4;
        int min = problem.findMin(arr, n);
        System.out.println(min);

        System.out.println("Problem 2:");
        int[] arr1 = {3,2,4,1};
        int n1 = 4;
        double avg = problem.findAvg(arr1, n1);
        System.out.println(avg);

        System.out.println("Problem 3:");
        System.out.println(problem.isPrime(87));

        System.out.println("Problem 4:");
        System.out.println(problem.factorial(5));

        System.out.println("Problem 5:");
        System.out.println(problem.fib(17));

        System.out.println("Problem 6:");
        System.out.println(problem.power(2,10));

        System.out.println("Problem 7:");
        int[] arr2 = {1, 4, 6, 2};
        int start = 0;
        int end = 4;
        System.out.println(Arrays.toString(problem.reverse(start, end, arr2)));

        System.out.println("Problem 8:");
        System.out.println(problem.isAllDigit("123a12"));
        }



}
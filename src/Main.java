//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Problem problemOne = new Problem();
        int[] arr = {2,9,7,3,4};
        int n = 5;
        int min = problemOne.findMin(arr, n);
        System.out.println(min);
        }
}
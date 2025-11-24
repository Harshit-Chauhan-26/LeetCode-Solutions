import java.util.Scanner;

public class Leetcode53 {
    public static void kadane(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max Subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        kadane(numbers);
    }
}

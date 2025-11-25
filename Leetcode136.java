import java.util.*;

public class Leetcode136 {
    public static int singleElement(int[] nums) {
        int single = nums[0];

        for (int i = 1; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleElement(nums));
    }
}

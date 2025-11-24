import java.util.*;

public class Leetcode217 {
    public static boolean containsDuplicate(int[] nums) {

        // USING CONVENTIONAL & BRUTE FORCE
        // for (int i = 0; i < nums.length - 1; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // return true;
        // }
        // }
        // }
        // return false;

        // USING HASHSET
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }
}
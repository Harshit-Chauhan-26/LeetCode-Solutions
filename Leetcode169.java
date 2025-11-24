import java.util.Scanner;

public class Leetcode169 {
    public static int MajorityElement(int[] nums) {
        int majority = nums[0], votes = 1;
        for (int i = 0; i < nums.length; i++) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
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
        System.out.println(MajorityElement(nums));
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        int nums[] = { 70, 10, 20, 90, 30, 40, 50 };
        int max = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("The maximum element is: " + max);
    }
}

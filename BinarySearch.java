import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number you wanna search");
        int target = sc.nextInt();
        int result = binary(nums, target);
        if (result != -1) {
            System.out.println("The target found at the index: " + result);
        } else {
            System.out.println("The target is not there in the list");
        }
    }

    public static int binary(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

//BINARY SEARCH USING RECURSION 

// public class BinarySearch {
//     public static void main(String[] args) {
//         int nums[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the target number you wanna search");
//         int target = sc.nextInt();

//         int result = binary(nums, target, 0, nums.length - 1);

//         if (result != -1) {
//             System.out.println("The target found at the index: " + result);
//         } else {
//             System.out.println("The target is not there in the list");

//         }
//     }

//     public static int binary(int nums[], int target, int left, int right) {

//         int mid = (left + right) / 2;
//         if (nums[mid] == target) {
//             return mid;
//         }
//         else if(nums[mid]<target){
//             return binary(nums, target, mid+1, right);
//         }
//         else{
//             return binary(nums, target, left, mid-1);
//         }
//     }
// }

// TIME COMPLEXITY = O(log n) ------ logarithmic time
// SPACE COMPLEXITY = O(1) ------ constant space
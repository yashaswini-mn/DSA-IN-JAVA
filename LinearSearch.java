import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch lns = new LinearSearch();
        System.out.println(lns.linear());

    }

    public int linear() {
        int Array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int n = Array.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target you wanna search..!");
        int target = sc.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            if (Array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}


//SPACE COMPLEXITY = O(1)  -----   constant space complexity / no increment or decrement in the size of an array
//TIME COMPLEXITY = O(n)   -----   Linearly iterating

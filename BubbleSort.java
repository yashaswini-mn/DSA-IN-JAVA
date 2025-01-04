public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 10, 40, 50, 20, 30, 70, 60 };
        int temp;
        for (int i = 0; i <= arr.length -1; i++) {
            for(int j = 0; j<arr.length-i-1;j++){
            if (arr[j] > arr[j
            
             + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

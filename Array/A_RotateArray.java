import java.util.Arrays;

class A_RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] arr, int s, int e){
        while(e > s){
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
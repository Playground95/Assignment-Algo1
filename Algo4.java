import java.util.Arrays;

public class Algo4 {
    
    public static void main(String[] args) {
        
        int[] nums = { 10, 20, 30, 40, 50 };

        int temp1;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 - i) {
                temp1 = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = nums[i];
                nums[i] = temp1;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}

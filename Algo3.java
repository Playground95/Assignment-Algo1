public class Algo3 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50};

        int[] newArray = new int[nums.length];

        for(int i = 0; i< nums.length; i++){

            newArray[i] = nums[nums.length-1 -i];
        }
        
        nums = newArray;

        for(int x = 0; x<nums.length; x++){
            System.out.println(nums[x]);
        }
    }
}

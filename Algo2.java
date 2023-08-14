import java.util.Scanner;

public class Algo2 {
    
    private static final Scanner scanner =  new Scanner(System.in);
public static void main(String[] args) {

    int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        boolean repeat ;

        do{
            repeat = false;
            for(int i = 1; i< nums.length; i++){

                if(nums[i-1]>nums[i]){

                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
                repeat = true;

            }

            }
   
        }while(repeat);

        System.out.println("Smallest number in the array: " + nums[0]);
        System.out.println("Largest number in the array: " + nums[nums.length-1]);
    
}
}

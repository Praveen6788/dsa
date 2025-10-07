import java.util.Arrays;

public class removesups {

    static void remove(int[]  nums){

        int j=0;
        int i=0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;

            }
            else{
                if(j<nums.length){
                    int temp =nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
                j++;
                

                }
                

            }
            
        }
        System.out.println(Arrays.toString(nums));

        // for(int j=1;j<nums.length;j++){
        //     if(nums[i]!=nums[j]){
        //         nums[i+1]=nums[j];
        //         i++;
        //     }
        // }
        // System.out.println(Arrays.toString(nums));


    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        remove(nums);
        
    }
}

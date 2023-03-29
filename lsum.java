public class lsum {
    static int nums[]={2,7,11,15};
    static int target=9;
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                if(nums[i]+nums[j]==9)
                {
                    System.out.println(nums[i]+","+nums[j]);
                    break;
                } 
            }
            

        }
        return nums;
    }
    public static void main(String[] args) {

        int[] indices = twoSum(nums, target);

     /*    if (indices.length == 2) {
            System.out.println(nums[0] + " " + nums[1]);
        } else {
            System.out.println("No solution found!");
        }*/
        lsum ls = new lsum();
        ls.twoSum(nums, target);
        

       
    }
    
}

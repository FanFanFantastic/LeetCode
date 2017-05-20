public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] solution = new int[2];
        boolean found = false;
        for(int i = 0; i < nums.length;i++)
        {
            for( int j = 0; j < nums.length;j++)
            {
                if( i == j)
                    continue;
                
                if((nums[i]+nums[j]) == target)
                {
                    solution[0] = i;
                    solution[1]= j;
                    found = true;
                    break;
                }
            }
            
            if(found == true)
                break;
        }
        System.out.println(solution[0]);
        System.out.println(solution[1]);
        return solution;   
    }
}
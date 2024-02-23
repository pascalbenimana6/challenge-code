public class Q0027_RemoveElement {
    public int removeElement(int[] nums, int val){

        int k = nums.length;
        for(var i=0; i<k; i++){
            if(nums[i] == val) {
                while(nums[k-1] == val)
                    k--;
                nums[i] = nums[k-1];
                nums[k-1] = val;
                k--;
            }
        }
        return k;
    }
}

public class Q0027_RemoveElement {
    public int removeElement(int[] nums, int val){
        int n= nums.length;
        int k = 0;
        for(var i=0; i<n; i++){
            if(nums[i]!=val)
                nums[k++] = nums[i];
        }
        return k;
    }
}

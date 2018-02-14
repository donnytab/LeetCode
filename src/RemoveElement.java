
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        for(int num : nums) {
            if(num == val)
            	size--;
        }
        return size;
    }
    
    public static void main(String[] args) {
    	int test[] = {1,0,6,7,1,4};
    	System.out.println(removeElement(test,1));
    }
}

import java.util.ArrayList;
import java.util.Arrays;

/*
 1. What if the given array is already sorted? How would you optimize your algorithm?
 2. What if nums1's size is small compared to nums2's size? Which algorithm is better?
 3. What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

public class IntersectionOfTwoArraysNotDistinct {
	public int[] intersect(int[] nums1, int[] nums2) {
		int ptr1 = 0, ptr2 = 0;
		ArrayList<Integer> result = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		while(ptr1<nums1.length && ptr2<nums2.length) {
			if(nums1[ptr1] < nums2[ptr2]) {
				ptr1++;
			} else if(nums1[ptr1] > nums2[ptr2]) {
				ptr2++;
			} else {
				// find intersection
				result.add(nums1[ptr1]);
				ptr1++;
				ptr2++;
			}
		}
		
		int[] output = new int [result.size()];
		for(int i=0; i<result.size(); i++) {
			output[i] = result.get(i);
		}
		return output;
	}
}

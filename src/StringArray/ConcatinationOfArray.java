package StringArray;

public class ConcatinationOfArray {
	  public static int[] getConcatenation(int[] nums) {
	        int n = nums.length;
	        int[] ans = new int[2 * n];
	        
	        for (int i = 0; i < n; i++) {
	            ans[i] = nums[i];       // first half
	            ans[i + n] = nums[i];   // second half
	        }
	        return ans;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 1};
	        int[] ans1 = getConcatenation(nums1);
	        System.out.print("Output: ");
	        for (int num : ans1) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        int[] nums2 = {1, 3, 2, 1};
	        int[] ans2 = getConcatenation(nums2);
	        System.out.print("Output: ");
	        for (int num : ans2) {
	            System.out.print(num + " ");
	        }
	    }
}

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer, Integer> h = new TreeMap<>(Collections.reverseOrder()); // Max-heap behavior
        int i = 0;
        int j = 0;
        ArrayList<Integer> a = new ArrayList<>();

        while (j < nums.length) {
            // Insert the current element into the TreeMap
            h.put(nums[j], h.getOrDefault(nums[j], 0) + 1);
            
            // If the window size exceeds k, remove the element at index i
            if (j - i + 1 > k) {
                h.put(nums[i], h.get(nums[i]) - 1);
                if (h.get(nums[i]) == 0) {
                    h.remove(nums[i]);
                }
                i++; // Slide the window by incrementing i
            }

            // When the window size is exactly k, record the maximum
            if (j - i + 1 == k) {
                a.add(h.firstKey()); // The largest element is at the front in reverse order
            }

            j++; // Expand the window by moving j
        }

        // Convert ArrayList to an array for the result
        int[] ans = new int[a.size()];
        for (i = 0; i < a.size(); i++) {
            ans[i] = a.get(i);
        }

        return ans;
    }
}

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        // List to store all valid quadruplets
        List<List<Integer>> res = new ArrayList<>();

        // Sort the array so that we can use the two-pointer approach
        Arrays.sort(nums);

        // Select the first element of the quadruplet
        for (int i = 0; i < nums.length - 3; i++) {

            // Skip duplicate values for the first element
            // to avoid duplicate quadruplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Select the second element of the quadruplet
            for (int j = i + 1; j < nums.length - 2; j++) {

                // Skip duplicate values for the second element
                // to avoid duplicate quadruplets
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Initialize two pointers
                // left starts after j
                // right starts from the end of the array
                int left = j + 1;
                int right = nums.length - 1;

                // Find the remaining two numbers using two pointers
                while (left < right) {

                    // Use long to avoid integer overflow
                    long currSum =
                            (long) nums[i] + nums[j] + nums[left] + nums[right];

                    // If the required target is found
                    if (currSum == target) {

                        // Store the quadruplet in the result
                        res.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        // Move both pointers
                        left++;
                        right--;

                        // Skip duplicate values for the third element
                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate values for the fourth element
                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }

                    // Current sum is too small, increase it
                    else if (currSum < target) {
                        left++;
                    }

                    // Current sum is too large, decrease it
                    else {
                        right--;
                    }
                }
            }
        }

        // Return all unique quadruplets
        return res;
    }
}
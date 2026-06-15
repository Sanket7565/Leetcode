class Solution {
    public int strStr(String haystack, String needle) {

        // 'left' represents the starting index in haystack
        // from where we are trying to match the needle.
        int left = 0;

        // 'right' is used to traverse haystack from the current starting position.
        int right = 0;

        // 'i' is used to traverse the needle.
        int i = 0;

        // Keep searching until right reaches the end of haystack.
        while (right < haystack.length()) {

            // If current characters match
            if (needle.charAt(i) == haystack.charAt(right)) {

                // Move to the next character in both strings
                right++;
                i++;

                // If we have matched all characters of needle,
                // return the starting index.
                if (i == needle.length()) {
                    return left;
                }

            } else {

                // Mismatch occurred.

                // Move the starting position to the next index.
                left++;

                // Start comparing again from the new starting position.
                right = left;

                // Reset needle pointer to its beginning.
                i = 0;
            }
        }

        // Needle was not found in haystack.
        return -1;
    }
}
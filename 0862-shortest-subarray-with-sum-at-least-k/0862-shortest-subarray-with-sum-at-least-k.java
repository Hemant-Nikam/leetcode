
class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        long[] prefix = new long[n + 1];

        for(int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();

        int len = Integer.MAX_VALUE;

        for(int i = 0; i <= n; i++) {

            // Check whether current subarray sum >= k
            while(!dq.isEmpty() &&
                  prefix[i] - prefix[dq.peekFirst()] >= k) {

                len = Math.min(len, i - dq.removeFirst());
            }

            // Maintain increasing prefix sums
            while(!dq.isEmpty() &&
                  prefix[dq.peekLast()] >= prefix[i]) {

                dq.removeLast();
            }

            dq.addLast(i);
        }

        return len == Integer.MAX_VALUE ? -1 : len;
    }
}

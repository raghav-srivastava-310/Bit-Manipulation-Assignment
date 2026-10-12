public class Single_Number {
        public static int singleNumber(int[] nums) {
            int ans = 0;
            for(int val : nums){
                ans = ans ^ val;
            }
            return ans;
        }
}

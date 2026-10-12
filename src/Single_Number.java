public class Single_Number {
        public static int singleNumber(int[] nums) {
            int ans = 0;
            for(int val : nums){
                ans = ans ^ val;
            }
            return ans;
        }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,1,2,3,3,4}));
    }
}

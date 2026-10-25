public class CountBits {
        public int[] countBits(int n) {
            int[] ans = new int[n+1];
            ans[0] = 0;
            for(int i = 1;i<=n;i++){
                ans[i] = countOneBits(i);
            }
            return ans;
        }
        int countOneBits(int n){
            int count =0;
            while(n>0){
                n = n & (n-1);
                count++;
            }
            return count;
        }

}

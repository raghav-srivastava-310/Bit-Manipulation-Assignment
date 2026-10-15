class PrimeNumberOfSetBits {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i = left;i<=right;i++){
            int count = countSetBits(i);
            if(checkPrime(count)){
                ans++;
            }
        }
        return ans;
    }
    boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    int countSetBits(int n){ // Find Count Bits through Brian Keringhan's Algorithm T.C is O(no.of set bits)
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}